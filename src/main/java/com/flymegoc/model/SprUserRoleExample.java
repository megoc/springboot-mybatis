package com.flymegoc.model;

import java.util.ArrayList;
import java.util.List;

public class SprUserRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SprUserRoleExample() {
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

        public Criteria andSprUserRoleIdIsNull() {
            addCriterion("spr_user_role_id is null");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdIsNotNull() {
            addCriterion("spr_user_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdEqualTo(Integer value) {
            addCriterion("spr_user_role_id =", value, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdNotEqualTo(Integer value) {
            addCriterion("spr_user_role_id <>", value, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdGreaterThan(Integer value) {
            addCriterion("spr_user_role_id >", value, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_user_role_id >=", value, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdLessThan(Integer value) {
            addCriterion("spr_user_role_id <", value, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("spr_user_role_id <=", value, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdIn(List<Integer> values) {
            addCriterion("spr_user_role_id in", values, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdNotIn(List<Integer> values) {
            addCriterion("spr_user_role_id not in", values, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("spr_user_role_id between", value1, value2, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_user_role_id not between", value1, value2, "sprUserRoleId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdIsNull() {
            addCriterion("spr_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSprUserIdIsNotNull() {
            addCriterion("spr_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprUserIdEqualTo(Integer value) {
            addCriterion("spr_user_id =", value, "sprUserId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdNotEqualTo(Integer value) {
            addCriterion("spr_user_id <>", value, "sprUserId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdGreaterThan(Integer value) {
            addCriterion("spr_user_id >", value, "sprUserId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_user_id >=", value, "sprUserId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdLessThan(Integer value) {
            addCriterion("spr_user_id <", value, "sprUserId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("spr_user_id <=", value, "sprUserId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdIn(List<Integer> values) {
            addCriterion("spr_user_id in", values, "sprUserId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdNotIn(List<Integer> values) {
            addCriterion("spr_user_id not in", values, "sprUserId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdBetween(Integer value1, Integer value2) {
            addCriterion("spr_user_id between", value1, value2, "sprUserId");
            return (Criteria) this;
        }

        public Criteria andSprUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_user_id not between", value1, value2, "sprUserId");
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