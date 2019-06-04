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
@RequestMapping("lxcs-admin")
public class WsxdAllocateGroupController {

    @Autowired
    WsxdAllocateGroupMapper wsxdAllocateGroupMapper;

    @Autowired
    WsxdAllocateGroupScopeMapper wsxdAllocateGroupScopeMapper;

    @GetMapping("list")
    public String list(ModelMap modelMap) {
        WsxdAllocateGroup wsxdAllocateGroup = new WsxdAllocateGroup();
        wsxdAllocateGroup.setGroupName("处理组12211");
        wsxdAllocateGroup.setOdvs("01|02|03");
        wsxdAllocateGroup.setOdvsName("damo|rachel|anna");
        wsxdAllocateGroup.setMinOverdueDay(1);
        wsxdAllocateGroup.setMaxOverdueDay(100);
        wsxdAllocateGroup.setStatus("1");
        wsxdAllocateGroup.setMaxOverdueDay(1254);
        wsxdAllocateGroupMapper.insert(wsxdAllocateGroup);
        return  "lxcs/list";
    }

}
