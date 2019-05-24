package com.wsjr.cuishou.enums;

public enum AppOrgEnum implements CodeEnum{

    a("01", "网商"), b("02", "九康"), c("03", "分蛋"), d("04", "嘉禾");
    private String code;
    private String name;
    private AppOrgEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getCode() {
        return null;
    }
}
