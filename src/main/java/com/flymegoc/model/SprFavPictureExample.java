package com.flymegoc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SprFavPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SprFavPictureExample() {
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

        public Criteria andSprFavPictureIdIsNull() {
            addCriterion("spr_fav_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdIsNotNull() {
            addCriterion("spr_fav_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdEqualTo(Integer value) {
            addCriterion("spr_fav_picture_id =", value, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdNotEqualTo(Integer value) {
            addCriterion("spr_fav_picture_id <>", value, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdGreaterThan(Integer value) {
            addCriterion("spr_fav_picture_id >", value, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_picture_id >=", value, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdLessThan(Integer value) {
            addCriterion("spr_fav_picture_id <", value, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_picture_id <=", value, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdIn(List<Integer> values) {
            addCriterion("spr_fav_picture_id in", values, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdNotIn(List<Integer> values) {
            addCriterion("spr_fav_picture_id not in", values, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_picture_id between", value1, value2, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_picture_id not between", value1, value2, "sprFavPictureId");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridIsNull() {
            addCriterion("spr_fav_picture_userid is null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridIsNotNull() {
            addCriterion("spr_fav_picture_userid is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridEqualTo(Integer value) {
            addCriterion("spr_fav_picture_userid =", value, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridNotEqualTo(Integer value) {
            addCriterion("spr_fav_picture_userid <>", value, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridGreaterThan(Integer value) {
            addCriterion("spr_fav_picture_userid >", value, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_picture_userid >=", value, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridLessThan(Integer value) {
            addCriterion("spr_fav_picture_userid <", value, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridLessThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_picture_userid <=", value, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridIn(List<Integer> values) {
            addCriterion("spr_fav_picture_userid in", values, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridNotIn(List<Integer> values) {
            addCriterion("spr_fav_picture_userid not in", values, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_picture_userid between", value1, value2, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_picture_userid not between", value1, value2, "sprFavPictureUserid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidIsNull() {
            addCriterion("spr_fav_picture_fav_categoryid is null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidIsNotNull() {
            addCriterion("spr_fav_picture_fav_categoryid is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidEqualTo(Integer value) {
            addCriterion("spr_fav_picture_fav_categoryid =", value, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidNotEqualTo(Integer value) {
            addCriterion("spr_fav_picture_fav_categoryid <>", value, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidGreaterThan(Integer value) {
            addCriterion("spr_fav_picture_fav_categoryid >", value, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_picture_fav_categoryid >=", value, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidLessThan(Integer value) {
            addCriterion("spr_fav_picture_fav_categoryid <", value, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("spr_fav_picture_fav_categoryid <=", value, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidIn(List<Integer> values) {
            addCriterion("spr_fav_picture_fav_categoryid in", values, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidNotIn(List<Integer> values) {
            addCriterion("spr_fav_picture_fav_categoryid not in", values, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_picture_fav_categoryid between", value1, value2, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureFavCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_fav_picture_fav_categoryid not between", value1, value2, "sprFavPictureFavCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidIsNull() {
            addCriterion("spr_fav_picture_pictureid is null");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidIsNotNull() {
            addCriterion("spr_fav_picture_pictureid is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidEqualTo(Float value) {
            addCriterion("spr_fav_picture_pictureid =", value, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidNotEqualTo(Float value) {
            addCriterion("spr_fav_picture_pictureid <>", value, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidGreaterThan(Float value) {
            addCriterion("spr_fav_picture_pictureid >", value, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidGreaterThanOrEqualTo(Float value) {
            addCriterion("spr_fav_picture_pictureid >=", value, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidLessThan(Float value) {
            addCriterion("spr_fav_picture_pictureid <", value, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidLessThanOrEqualTo(Float value) {
            addCriterion("spr_fav_picture_pictureid <=", value, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidIn(List<Float> values) {
            addCriterion("spr_fav_picture_pictureid in", values, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidNotIn(List<Float> values) {
            addCriterion("spr_fav_picture_pictureid not in", values, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidBetween(Float value1, Float value2) {
            addCriterion("spr_fav_picture_pictureid between", value1, value2, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPicturePictureidNotBetween(Float value1, Float value2) {
            addCriterion("spr_fav_picture_pictureid not between", value1, value2, "sprFavPicturePictureid");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeIsNull() {
            addCriterion("spr_fav_picture_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeIsNotNull() {
            addCriterion("spr_fav_picture_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeEqualTo(Date value) {
            addCriterion("spr_fav_picture_create_time =", value, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeNotEqualTo(Date value) {
            addCriterion("spr_fav_picture_create_time <>", value, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeGreaterThan(Date value) {
            addCriterion("spr_fav_picture_create_time >", value, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_fav_picture_create_time >=", value, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeLessThan(Date value) {
            addCriterion("spr_fav_picture_create_time <", value, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_fav_picture_create_time <=", value, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeIn(List<Date> values) {
            addCriterion("spr_fav_picture_create_time in", values, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeNotIn(List<Date> values) {
            addCriterion("spr_fav_picture_create_time not in", values, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_fav_picture_create_time between", value1, value2, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_fav_picture_create_time not between", value1, value2, "sprFavPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeIsNull() {
            addCriterion("spr_fav_picture_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeIsNotNull() {
            addCriterion("spr_fav_picture_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeEqualTo(Date value) {
            addCriterion("spr_fav_picture_update_time =", value, "sprFavPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeNotEqualTo(Date value) {
            addCriterion("spr_fav_picture_update_time <>", value, "sprFavPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeGreaterThan(Date value) {
            addCriterion("spr_fav_picture_update_time >", value, "sprFavPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_fav_picture_update_time >=", value, "sprFavPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeLessThan(Date value) {
            addCriterion("spr_fav_picture_update_time <", value, "sprFavPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_fav_picture_update_time <=", value, "sprFavPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeIn(List<Date> values) {
            addCriterion("spr_fav_picture_update_time in", values, "sprFavPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeNotIn(List<Date> values) {
            addCriterion("spr_fav_picture_update_time not in", values, "sprFavPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_fav_picture_update_time between", value1, value2, "sprFavPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprFavPictureUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_fav_picture_update_time not between", value1, value2, "sprFavPictureUpdateTime");
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