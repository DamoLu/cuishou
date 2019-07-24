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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Controller
@RequestMapping("lxcs-admin")
public class WsxdAllocateGroupController {

    @Autowired
    WsxdAllocateGroupMapper wsxdAllocateGroupMapper;

    @Autowired
    WsxdAllocateGroupScopeMapper wsxdAllocateGroupScopeMapper;

    @GetMapping("list")
    public String list(ModelMap modelMap) {
      //  WsxdAllocateGroup wsxdAllocateGroup = new WsxdAllocateGroup();
        WsxdAllocateGroup wsxdAllocateGroup = wsxdAllocateGroupMapper.selectByPrimaryKey("01");
      //  wsxdAllocateGroup.setId("f340910ef59a4a2cb3d1e0d9466b9830");
        wsxdAllocateGroup.setGroupName("处理组33333");
        wsxdAllocateGroup.setOdvs("01|02|03");
        wsxdAllocateGroup.setOdvsName("damo|rachel|anna");
        wsxdAllocateGroup.setMinOverdueDay(1);
        wsxdAllocateGroup.setMaxOverdueDay(100);
        wsxdAllocateGroup.setStatus("1");
        wsxdAllocateGroup.setMaxOverdueDay(1254);
        wsxdAllocateGroupMapper.updateByPrimaryKey(wsxdAllocateGroup);
        return  "lxcs/list";
    }


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.wsjr.cuishou.entity.WsxdAllocateGroup");
        Class<?> superclass = clazz.getSuperclass();
        Method[] methods = superclass.getMethods();
        Optional<Method> cra = Stream.of(methods).filter(method -> method.getName().equals("cra")).findAny();
        Method hello = superclass.getMethod("hello", null);
        System.out.println(superclass);
    }
}
