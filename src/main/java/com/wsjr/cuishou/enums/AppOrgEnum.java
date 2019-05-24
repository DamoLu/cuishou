package com.wsjr.cuishou.enums;

public enum AppOrgEnum implements CodeEnum{

    appOrg1("01", "网商"), appOrg2("02", "九康"),
    appOrg3("03", "分蛋"), appOrg4("04", "嘉禾");
     private String name;
     private String code;

    private AppOrgEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
