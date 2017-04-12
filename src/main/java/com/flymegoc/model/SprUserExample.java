package com.flymegoc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SprUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SprUserExample() {
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

        public Criteria andSprUserNameIsNull() {
            addCriterion("spr_user_name is null");
            return (Criteria) this;
        }

        public Criteria andSprUserNameIsNotNull() {
            addCriterion("spr_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andSprUserNameEqualTo(String value) {
            addCriterion("spr_user_name =", value, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameNotEqualTo(String value) {
            addCriterion("spr_user_name <>", value, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameGreaterThan(String value) {
            addCriterion("spr_user_name >", value, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("spr_user_name >=", value, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameLessThan(String value) {
            addCriterion("spr_user_name <", value, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameLessThanOrEqualTo(String value) {
            addCriterion("spr_user_name <=", value, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameLike(String value) {
            addCriterion("spr_user_name like", value, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameNotLike(String value) {
            addCriterion("spr_user_name not like", value, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameIn(List<String> values) {
            addCriterion("spr_user_name in", values, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameNotIn(List<String> values) {
            addCriterion("spr_user_name not in", values, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameBetween(String value1, String value2) {
            addCriterion("spr_user_name between", value1, value2, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserNameNotBetween(String value1, String value2) {
            addCriterion("spr_user_name not between", value1, value2, "sprUserName");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordIsNull() {
            addCriterion("spr_user_password is null");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordIsNotNull() {
            addCriterion("spr_user_password is not null");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordEqualTo(String value) {
            addCriterion("spr_user_password =", value, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordNotEqualTo(String value) {
            addCriterion("spr_user_password <>", value, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordGreaterThan(String value) {
            addCriterion("spr_user_password >", value, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("spr_user_password >=", value, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordLessThan(String value) {
            addCriterion("spr_user_password <", value, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("spr_user_password <=", value, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordLike(String value) {
            addCriterion("spr_user_password like", value, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordNotLike(String value) {
            addCriterion("spr_user_password not like", value, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordIn(List<String> values) {
            addCriterion("spr_user_password in", values, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordNotIn(List<String> values) {
            addCriterion("spr_user_password not in", values, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordBetween(String value1, String value2) {
            addCriterion("spr_user_password between", value1, value2, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserPasswordNotBetween(String value1, String value2) {
            addCriterion("spr_user_password not between", value1, value2, "sprUserPassword");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailIsNull() {
            addCriterion("spr_user_email is null");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailIsNotNull() {
            addCriterion("spr_user_email is not null");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailEqualTo(String value) {
            addCriterion("spr_user_email =", value, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailNotEqualTo(String value) {
            addCriterion("spr_user_email <>", value, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailGreaterThan(String value) {
            addCriterion("spr_user_email >", value, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("spr_user_email >=", value, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailLessThan(String value) {
            addCriterion("spr_user_email <", value, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailLessThanOrEqualTo(String value) {
            addCriterion("spr_user_email <=", value, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailLike(String value) {
            addCriterion("spr_user_email like", value, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailNotLike(String value) {
            addCriterion("spr_user_email not like", value, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailIn(List<String> values) {
            addCriterion("spr_user_email in", values, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailNotIn(List<String> values) {
            addCriterion("spr_user_email not in", values, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailBetween(String value1, String value2) {
            addCriterion("spr_user_email between", value1, value2, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserEmailNotBetween(String value1, String value2) {
            addCriterion("spr_user_email not between", value1, value2, "sprUserEmail");
            return (Criteria) this;
        }

        public Criteria andSprUserPicIsNull() {
            addCriterion("spr_user_pic is null");
            return (Criteria) this;
        }

        public Criteria andSprUserPicIsNotNull() {
            addCriterion("spr_user_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSprUserPicEqualTo(String value) {
            addCriterion("spr_user_pic =", value, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicNotEqualTo(String value) {
            addCriterion("spr_user_pic <>", value, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicGreaterThan(String value) {
            addCriterion("spr_user_pic >", value, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicGreaterThanOrEqualTo(String value) {
            addCriterion("spr_user_pic >=", value, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicLessThan(String value) {
            addCriterion("spr_user_pic <", value, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicLessThanOrEqualTo(String value) {
            addCriterion("spr_user_pic <=", value, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicLike(String value) {
            addCriterion("spr_user_pic like", value, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicNotLike(String value) {
            addCriterion("spr_user_pic not like", value, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicIn(List<String> values) {
            addCriterion("spr_user_pic in", values, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicNotIn(List<String> values) {
            addCriterion("spr_user_pic not in", values, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicBetween(String value1, String value2) {
            addCriterion("spr_user_pic between", value1, value2, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPicNotBetween(String value1, String value2) {
            addCriterion("spr_user_pic not between", value1, value2, "sprUserPic");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneIsNull() {
            addCriterion("spr_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneIsNotNull() {
            addCriterion("spr_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneEqualTo(Integer value) {
            addCriterion("spr_user_phone =", value, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneNotEqualTo(Integer value) {
            addCriterion("spr_user_phone <>", value, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneGreaterThan(Integer value) {
            addCriterion("spr_user_phone >", value, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_user_phone >=", value, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneLessThan(Integer value) {
            addCriterion("spr_user_phone <", value, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("spr_user_phone <=", value, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneIn(List<Integer> values) {
            addCriterion("spr_user_phone in", values, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneNotIn(List<Integer> values) {
            addCriterion("spr_user_phone not in", values, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneBetween(Integer value1, Integer value2) {
            addCriterion("spr_user_phone between", value1, value2, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_user_phone not between", value1, value2, "sprUserPhone");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeIsNull() {
            addCriterion("spr_user_age is null");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeIsNotNull() {
            addCriterion("spr_user_age is not null");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeEqualTo(Integer value) {
            addCriterion("spr_user_age =", value, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeNotEqualTo(Integer value) {
            addCriterion("spr_user_age <>", value, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeGreaterThan(Integer value) {
            addCriterion("spr_user_age >", value, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_user_age >=", value, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeLessThan(Integer value) {
            addCriterion("spr_user_age <", value, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("spr_user_age <=", value, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeIn(List<Integer> values) {
            addCriterion("spr_user_age in", values, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeNotIn(List<Integer> values) {
            addCriterion("spr_user_age not in", values, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("spr_user_age between", value1, value2, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_user_age not between", value1, value2, "sprUserAge");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeIsNull() {
            addCriterion("spr_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeIsNotNull() {
            addCriterion("spr_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeEqualTo(Date value) {
            addCriterion("spr_create_time =", value, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeNotEqualTo(Date value) {
            addCriterion("spr_create_time <>", value, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeGreaterThan(Date value) {
            addCriterion("spr_create_time >", value, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_create_time >=", value, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeLessThan(Date value) {
            addCriterion("spr_create_time <", value, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_create_time <=", value, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeIn(List<Date> values) {
            addCriterion("spr_create_time in", values, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeNotIn(List<Date> values) {
            addCriterion("spr_create_time not in", values, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_create_time between", value1, value2, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_create_time not between", value1, value2, "sprCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeIsNull() {
            addCriterion("spr_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeIsNotNull() {
            addCriterion("spr_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeEqualTo(Date value) {
            addCriterion("spr_update_time =", value, "sprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeNotEqualTo(Date value) {
            addCriterion("spr_update_time <>", value, "sprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeGreaterThan(Date value) {
            addCriterion("spr_update_time >", value, "sprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_update_time >=", value, "sprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeLessThan(Date value) {
            addCriterion("spr_update_time <", value, "sprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_update_time <=", value, "sprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeIn(List<Date> values) {
            addCriterion("spr_update_time in", values, "sprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeNotIn(List<Date> values) {
            addCriterion("spr_update_time not in", values, "sprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_update_time between", value1, value2, "sprUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_update_time not between", value1, value2, "sprUpdateTime");
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