package com.wsjr.cuishou.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 卢其华
 * @title: CreateTime
 * @projectName cuishou
 * @description: TODO
 * @date 2019/6/4
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface CreateTime {
    String value() default "";
}
