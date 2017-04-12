package com.flymegoc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SprCategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SprCategoriesExample() {
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

        public Criteria andSprCategoryIdIsNull() {
            addCriterion("spr_category_id is null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdIsNotNull() {
            addCriterion("spr_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdEqualTo(Integer value) {
            addCriterion("spr_category_id =", value, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdNotEqualTo(Integer value) {
            addCriterion("spr_category_id <>", value, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdGreaterThan(Integer value) {
            addCriterion("spr_category_id >", value, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_category_id >=", value, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdLessThan(Integer value) {
            addCriterion("spr_category_id <", value, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("spr_category_id <=", value, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdIn(List<Integer> values) {
            addCriterion("spr_category_id in", values, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdNotIn(List<Integer> values) {
            addCriterion("spr_category_id not in", values, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("spr_category_id between", value1, value2, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_category_id not between", value1, value2, "sprCategoryId");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameIsNull() {
            addCriterion("spr_category_name is null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameIsNotNull() {
            addCriterion("spr_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameEqualTo(String value) {
            addCriterion("spr_category_name =", value, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameNotEqualTo(String value) {
            addCriterion("spr_category_name <>", value, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameGreaterThan(String value) {
            addCriterion("spr_category_name >", value, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("spr_category_name >=", value, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameLessThan(String value) {
            addCriterion("spr_category_name <", value, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("spr_category_name <=", value, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameLike(String value) {
            addCriterion("spr_category_name like", value, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameNotLike(String value) {
            addCriterion("spr_category_name not like", value, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameIn(List<String> values) {
            addCriterion("spr_category_name in", values, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameNotIn(List<String> values) {
            addCriterion("spr_category_name not in", values, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameBetween(String value1, String value2) {
            addCriterion("spr_category_name between", value1, value2, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryNameNotBetween(String value1, String value2) {
            addCriterion("spr_category_name not between", value1, value2, "sprCategoryName");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlIsNull() {
            addCriterion("spr_category_url is null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlIsNotNull() {
            addCriterion("spr_category_url is not null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlEqualTo(String value) {
            addCriterion("spr_category_url =", value, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlNotEqualTo(String value) {
            addCriterion("spr_category_url <>", value, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlGreaterThan(String value) {
            addCriterion("spr_category_url >", value, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlGreaterThanOrEqualTo(String value) {
            addCriterion("spr_category_url >=", value, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlLessThan(String value) {
            addCriterion("spr_category_url <", value, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlLessThanOrEqualTo(String value) {
            addCriterion("spr_category_url <=", value, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlLike(String value) {
            addCriterion("spr_category_url like", value, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlNotLike(String value) {
            addCriterion("spr_category_url not like", value, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlIn(List<String> values) {
            addCriterion("spr_category_url in", values, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlNotIn(List<String> values) {
            addCriterion("spr_category_url not in", values, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlBetween(String value1, String value2) {
            addCriterion("spr_category_url between", value1, value2, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUrlNotBetween(String value1, String value2) {
            addCriterion("spr_category_url not between", value1, value2, "sprCategoryUrl");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeIsNull() {
            addCriterion("spr_categoty_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeIsNotNull() {
            addCriterion("spr_categoty_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeEqualTo(Date value) {
            addCriterion("spr_categoty_create_time =", value, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeNotEqualTo(Date value) {
            addCriterion("spr_categoty_create_time <>", value, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeGreaterThan(Date value) {
            addCriterion("spr_categoty_create_time >", value, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_categoty_create_time >=", value, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeLessThan(Date value) {
            addCriterion("spr_categoty_create_time <", value, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_categoty_create_time <=", value, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeIn(List<Date> values) {
            addCriterion("spr_categoty_create_time in", values, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeNotIn(List<Date> values) {
            addCriterion("spr_categoty_create_time not in", values, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_categoty_create_time between", value1, value2, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategotyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_categoty_create_time not between", value1, value2, "sprCategotyCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeIsNull() {
            addCriterion("spr_category_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeIsNotNull() {
            addCriterion("spr_category_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeEqualTo(Date value) {
            addCriterion("spr_category_update_time =", value, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeNotEqualTo(Date value) {
            addCriterion("spr_category_update_time <>", value, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeGreaterThan(Date value) {
            addCriterion("spr_category_update_time >", value, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_category_update_time >=", value, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeLessThan(Date value) {
            addCriterion("spr_category_update_time <", value, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_category_update_time <=", value, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeIn(List<Date> values) {
            addCriterion("spr_category_update_time in", values, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeNotIn(List<Date> values) {
            addCriterion("spr_category_update_time not in", values, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_category_update_time between", value1, value2, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_category_update_time not between", value1, value2, "sprCategoryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusIsNull() {
            addCriterion("spr_category_status is null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusIsNotNull() {
            addCriterion("spr_category_status is not null");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusEqualTo(Integer value) {
            addCriterion("spr_category_status =", value, "sprCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusNotEqualTo(Integer value) {
            addCriterion("spr_category_status <>", value, "sprCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusGreaterThan(Integer value) {
            addCriterion("spr_category_status >", value, "sprCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_category_status >=", value, "sprCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusLessThan(Integer value) {
            addCriterion("spr_category_status <", value, "sprCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("spr_category_status <=", value, "sprCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusIn(List<Integer> values) {
            addCriterion("spr_category_status in", values, "sprCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusNotIn(List<Integer> values) {
            addCriterion("spr_category_status not in", values, "sprCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("spr_category_status between", value1, value2, "sprCategoryStatus");
            return (Criteria) this;
        }

        public Criteria andSprCategoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_category_status not between", value1, value2, "sprCategoryStatus");
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