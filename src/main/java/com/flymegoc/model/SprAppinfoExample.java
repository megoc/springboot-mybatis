package com.flymegoc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SprAppinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SprAppinfoExample() {
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

        public Criteria andSprAppinfoIdIsNull() {
            addCriterion("spr_appinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdIsNotNull() {
            addCriterion("spr_appinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdEqualTo(Integer value) {
            addCriterion("spr_appinfo_id =", value, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdNotEqualTo(Integer value) {
            addCriterion("spr_appinfo_id <>", value, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdGreaterThan(Integer value) {
            addCriterion("spr_appinfo_id >", value, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spr_appinfo_id >=", value, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdLessThan(Integer value) {
            addCriterion("spr_appinfo_id <", value, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("spr_appinfo_id <=", value, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdIn(List<Integer> values) {
            addCriterion("spr_appinfo_id in", values, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdNotIn(List<Integer> values) {
            addCriterion("spr_appinfo_id not in", values, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("spr_appinfo_id between", value1, value2, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spr_appinfo_id not between", value1, value2, "sprAppinfoId");
            return (Criteria) this;
        }

        public Criteria andSprAppversionIsNull() {
            addCriterion("spr_appversion is null");
            return (Criteria) this;
        }

        public Criteria andSprAppversionIsNotNull() {
            addCriterion("spr_appversion is not null");
            return (Criteria) this;
        }

        public Criteria andSprAppversionEqualTo(Float value) {
            addCriterion("spr_appversion =", value, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppversionNotEqualTo(Float value) {
            addCriterion("spr_appversion <>", value, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppversionGreaterThan(Float value) {
            addCriterion("spr_appversion >", value, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppversionGreaterThanOrEqualTo(Float value) {
            addCriterion("spr_appversion >=", value, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppversionLessThan(Float value) {
            addCriterion("spr_appversion <", value, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppversionLessThanOrEqualTo(Float value) {
            addCriterion("spr_appversion <=", value, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppversionIn(List<Float> values) {
            addCriterion("spr_appversion in", values, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppversionNotIn(List<Float> values) {
            addCriterion("spr_appversion not in", values, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppversionBetween(Float value1, Float value2) {
            addCriterion("spr_appversion between", value1, value2, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppversionNotBetween(Float value1, Float value2) {
            addCriterion("spr_appversion not between", value1, value2, "sprAppversion");
            return (Criteria) this;
        }

        public Criteria andSprAppnameIsNull() {
            addCriterion("spr_appname is null");
            return (Criteria) this;
        }

        public Criteria andSprAppnameIsNotNull() {
            addCriterion("spr_appname is not null");
            return (Criteria) this;
        }

        public Criteria andSprAppnameEqualTo(String value) {
            addCriterion("spr_appname =", value, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameNotEqualTo(String value) {
            addCriterion("spr_appname <>", value, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameGreaterThan(String value) {
            addCriterion("spr_appname >", value, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("spr_appname >=", value, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameLessThan(String value) {
            addCriterion("spr_appname <", value, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameLessThanOrEqualTo(String value) {
            addCriterion("spr_appname <=", value, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameLike(String value) {
            addCriterion("spr_appname like", value, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameNotLike(String value) {
            addCriterion("spr_appname not like", value, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameIn(List<String> values) {
            addCriterion("spr_appname in", values, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameNotIn(List<String> values) {
            addCriterion("spr_appname not in", values, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameBetween(String value1, String value2) {
            addCriterion("spr_appname between", value1, value2, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprAppnameNotBetween(String value1, String value2) {
            addCriterion("spr_appname not between", value1, value2, "sprAppname");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeIsNull() {
            addCriterion("spr_lastupdatetime is null");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeIsNotNull() {
            addCriterion("spr_lastupdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeEqualTo(Date value) {
            addCriterion("spr_lastupdatetime =", value, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeNotEqualTo(Date value) {
            addCriterion("spr_lastupdatetime <>", value, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeGreaterThan(Date value) {
            addCriterion("spr_lastupdatetime >", value, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("spr_lastupdatetime >=", value, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeLessThan(Date value) {
            addCriterion("spr_lastupdatetime <", value, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("spr_lastupdatetime <=", value, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeIn(List<Date> values) {
            addCriterion("spr_lastupdatetime in", values, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeNotIn(List<Date> values) {
            addCriterion("spr_lastupdatetime not in", values, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeBetween(Date value1, Date value2) {
            addCriterion("spr_lastupdatetime between", value1, value2, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprLastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("spr_lastupdatetime not between", value1, value2, "sprLastupdatetime");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoIsNull() {
            addCriterion("spr_updateinfo is null");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoIsNotNull() {
            addCriterion("spr_updateinfo is not null");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoEqualTo(String value) {
            addCriterion("spr_updateinfo =", value, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoNotEqualTo(String value) {
            addCriterion("spr_updateinfo <>", value, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoGreaterThan(String value) {
            addCriterion("spr_updateinfo >", value, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoGreaterThanOrEqualTo(String value) {
            addCriterion("spr_updateinfo >=", value, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoLessThan(String value) {
            addCriterion("spr_updateinfo <", value, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoLessThanOrEqualTo(String value) {
            addCriterion("spr_updateinfo <=", value, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoLike(String value) {
            addCriterion("spr_updateinfo like", value, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoNotLike(String value) {
            addCriterion("spr_updateinfo not like", value, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoIn(List<String> values) {
            addCriterion("spr_updateinfo in", values, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoNotIn(List<String> values) {
            addCriterion("spr_updateinfo not in", values, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoBetween(String value1, String value2) {
            addCriterion("spr_updateinfo between", value1, value2, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprUpdateinfoNotBetween(String value1, String value2) {
            addCriterion("spr_updateinfo not between", value1, value2, "sprUpdateinfo");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlIsNull() {
            addCriterion("spr_apkdownloadurl is null");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlIsNotNull() {
            addCriterion("spr_apkdownloadurl is not null");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlEqualTo(String value) {
            addCriterion("spr_apkdownloadurl =", value, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlNotEqualTo(String value) {
            addCriterion("spr_apkdownloadurl <>", value, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlGreaterThan(String value) {
            addCriterion("spr_apkdownloadurl >", value, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlGreaterThanOrEqualTo(String value) {
            addCriterion("spr_apkdownloadurl >=", value, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlLessThan(String value) {
            addCriterion("spr_apkdownloadurl <", value, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlLessThanOrEqualTo(String value) {
            addCriterion("spr_apkdownloadurl <=", value, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlLike(String value) {
            addCriterion("spr_apkdownloadurl like", value, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlNotLike(String value) {
            addCriterion("spr_apkdownloadurl not like", value, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlIn(List<String> values) {
            addCriterion("spr_apkdownloadurl in", values, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlNotIn(List<String> values) {
            addCriterion("spr_apkdownloadurl not in", values, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlBetween(String value1, String value2) {
            addCriterion("spr_apkdownloadurl between", value1, value2, "sprApkdownloadurl");
            return (Criteria) this;
        }

        public Criteria andSprApkdownloadurlNotBetween(String value1, String value2) {
            addCriterion("spr_apkdownloadurl not between", value1, value2, "sprApkdownloadurl");
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