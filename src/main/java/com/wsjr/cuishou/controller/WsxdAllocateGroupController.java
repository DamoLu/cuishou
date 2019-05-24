package com.wsjr.cuishou.controller;

import com.wsjr.cuishou.entity.WsxdAllocateGroup;
import com.wsjr.cuishou.entity.WsxdAllocateGroupExample;
import com.wsjr.cuishou.mapper.WsxdAllocateGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/lxcs-admin")
public class WsxdAllocateGroupController {

    @Autowired
    WsxdAllocateGroupMapper wsxdAllocateGroupMapper;

    @GetMapping("list")
    public String list(ModelMap modelMap) {
        List<WsxdAllocateGroup> wsxdAllocateGroups = wsxdAllocateGroupMapper.selectByExample(new WsxdAllocateGroupExample());
        WsxdAllocateGroup wsxdAllocateGroup = wsxdAllocateGroups.get(0);
        modelMap.addAttribute(wsxdAllocateGroup);
        return  "lxcs/list";
    }

}
