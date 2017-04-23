package com.flymegoc.model;

import java.util.ArrayList;
import java.util.List;

public class SprPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SprPermissionExample() {
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

        public Criteria andSprPermissionIdIsNull() {
            addCriterion("spr_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdIsNotNull() {
            addCriterion("spr_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdEqualTo(Integer value) {
            addCriterion("spr_permission_id =", value, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdNotEqualTo(Integer value) {
            addCriterion("spr_permission_id <>", value, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdGreaterThan(Integer value) {
            addCriterion("spr_permission_id >", value, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_permission_id >=", value, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdLessThan(Integer value) {
            addCriterion("spr_permission_id <", value, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("spr_permission_id <=", value, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdIn(List<Integer> values) {
            addCriterion("spr_permission_id in", values, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdNotIn(List<Integer> values) {
            addCriterion("spr_permission_id not in", values, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdBetween(Integer value1, Integer value2) {
            addCriterion("spr_permission_id between", value1, value2, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_permission_id not between", value1, value2, "sprPermissionId");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameIsNull() {
            addCriterion("spr_permission_name is null");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameIsNotNull() {
            addCriterion("spr_permission_name is not null");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameEqualTo(String value) {
            addCriterion("spr_permission_name =", value, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameNotEqualTo(String value) {
            addCriterion("spr_permission_name <>", value, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameGreaterThan(String value) {
            addCriterion("spr_permission_name >", value, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("spr_permission_name >=", value, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameLessThan(String value) {
            addCriterion("spr_permission_name <", value, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("spr_permission_name <=", value, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameLike(String value) {
            addCriterion("spr_permission_name like", value, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameNotLike(String value) {
            addCriterion("spr_permission_name not like", value, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameIn(List<String> values) {
            addCriterion("spr_permission_name in", values, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameNotIn(List<String> values) {
            addCriterion("spr_permission_name not in", values, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameBetween(String value1, String value2) {
            addCriterion("spr_permission_name between", value1, value2, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprPermissionNameNotBetween(String value1, String value2) {
            addCriterion("spr_permission_name not between", value1, value2, "sprPermissionName");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdIsNull() {
            addCriterion("spr_role_id is null");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdIsNotNull() {
            addCriterion("spr_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdEqualTo(Integer value) {
            addCriterion("spr_role_id =", value, "sprRoleId");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdNotEqualTo(Integer value) {
            addCriterion("spr_role_id <>", value, "sprRoleId");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdGreaterThan(Integer value) {
            addCriterion("spr_role_id >", value, "sprRoleId");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_role_id >=", value, "sprRoleId");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdLessThan(Integer value) {
            addCriterion("spr_role_id <", value, "sprRoleId");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("spr_role_id <=", value, "sprRoleId");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdIn(List<Integer> values) {
            addCriterion("spr_role_id in", values, "sprRoleId");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdNotIn(List<Integer> values) {
            addCriterion("spr_role_id not in", values, "sprRoleId");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("spr_role_id between", value1, value2, "sprRoleId");
            return (Criteria) this;
        }

        public Criteria andSprRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_role_id not between", value1, value2, "sprRoleId");
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