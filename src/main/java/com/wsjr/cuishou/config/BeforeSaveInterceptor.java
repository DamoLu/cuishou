package com.wsjr.cuishou.config;

import com.wsjr.cuishou.annotation.*;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Properties;

/**
 * @author 卢其华
 * @title: BeforeSaveInterceptor
 * @projectName cuishou
 * @description: TODO
 * @date 2019/6/4
 */
//使用@Intercepts标注这是个mybatis插件，@Signature标注要拦截的操作
@Intercepts({@Signature(type = Executor.class, method = "update", args ={MappedStatement.class, Object.class})})
public class BeforeSaveInterceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement  = (MappedStatement) invocation.getArgs()[0];
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        Object entity = invocation.getArgs()[1];

        //获取所有成员变量
        Field[] declaredFields = entity.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                if (null != field.getAnnotation(CreateTime.class)) {
                    field.setAccessible(true);
                    field.set(entity, new Date());
                }
                if (null != field.getAnnotation(CreateBy.class)) {
                    field.setAccessible(true);
                    field.set(entity, "luqihua");
                }
                if (null != field.getAnnotation(UUID.class)) {
                    field.setAccessible(true);
                    field.set(entity, java.util.UUID.randomUUID());
                }
            }

            if (SqlCommandType.UPDATE.equals(sqlCommandType) || SqlCommandType.INSERT.equals(sqlCommandType)) {
                if (null != field.getAnnotation(UpdateTime.class)) {
                    field.setAccessible(true);
                    field.set(entity, new Date());
                }
                if (null != field.getAnnotation(UpdateBy.class)) {
                    field.setAccessible(true);
                    field.set(entity, "luqihua");
                }
            }
        }

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
