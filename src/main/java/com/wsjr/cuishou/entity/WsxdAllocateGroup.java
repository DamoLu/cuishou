package com.wsjr.cuishou.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wsjr.cuishou.enums.AppOrgEnum;
import com.wsjr.cuishou.utils.EnumUtil;

import java.util.Date;

public class WsxdAllocateGroup {
    private String id;

    private String groupName;

    private String odvs;

    private String odvsName;

    private Integer minOverdueDay;

    private Integer maxOverdueDay;

    private String appOrg;

    private String status;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getOdvs() {
        return odvs;
    }

    public void setOdvs(String odvs) {
        this.odvs = odvs == null ? null : odvs.trim();
    }

    public String getOdvsName() {
        return odvsName;
    }

    public void setOdvsName(String odvsName) {
        this.odvsName = odvsName == null ? null : odvsName.trim();
    }

    public Integer getMinOverdueDay() {
        return minOverdueDay;
    }

    public void setMinOverdueDay(Integer minOverdueDay) {
        this.minOverdueDay = minOverdueDay;
    }

    public Integer getMaxOverdueDay() {
        return maxOverdueDay;
    }

    public void setMaxOverdueDay(Integer maxOverdueDay) {
        this.maxOverdueDay = maxOverdueDay;
    }

    public String getAppOrg() {
        return appOrg;
    }

    public void setAppOrg(String appOrg) {
        this.appOrg = appOrg == null ? null : appOrg.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    @JsonIgnore
    public AppOrgEnum getAppOrgEnum() {
        return EnumUtil.getByCode(appOrg, AppOrgEnum.class);
    }
}