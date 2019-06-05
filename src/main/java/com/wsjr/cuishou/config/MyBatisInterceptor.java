package com.wsjr.cuishou.config;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;

/**
 * @Description: java类作用描述
 * @Author: luqihua
 * @CreateDate: 2019/6/4$ 22:44$
 *
 *
<plugins>
<!--这里配置拦截器-->
<plugin interceptor="...MyBatisInterceptor"/>

</plugins>
 *
 */

@Component
@Intercepts({@Signature(type = Executor.class, method = "update", args ={MappedStatement.class, Object.class})})
public class MyBatisInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement  = (MappedStatement) invocation.getArgs()[0];
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        Object entity = invocation.getArgs()[1];
        Class<?> classz = entity.getClass();

        //当为插入时
        if (SqlCommandType.INSERT.equals(sqlCommandType)) {
            //获取id并插入
            Field id = classz.getDeclaredField("id");
            if (null != id) {
                id.setAccessible(true);
                id.set(entity, UUID.randomUUID().toString().replace("-", "").toLowerCase());
            }
            //获取createTime并插入
            Field createDate = classz.getDeclaredField("createDate");
            if (null != createDate) {
                createDate.setAccessible(true);
                createDate.set(entity, new Date());
            }
            //获取createBy并插入
            Field createBy = classz.getDeclaredField("createBy");
            if (null != createBy) {
                createBy.setAccessible(true);
                createBy.set(entity, "luqihua");
            }
        }
        //当为插入或更新时
        if (SqlCommandType.UPDATE.equals(sqlCommandType) || SqlCommandType.INSERT.equals(sqlCommandType)) {
            //获取更新时间并插入
            Field updateDate = classz.getDeclaredField("updateDate");
            if (null != updateDate) {
                updateDate.setAccessible(true);
                updateDate.set(entity, new Date());
            }
            //获取updateBy并插入
            Field updateBy = classz.getDeclaredField("updateBy");
            if (null != updateBy) {
                updateBy.setAccessible(true);
                updateBy.set(entity, "luqihua");
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
