package com.flymegoc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SprFavCategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SprFavCategoriesExample() {
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

        public Criteria andSprFavCategoriesIdIsNull() {
            addCriterion("spr_fav_categories_id is null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdIsNotNull() {
            addCriterion("spr_fav_categories_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdEqualTo(Integer value) {
            addCriterion("spr_fav_categories_id =", value, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdNotEqualTo(Integer value) {
            addCriterion("spr_fav_categories_id <>", value, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdGreaterThan(Integer value) {
            addCriterion("spr_fav_categories_id >", value, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_categories_id >=", value, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdLessThan(Integer value) {
            addCriterion("spr_fav_categories_id <", value, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdLessThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_categories_id <=", value, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdIn(List<Integer> values) {
            addCriterion("spr_fav_categories_id in", values, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdNotIn(List<Integer> values) {
            addCriterion("spr_fav_categories_id not in", values, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_categories_id between", value1, value2, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_categories_id not between", value1, value2, "sprFavCategoriesId");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameIsNull() {
            addCriterion("spr_fav_categories_name is null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameIsNotNull() {
            addCriterion("spr_fav_categories_name is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameEqualTo(String value) {
            addCriterion("spr_fav_categories_name =", value, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameNotEqualTo(String value) {
            addCriterion("spr_fav_categories_name <>", value, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameGreaterThan(String value) {
            addCriterion("spr_fav_categories_name >", value, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("spr_fav_categories_name >=", value, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameLessThan(String value) {
            addCriterion("spr_fav_categories_name <", value, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameLessThanOrEqualTo(String value) {
            addCriterion("spr_fav_categories_name <=", value, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameLike(String value) {
            addCriterion("spr_fav_categories_name like", value, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameNotLike(String value) {
            addCriterion("spr_fav_categories_name not like", value, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameIn(List<String> values) {
            addCriterion("spr_fav_categories_name in", values, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameNotIn(List<String> values) {
            addCriterion("spr_fav_categories_name not in", values, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameBetween(String value1, String value2) {
            addCriterion("spr_fav_categories_name between", value1, value2, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesNameNotBetween(String value1, String value2) {
            addCriterion("spr_fav_categories_name not between", value1, value2, "sprFavCategoriesName");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesIsNull() {
            addCriterion("spr_fav_categories_likes is null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesIsNotNull() {
            addCriterion("spr_fav_categories_likes is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesEqualTo(Integer value) {
            addCriterion("spr_fav_categories_likes =", value, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesNotEqualTo(Integer value) {
            addCriterion("spr_fav_categories_likes <>", value, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesGreaterThan(Integer value) {
            addCriterion("spr_fav_categories_likes >", value, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_categories_likes >=", value, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesLessThan(Integer value) {
            addCriterion("spr_fav_categories_likes <", value, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesLessThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_categories_likes <=", value, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesIn(List<Integer> values) {
            addCriterion("spr_fav_categories_likes in", values, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesNotIn(List<Integer> values) {
            addCriterion("spr_fav_categories_likes not in", values, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_categories_likes between", value1, value2, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_categories_likes not between", value1, value2, "sprFavCategoriesLikes");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateIsNull() {
            addCriterion("spr_fav_categories_private is null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateIsNotNull() {
            addCriterion("spr_fav_categories_private is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateEqualTo(Integer value) {
            addCriterion("spr_fav_categories_private =", value, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateNotEqualTo(Integer value) {
            addCriterion("spr_fav_categories_private <>", value, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateGreaterThan(Integer value) {
            addCriterion("spr_fav_categories_private >", value, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_categories_private >=", value, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateLessThan(Integer value) {
            addCriterion("spr_fav_categories_private <", value, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateLessThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_categories_private <=", value, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateIn(List<Integer> values) {
            addCriterion("spr_fav_categories_private in", values, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateNotIn(List<Integer> values) {
            addCriterion("spr_fav_categories_private not in", values, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_categories_private between", value1, value2, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesPrivateNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_categories_private not between", value1, value2, "sprFavCategoriesPrivate");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeIsNull() {
            addCriterion("spr_fav_categories_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeIsNotNull() {
            addCriterion("spr_fav_categories_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeEqualTo(Date value) {
            addCriterion("spr_fav_categories_create_time =", value, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeNotEqualTo(Date value) {
            addCriterion("spr_fav_categories_create_time <>", value, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeGreaterThan(Date value) {
            addCriterion("spr_fav_categories_create_time >", value, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_fav_categories_create_time >=", value, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeLessThan(Date value) {
            addCriterion("spr_fav_categories_create_time <", value, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_fav_categories_create_time <=", value, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeIn(List<Date> values) {
            addCriterion("spr_fav_categories_create_time in", values, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeNotIn(List<Date> values) {
            addCriterion("spr_fav_categories_create_time not in", values, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_fav_categories_create_time between", value1, value2, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_fav_categories_create_time not between", value1, value2, "sprFavCategoriesCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeIsNull() {
            addCriterion("spr_fav_categories_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeIsNotNull() {
            addCriterion("spr_fav_categories_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeEqualTo(Date value) {
            addCriterion("spr_fav_categories_update_time =", value, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeNotEqualTo(Date value) {
            addCriterion("spr_fav_categories_update_time <>", value, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeGreaterThan(Date value) {
            addCriterion("spr_fav_categories_update_time >", value, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_fav_categories_update_time >=", value, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeLessThan(Date value) {
            addCriterion("spr_fav_categories_update_time <", value, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_fav_categories_update_time <=", value, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeIn(List<Date> values) {
            addCriterion("spr_fav_categories_update_time in", values, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeNotIn(List<Date> values) {
            addCriterion("spr_fav_categories_update_time not in", values, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_fav_categories_update_time between", value1, value2, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_fav_categories_update_time not between", value1, value2, "sprFavCategoriesUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridIsNull() {
            addCriterion("spr_fav_categories_userid is null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridIsNotNull() {
            addCriterion("spr_fav_categories_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridEqualTo(Integer value) {
            addCriterion("spr_fav_categories_userid =", value, "sprFavCategoriesUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridNotEqualTo(Integer value) {
            addCriterion("spr_fav_categories_userid <>", value, "sprFavCategoriesUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridGreaterThan(Integer value) {
            addCriterion("spr_fav_categories_userid >", value, "sprFavCategoriesUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_categories_userid >=", value, "sprFavCategoriesUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridLessThan(Integer value) {
            addCriterion("spr_fav_categories_userid <", value, "sprFavCategoriesUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridLessThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_categories_userid <=", value, "sprFavCategoriesUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridIn(List<Integer> values) {
            addCriterion("spr_fav_categories_userid in", values, "sprFavCategoriesUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridNotIn(List<Integer> values) {
            addCriterion("spr_fav_categories_userid not in", values, "sprFavCategoriesUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_categories_userid between", value1, value2, "sprFavCategoriesUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavCategoriesUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_categories_userid not between", value1, value2, "sprFavCategoriesUserid");
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