/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : localhost:3306
 Source Schema         : cuishou

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 24/05/2019 13:54:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `label` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sort` decimal(10, 0) NOT NULL,
  `parent_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_date` datetime NOT NULL,
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `update_date` datetime NOT NULL,
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `sys_dict_value`(`value`) USING BTREE,
  INDEX `sys_dict_label`(`label`) USING BTREE,
  INDEX `sys_dict_del_flag`(`del_flag`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_dict
-- ----------------------------
INSERT INTO `sys_dict` VALUES ('appOrg00', 'app', 'APP', 'appOrg', '机构', 5, NULL, '0', '2019-05-13 17:44:11', '0', '2019-05-13 17:44:11', NULL, '0');
INSERT INTO `sys_dict` VALUES ('appOrg01', '01', '网商', 'appOrg', '机构', 1, NULL, '0', '2019-05-13 17:43:02', '0', '2019-05-13 17:43:02', NULL, '0');
INSERT INTO `sys_dict` VALUES ('appOrg02', '02', '九康', 'appOrg', '机构', 2, NULL, '0', '2019-05-13 17:43:18', '0', '2019-05-13 17:43:18', NULL, '0');
INSERT INTO `sys_dict` VALUES ('appOrg03', '03', '分蛋', 'appOrg', '机构', 3, NULL, '0', '2019-05-13 17:43:27', '0', '2019-05-13 17:43:27', NULL, '0');
INSERT INTO `sys_dict` VALUES ('appOrg04', '04', '嘉禾', 'appOrg', '机构', 4, NULL, '0', '2019-05-13 17:43:37', '0', '2019-05-13 17:43:37', NULL, '0');

SET FOREIGN_KEY_CHECKS = 1;
