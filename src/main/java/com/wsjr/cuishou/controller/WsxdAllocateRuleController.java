package com.wsjr.cuishou.controller;

import com.alibaba.fastjson.JSONObject;
import com.wsjr.cuishou.entity.WsxdAllocateRule;
import com.wsjr.cuishou.mapper.WsxdAllocateRuleMapper;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: java类作用描述
 * @Author: luqihua
 * @CreateDate: 2019/5/19$ 16:26$
 */
@Controller
@RequestMapping("/lxcs")
public class WsxdAllocateRuleController {
    @Autowired
    WsxdAllocateRuleMapper wsxdAllocateRuleMapper;

    @GetMapping("/list")
    public String list() {
        return "lxcs/list";
    }

    @GetMapping("/operation")
    public JSONObject operation(String operation, Integer num) {
        WsxdAllocateRule wsxdAllocateRule = wsxdAllocateRuleMapper.selectByNum(num);
        switch (operation) {
            case "up":
                //找到前一个进行num值交换
                WsxdAllocateRule wsxdAllocateRule1 = wsxdAllocateRuleMapper.selectByNum(num - 1);
                wsxdAllocateRule1.setNum(num);
                wsxdAllocateRuleMapper.updateByPrimaryKeySelective(wsxdAllocateRule1);
                wsxdAllocateRule.setNum(num-1);
                wsxdAllocateRuleMapper.updateByPrimaryKeySelective(wsxdAllocateRule);
                break;

            case "down":
                //找到下一个进行值交换
                WsxdAllocateRule wsxdAllocateRule2 = wsxdAllocateRuleMapper.selectByNum(num + 1);
                wsxdAllocateRule2.setNum(num);
                wsxdAllocateRuleMapper.updateByPrimaryKeySelective(wsxdAllocateRule2);
                wsxdAllocateRule.setNum(num+1);
                wsxdAllocateRuleMapper.updateByPrimaryKeySelective(wsxdAllocateRule);
                break;
        }
        return new JSONObject();
    }

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("01", "my");
        hashMap.put("02", "name");
        hashMap.put("03", "liming");

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        System.out.println(entries);
    }

}
