package com.wsjr.cuishou.utils;

import com.wsjr.cuishou.enums.CodeEnum;

public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(String code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (each.getCode().equals(code)) {
                return each;
            }
        }
        return null;
    }
}
