package com.wsjr.cuishou.controller;

import com.wsjr.cuishou.entity.WsxdAllocateGroup;
import com.wsjr.cuishou.entity.WsxdAllocateGroupScope;
import com.wsjr.cuishou.mapper.WsxdAllocateGroupMapper;
import com.wsjr.cuishou.mapper.WsxdAllocateGroupScopeMapper;
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

    @Autowired
    WsxdAllocateGroupScopeMapper wsxdAllocateGroupScopeMapper;

    @GetMapping("list")
    public String list(ModelMap modelMap) {
        List<WsxdAllocateGroupScope> wsxdAllocateGroupScopeList = wsxdAllocateGroupScopeMapper.selectByGroupId("1");
        WsxdAllocateGroup wsxdAllocateGroup = wsxdAllocateGroupMapper.selectByPrimaryKey("1");
        return  "lxcs/list";
    }

}
