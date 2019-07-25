package com.wsjr.cuishou.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**  https://www.cnblogs.com/pcheng/p/9629621.html
 * @author luqihua
 * @title: RSAUtils
 * @projectName cuishou
 * @description: TODO
 * @date 2019/7/24
 */
public class RSAUtils {

    /**
     * PS:RSA加密对明文的长度有所限制，规定需加密的明文最大长度=密钥长度-11（单位是字节，即byte），
     * 所以在加密和解密的过程中需要分块进行。而密钥默认是1024位，即1024位/8位-11=128-11=117字节。
     * 所以默认加密前的明文最大长度117字节，解密密文最大长度为128字。那么为啥两者相差11字节呢？
     * 是因为RSA加密使用到了填充模式（padding），即内容不足117字节时会自动填满，用到填充模式自然会占用一定的字节，
     * 而且这部分字节也是参与加密的。
     * RSA最大加密明文大小
     */
    private static final int MAX_ENCRYPT_BLOCK = 117;
    /**
    * RSA最大解密密文大小
    */
    private static final int MAX_DECRYPT_BLOCK = 128;


    /**
    　　* @description: 获取密钥对
    　　* @author luqihua
    　　* @date 2019/7/24 14:38
    　　*/
    public static KeyPair getKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        //设置密钥长度
        keyPairGenerator.initialize(1024);
        return keyPairGenerator.generateKeyPair();
    }

    /**
    　　* @description: 获取私钥
    　　* @author luqihua
    　　* @date 2019/7/24 15:24
    　　*/
    public static PrivateKey getPrivateKey(String privateKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] decodeKey = Base64.decodeBase64(privateKey.getBytes());
        PKCS8EncodedKeySpec encodedKeySpec = new PKCS8EncodedKeySpec(decodeKey);
        return keyFactory.generatePrivate(encodedKeySpec);
    }

    /**
    　　* @description: 获取公钥
    　　* @author luqihua
    　　* @date 2019/7/24 16:01
    　　*/
    public static PublicKey getPublicKey(String publicKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] decodeKey = Base64.decodeBase64(publicKey.getBytes());
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(decodeKey);
        return keyFactory.generatePublic(x509EncodedKeySpec);
    }

    /**
    　　* @description: 对数据进行加密
    　　* @author luqihua
    　　* @date 2019/7/24 17:23
    　　*/
    public static String encrypt(String data, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        int inputLen = data.getBytes().length;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int offset = 0;
        int i = 0;
        byte[] cache;
        // 对数据分段加密
        while (inputLen - offset > 0) {
            if (inputLen - offset > MAX_ENCRYPT_BLOCK) {
                cache = cipher.doFinal(data.getBytes(), offset, MAX_ENCRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(data.getBytes(), offset, inputLen - offset);
            }
            outputStream.write(cache, 0, cache.length);
            i++;
            offset = i*MAX_ENCRYPT_BLOCK;
        }
        byte[] encryptedData = outputStream.toByteArray();
        outputStream.close();
        //获取加密内容使用base64进行编码,并以UTF-8为标准转化成字符串
        return new String (Base64.encodeBase64(encryptedData));
    }

    /**
    　　* @description: 对数据进行解密
    　　* @author luqihua
    　　* @date 2019/7/24 18:07
    　　*/
    public static String decrypt(String data, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] dataByte = Base64.decodeBase64(data.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int inputLen = dataByte.length;
        int offset = 0;
        int i = 0;
        byte[] cache;
        while (inputLen - offset > 0) {
            if (inputLen - offset > MAX_DECRYPT_BLOCK) {
                cache = cipher.doFinal(dataByte, offset, MAX_DECRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(dataByte, offset, inputLen - offset);
            }
            out.write(cache, 0, cache.length);
            i++;
            offset = i*MAX_DECRYPT_BLOCK;
        }
        byte[] decrptedData = out.toByteArray();
        out.close();
        return new String(decrptedData, StandardCharsets.UTF_8);
    }

    /**
    　　* @description: 签名
    　　* @author luqihua
    　　* @date 2019/7/25 9:22
    　　*/
    public static String sign(String data, PrivateKey privateKey) throws Exception{
        byte[] privateKeyEncoded = privateKey.getEncoded();
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKeyEncoded);
        PrivateKey key = KeyFactory.getInstance("RSA").generatePrivate(keySpec);
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(key);
        signature.update(data.getBytes());
        return new String(Base64.encodeBase64(signature.sign()));
    }

    /**
    　　* @description: 验签
    　　* @author luqihua
    　　* @date 2019/7/25 11:29
        * @param srcData: 原始字符串
    　　*/
    public static boolean verify(String srcData, PublicKey publicKey, String sign) throws Exception{
        byte[] publicKeyEncoded = publicKey.getEncoded();
        X509EncodedKeySpec encodedKeySpec = new X509EncodedKeySpec(publicKeyEncoded);
        PublicKey key = KeyFactory.getInstance("RSA").generatePublic(encodedKeySpec);
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initVerify(key);
        signature.update(srcData.getBytes());
       return signature.verify(Base64.decodeBase64(sign.getBytes()));
    }

    public static void main(String[] args) throws Exception{
        KeyPair keyPair = getKeyPair();
        String privateKey = new String(Base64.encodeBase64(keyPair.getPrivate().getEncoded()));
        String publicKey = new String(Base64.encodeBase64(keyPair.getPublic().getEncoded()));
        System.out.println("私钥" + privateKey);
        System.out.println("公钥" + publicKey);
        //RSA 加密
        String data = "有人的地方就有江湖";
        String encryptData = encrypt(data, getPublicKey(publicKey));
        System.out.println("加密后内容:" + encryptData);

        //RSA 解密
        String decryptData = decrypt(encryptData, getPrivateKey(privateKey));
        System.out.println("解密后内容:" + decryptData );

        //RSA 签名
        String signature = "DamoLu";
        String sign = sign(signature, getPrivateKey(privateKey));
        System.out.println("签名"+ sign);

        //RSA 验签
        boolean result = verify(signature, getPublicKey(publicKey), sign);
        System.out.println("验签结果:" + result);
    }
}
