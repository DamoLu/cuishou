package com.wsjr.cuishou.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WsxdAllocateGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WsxdAllocateGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andOdvsIsNull() {
            addCriterion("odvs is null");
            return (Criteria) this;
        }

        public Criteria andOdvsIsNotNull() {
            addCriterion("odvs is not null");
            return (Criteria) this;
        }

        public Criteria andOdvsEqualTo(String value) {
            addCriterion("odvs =", value, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsNotEqualTo(String value) {
            addCriterion("odvs <>", value, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsGreaterThan(String value) {
            addCriterion("odvs >", value, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsGreaterThanOrEqualTo(String value) {
            addCriterion("odvs >=", value, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsLessThan(String value) {
            addCriterion("odvs <", value, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsLessThanOrEqualTo(String value) {
            addCriterion("odvs <=", value, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsLike(String value) {
            addCriterion("odvs like", value, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsNotLike(String value) {
            addCriterion("odvs not like", value, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsIn(List<String> values) {
            addCriterion("odvs in", values, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsNotIn(List<String> values) {
            addCriterion("odvs not in", values, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsBetween(String value1, String value2) {
            addCriterion("odvs between", value1, value2, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsNotBetween(String value1, String value2) {
            addCriterion("odvs not between", value1, value2, "odvs");
            return (Criteria) this;
        }

        public Criteria andOdvsNameIsNull() {
            addCriterion("odvs_name is null");
            return (Criteria) this;
        }

        public Criteria andOdvsNameIsNotNull() {
            addCriterion("odvs_name is not null");
            return (Criteria) this;
        }

        public Criteria andOdvsNameEqualTo(String value) {
            addCriterion("odvs_name =", value, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameNotEqualTo(String value) {
            addCriterion("odvs_name <>", value, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameGreaterThan(String value) {
            addCriterion("odvs_name >", value, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameGreaterThanOrEqualTo(String value) {
            addCriterion("odvs_name >=", value, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameLessThan(String value) {
            addCriterion("odvs_name <", value, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameLessThanOrEqualTo(String value) {
            addCriterion("odvs_name <=", value, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameLike(String value) {
            addCriterion("odvs_name like", value, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameNotLike(String value) {
            addCriterion("odvs_name not like", value, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameIn(List<String> values) {
            addCriterion("odvs_name in", values, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameNotIn(List<String> values) {
            addCriterion("odvs_name not in", values, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameBetween(String value1, String value2) {
            addCriterion("odvs_name between", value1, value2, "odvsName");
            return (Criteria) this;
        }

        public Criteria andOdvsNameNotBetween(String value1, String value2) {
            addCriterion("odvs_name not between", value1, value2, "odvsName");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayIsNull() {
            addCriterion("min_overdue_day is null");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayIsNotNull() {
            addCriterion("min_overdue_day is not null");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayEqualTo(Integer value) {
            addCriterion("min_overdue_day =", value, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayNotEqualTo(Integer value) {
            addCriterion("min_overdue_day <>", value, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayGreaterThan(Integer value) {
            addCriterion("min_overdue_day >", value, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_overdue_day >=", value, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayLessThan(Integer value) {
            addCriterion("min_overdue_day <", value, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayLessThanOrEqualTo(Integer value) {
            addCriterion("min_overdue_day <=", value, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayIn(List<Integer> values) {
            addCriterion("min_overdue_day in", values, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayNotIn(List<Integer> values) {
            addCriterion("min_overdue_day not in", values, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayBetween(Integer value1, Integer value2) {
            addCriterion("min_overdue_day between", value1, value2, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMinOverdueDayNotBetween(Integer value1, Integer value2) {
            addCriterion("min_overdue_day not between", value1, value2, "minOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayIsNull() {
            addCriterion("max_overdue_day is null");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayIsNotNull() {
            addCriterion("max_overdue_day is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayEqualTo(Integer value) {
            addCriterion("max_overdue_day =", value, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayNotEqualTo(Integer value) {
            addCriterion("max_overdue_day <>", value, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayGreaterThan(Integer value) {
            addCriterion("max_overdue_day >", value, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_overdue_day >=", value, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayLessThan(Integer value) {
            addCriterion("max_overdue_day <", value, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayLessThanOrEqualTo(Integer value) {
            addCriterion("max_overdue_day <=", value, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayIn(List<Integer> values) {
            addCriterion("max_overdue_day in", values, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayNotIn(List<Integer> values) {
            addCriterion("max_overdue_day not in", values, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayBetween(Integer value1, Integer value2) {
            addCriterion("max_overdue_day between", value1, value2, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andMaxOverdueDayNotBetween(Integer value1, Integer value2) {
            addCriterion("max_overdue_day not between", value1, value2, "maxOverdueDay");
            return (Criteria) this;
        }

        public Criteria andAppOrgIsNull() {
            addCriterion("app_org is null");
            return (Criteria) this;
        }

        public Criteria andAppOrgIsNotNull() {
            addCriterion("app_org is not null");
            return (Criteria) this;
        }

        public Criteria andAppOrgEqualTo(String value) {
            addCriterion("app_org =", value, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgNotEqualTo(String value) {
            addCriterion("app_org <>", value, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgGreaterThan(String value) {
            addCriterion("app_org >", value, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgGreaterThanOrEqualTo(String value) {
            addCriterion("app_org >=", value, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgLessThan(String value) {
            addCriterion("app_org <", value, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgLessThanOrEqualTo(String value) {
            addCriterion("app_org <=", value, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgLike(String value) {
            addCriterion("app_org like", value, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgNotLike(String value) {
            addCriterion("app_org not like", value, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgIn(List<String> values) {
            addCriterion("app_org in", values, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgNotIn(List<String> values) {
            addCriterion("app_org not in", values, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgBetween(String value1, String value2) {
            addCriterion("app_org between", value1, value2, "appOrg");
            return (Criteria) this;
        }

        public Criteria andAppOrgNotBetween(String value1, String value2) {
            addCriterion("app_org not between", value1, value2, "appOrg");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}