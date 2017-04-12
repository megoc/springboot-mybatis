package com.flymegoc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SprPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SprPictureExample() {
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

        public Criteria andSprPictureIdIsNull() {
            addCriterion("spr_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdIsNotNull() {
            addCriterion("spr_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdEqualTo(Float value) {
            addCriterion("spr_picture_id =", value, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdNotEqualTo(Float value) {
            addCriterion("spr_picture_id <>", value, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdGreaterThan(Float value) {
            addCriterion("spr_picture_id >", value, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdGreaterThanOrEqualTo(Float value) {
            addCriterion("spr_picture_id >=", value, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdLessThan(Float value) {
            addCriterion("spr_picture_id <", value, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdLessThanOrEqualTo(Float value) {
            addCriterion("spr_picture_id <=", value, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdIn(List<Float> values) {
            addCriterion("spr_picture_id in", values, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdNotIn(List<Float> values) {
            addCriterion("spr_picture_id not in", values, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdBetween(Float value1, Float value2) {
            addCriterion("spr_picture_id between", value1, value2, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPictureIdNotBetween(Float value1, Float value2) {
            addCriterion("spr_picture_id not between", value1, value2, "sprPictureId");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidIsNull() {
            addCriterion("spr_picture_pinid is null");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidIsNotNull() {
            addCriterion("spr_picture_pinid is not null");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidEqualTo(String value) {
            addCriterion("spr_picture_pinid =", value, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidNotEqualTo(String value) {
            addCriterion("spr_picture_pinid <>", value, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidGreaterThan(String value) {
            addCriterion("spr_picture_pinid >", value, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidGreaterThanOrEqualTo(String value) {
            addCriterion("spr_picture_pinid >=", value, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidLessThan(String value) {
            addCriterion("spr_picture_pinid <", value, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidLessThanOrEqualTo(String value) {
            addCriterion("spr_picture_pinid <=", value, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidLike(String value) {
            addCriterion("spr_picture_pinid like", value, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidNotLike(String value) {
            addCriterion("spr_picture_pinid not like", value, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidIn(List<String> values) {
            addCriterion("spr_picture_pinid in", values, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidNotIn(List<String> values) {
            addCriterion("spr_picture_pinid not in", values, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidBetween(String value1, String value2) {
            addCriterion("spr_picture_pinid between", value1, value2, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPicturePinidNotBetween(String value1, String value2) {
            addCriterion("spr_picture_pinid not between", value1, value2, "sprPicturePinid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidIsNull() {
            addCriterion("spr_picture_boardid is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidIsNotNull() {
            addCriterion("spr_picture_boardid is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidEqualTo(String value) {
            addCriterion("spr_picture_boardid =", value, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidNotEqualTo(String value) {
            addCriterion("spr_picture_boardid <>", value, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidGreaterThan(String value) {
            addCriterion("spr_picture_boardid >", value, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidGreaterThanOrEqualTo(String value) {
            addCriterion("spr_picture_boardid >=", value, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidLessThan(String value) {
            addCriterion("spr_picture_boardid <", value, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidLessThanOrEqualTo(String value) {
            addCriterion("spr_picture_boardid <=", value, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidLike(String value) {
            addCriterion("spr_picture_boardid like", value, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidNotLike(String value) {
            addCriterion("spr_picture_boardid not like", value, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidIn(List<String> values) {
            addCriterion("spr_picture_boardid in", values, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidNotIn(List<String> values) {
            addCriterion("spr_picture_boardid not in", values, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidBetween(String value1, String value2) {
            addCriterion("spr_picture_boardid between", value1, value2, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBoardidNotBetween(String value1, String value2) {
            addCriterion("spr_picture_boardid not between", value1, value2, "sprPictureBoardid");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketIsNull() {
            addCriterion("spr_picture_bucket is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketIsNotNull() {
            addCriterion("spr_picture_bucket is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketEqualTo(String value) {
            addCriterion("spr_picture_bucket =", value, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketNotEqualTo(String value) {
            addCriterion("spr_picture_bucket <>", value, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketGreaterThan(String value) {
            addCriterion("spr_picture_bucket >", value, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketGreaterThanOrEqualTo(String value) {
            addCriterion("spr_picture_bucket >=", value, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketLessThan(String value) {
            addCriterion("spr_picture_bucket <", value, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketLessThanOrEqualTo(String value) {
            addCriterion("spr_picture_bucket <=", value, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketLike(String value) {
            addCriterion("spr_picture_bucket like", value, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketNotLike(String value) {
            addCriterion("spr_picture_bucket not like", value, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketIn(List<String> values) {
            addCriterion("spr_picture_bucket in", values, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketNotIn(List<String> values) {
            addCriterion("spr_picture_bucket not in", values, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketBetween(String value1, String value2) {
            addCriterion("spr_picture_bucket between", value1, value2, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureBucketNotBetween(String value1, String value2) {
            addCriterion("spr_picture_bucket not between", value1, value2, "sprPictureBucket");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyIsNull() {
            addCriterion("spr_picture_key is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyIsNotNull() {
            addCriterion("spr_picture_key is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyEqualTo(String value) {
            addCriterion("spr_picture_key =", value, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyNotEqualTo(String value) {
            addCriterion("spr_picture_key <>", value, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyGreaterThan(String value) {
            addCriterion("spr_picture_key >", value, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyGreaterThanOrEqualTo(String value) {
            addCriterion("spr_picture_key >=", value, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyLessThan(String value) {
            addCriterion("spr_picture_key <", value, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyLessThanOrEqualTo(String value) {
            addCriterion("spr_picture_key <=", value, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyLike(String value) {
            addCriterion("spr_picture_key like", value, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyNotLike(String value) {
            addCriterion("spr_picture_key not like", value, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyIn(List<String> values) {
            addCriterion("spr_picture_key in", values, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyNotIn(List<String> values) {
            addCriterion("spr_picture_key not in", values, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyBetween(String value1, String value2) {
            addCriterion("spr_picture_key between", value1, value2, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureKeyNotBetween(String value1, String value2) {
            addCriterion("spr_picture_key not between", value1, value2, "sprPictureKey");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeIsNull() {
            addCriterion("spr_picture_type is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeIsNotNull() {
            addCriterion("spr_picture_type is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeEqualTo(String value) {
            addCriterion("spr_picture_type =", value, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeNotEqualTo(String value) {
            addCriterion("spr_picture_type <>", value, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeGreaterThan(String value) {
            addCriterion("spr_picture_type >", value, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("spr_picture_type >=", value, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeLessThan(String value) {
            addCriterion("spr_picture_type <", value, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeLessThanOrEqualTo(String value) {
            addCriterion("spr_picture_type <=", value, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeLike(String value) {
            addCriterion("spr_picture_type like", value, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeNotLike(String value) {
            addCriterion("spr_picture_type not like", value, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeIn(List<String> values) {
            addCriterion("spr_picture_type in", values, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeNotIn(List<String> values) {
            addCriterion("spr_picture_type not in", values, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeBetween(String value1, String value2) {
            addCriterion("spr_picture_type between", value1, value2, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureTypeNotBetween(String value1, String value2) {
            addCriterion("spr_picture_type not between", value1, value2, "sprPictureType");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthIsNull() {
            addCriterion("spr_picture_width is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthIsNotNull() {
            addCriterion("spr_picture_width is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthEqualTo(Integer value) {
            addCriterion("spr_picture_width =", value, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthNotEqualTo(Integer value) {
            addCriterion("spr_picture_width <>", value, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthGreaterThan(Integer value) {
            addCriterion("spr_picture_width >", value, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_width >=", value, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthLessThan(Integer value) {
            addCriterion("spr_picture_width <", value, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthLessThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_width <=", value, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthIn(List<Integer> values) {
            addCriterion("spr_picture_width in", values, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthNotIn(List<Integer> values) {
            addCriterion("spr_picture_width not in", values, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_width between", value1, value2, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_width not between", value1, value2, "sprPictureWidth");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightIsNull() {
            addCriterion("spr_picture_height is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightIsNotNull() {
            addCriterion("spr_picture_height is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightEqualTo(Integer value) {
            addCriterion("spr_picture_height =", value, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightNotEqualTo(Integer value) {
            addCriterion("spr_picture_height <>", value, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightGreaterThan(Integer value) {
            addCriterion("spr_picture_height >", value, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_height >=", value, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightLessThan(Integer value) {
            addCriterion("spr_picture_height <", value, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightLessThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_height <=", value, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightIn(List<Integer> values) {
            addCriterion("spr_picture_height in", values, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightNotIn(List<Integer> values) {
            addCriterion("spr_picture_height not in", values, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_height between", value1, value2, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_height not between", value1, value2, "sprPictureHeight");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioIsNull() {
            addCriterion("spr_picture_ratio is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioIsNotNull() {
            addCriterion("spr_picture_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioEqualTo(Double value) {
            addCriterion("spr_picture_ratio =", value, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioNotEqualTo(Double value) {
            addCriterion("spr_picture_ratio <>", value, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioGreaterThan(Double value) {
            addCriterion("spr_picture_ratio >", value, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("spr_picture_ratio >=", value, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioLessThan(Double value) {
            addCriterion("spr_picture_ratio <", value, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioLessThanOrEqualTo(Double value) {
            addCriterion("spr_picture_ratio <=", value, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioIn(List<Double> values) {
            addCriterion("spr_picture_ratio in", values, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioNotIn(List<Double> values) {
            addCriterion("spr_picture_ratio not in", values, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioBetween(Double value1, Double value2) {
            addCriterion("spr_picture_ratio between", value1, value2, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureRatioNotBetween(Double value1, Double value2) {
            addCriterion("spr_picture_ratio not between", value1, value2, "sprPictureRatio");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsIsNull() {
            addCriterion("spr_picture_reads is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsIsNotNull() {
            addCriterion("spr_picture_reads is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsEqualTo(Integer value) {
            addCriterion("spr_picture_reads =", value, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsNotEqualTo(Integer value) {
            addCriterion("spr_picture_reads <>", value, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsGreaterThan(Integer value) {
            addCriterion("spr_picture_reads >", value, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_reads >=", value, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsLessThan(Integer value) {
            addCriterion("spr_picture_reads <", value, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsLessThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_reads <=", value, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsIn(List<Integer> values) {
            addCriterion("spr_picture_reads in", values, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsNotIn(List<Integer> values) {
            addCriterion("spr_picture_reads not in", values, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_reads between", value1, value2, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureReadsNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_reads not between", value1, value2, "sprPictureReads");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesIsNull() {
            addCriterion("spr_picture_likes is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesIsNotNull() {
            addCriterion("spr_picture_likes is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesEqualTo(Integer value) {
            addCriterion("spr_picture_likes =", value, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesNotEqualTo(Integer value) {
            addCriterion("spr_picture_likes <>", value, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesGreaterThan(Integer value) {
            addCriterion("spr_picture_likes >", value, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_likes >=", value, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesLessThan(Integer value) {
            addCriterion("spr_picture_likes <", value, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesLessThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_likes <=", value, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesIn(List<Integer> values) {
            addCriterion("spr_picture_likes in", values, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesNotIn(List<Integer> values) {
            addCriterion("spr_picture_likes not in", values, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_likes between", value1, value2, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_likes not between", value1, value2, "sprPictureLikes");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidIsNull() {
            addCriterion("spr_picture_categoryid is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidIsNotNull() {
            addCriterion("spr_picture_categoryid is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidEqualTo(Integer value) {
            addCriterion("spr_picture_categoryid =", value, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidNotEqualTo(Integer value) {
            addCriterion("spr_picture_categoryid <>", value, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidGreaterThan(Integer value) {
            addCriterion("spr_picture_categoryid >", value, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_categoryid >=", value, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidLessThan(Integer value) {
            addCriterion("spr_picture_categoryid <", value, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("spr_picture_categoryid <=", value, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidIn(List<Integer> values) {
            addCriterion("spr_picture_categoryid in", values, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidNotIn(List<Integer> values) {
            addCriterion("spr_picture_categoryid not in", values, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_categoryid between", value1, value2, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_picture_categoryid not between", value1, value2, "sprPictureCategoryid");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeIsNull() {
            addCriterion("spr_picture_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeIsNotNull() {
            addCriterion("spr_picture_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeEqualTo(Date value) {
            addCriterion("spr_picture_create_time =", value, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeNotEqualTo(Date value) {
            addCriterion("spr_picture_create_time <>", value, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeGreaterThan(Date value) {
            addCriterion("spr_picture_create_time >", value, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_picture_create_time >=", value, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeLessThan(Date value) {
            addCriterion("spr_picture_create_time <", value, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_picture_create_time <=", value, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeIn(List<Date> values) {
            addCriterion("spr_picture_create_time in", values, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeNotIn(List<Date> values) {
            addCriterion("spr_picture_create_time not in", values, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_picture_create_time between", value1, value2, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_picture_create_time not between", value1, value2, "sprPictureCreateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeIsNull() {
            addCriterion("spr_picture_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeIsNotNull() {
            addCriterion("spr_picture_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeEqualTo(Date value) {
            addCriterion("spr_picture_update_time =", value, "sprPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeNotEqualTo(Date value) {
            addCriterion("spr_picture_update_time <>", value, "sprPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeGreaterThan(Date value) {
            addCriterion("spr_picture_update_time >", value, "sprPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_picture_update_time >=", value, "sprPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeLessThan(Date value) {
            addCriterion("spr_picture_update_time <", value, "sprPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_picture_update_time <=", value, "sprPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeIn(List<Date> values) {
            addCriterion("spr_picture_update_time in", values, "sprPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeNotIn(List<Date> values) {
            addCriterion("spr_picture_update_time not in", values, "sprPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("spr_picture_update_time between", value1, value2, "sprPictureUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSprPictureUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_picture_update_time not between", value1, value2, "sprPictureUpdateTime");
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