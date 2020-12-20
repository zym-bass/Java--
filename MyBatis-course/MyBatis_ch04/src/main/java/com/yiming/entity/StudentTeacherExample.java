package com.yiming.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentTeacherExample() {
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

        public Criteria andStSidIsNull() {
            addCriterion("st_sid is null");
            return (Criteria) this;
        }

        public Criteria andStSidIsNotNull() {
            addCriterion("st_sid is not null");
            return (Criteria) this;
        }

        public Criteria andStSidEqualTo(Integer value) {
            addCriterion("st_sid =", value, "stSid");
            return (Criteria) this;
        }

        public Criteria andStSidNotEqualTo(Integer value) {
            addCriterion("st_sid <>", value, "stSid");
            return (Criteria) this;
        }

        public Criteria andStSidGreaterThan(Integer value) {
            addCriterion("st_sid >", value, "stSid");
            return (Criteria) this;
        }

        public Criteria andStSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_sid >=", value, "stSid");
            return (Criteria) this;
        }

        public Criteria andStSidLessThan(Integer value) {
            addCriterion("st_sid <", value, "stSid");
            return (Criteria) this;
        }

        public Criteria andStSidLessThanOrEqualTo(Integer value) {
            addCriterion("st_sid <=", value, "stSid");
            return (Criteria) this;
        }

        public Criteria andStSidIn(List<Integer> values) {
            addCriterion("st_sid in", values, "stSid");
            return (Criteria) this;
        }

        public Criteria andStSidNotIn(List<Integer> values) {
            addCriterion("st_sid not in", values, "stSid");
            return (Criteria) this;
        }

        public Criteria andStSidBetween(Integer value1, Integer value2) {
            addCriterion("st_sid between", value1, value2, "stSid");
            return (Criteria) this;
        }

        public Criteria andStSidNotBetween(Integer value1, Integer value2) {
            addCriterion("st_sid not between", value1, value2, "stSid");
            return (Criteria) this;
        }

        public Criteria andStTidIsNull() {
            addCriterion("st_tid is null");
            return (Criteria) this;
        }

        public Criteria andStTidIsNotNull() {
            addCriterion("st_tid is not null");
            return (Criteria) this;
        }

        public Criteria andStTidEqualTo(Integer value) {
            addCriterion("st_tid =", value, "stTid");
            return (Criteria) this;
        }

        public Criteria andStTidNotEqualTo(Integer value) {
            addCriterion("st_tid <>", value, "stTid");
            return (Criteria) this;
        }

        public Criteria andStTidGreaterThan(Integer value) {
            addCriterion("st_tid >", value, "stTid");
            return (Criteria) this;
        }

        public Criteria andStTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_tid >=", value, "stTid");
            return (Criteria) this;
        }

        public Criteria andStTidLessThan(Integer value) {
            addCriterion("st_tid <", value, "stTid");
            return (Criteria) this;
        }

        public Criteria andStTidLessThanOrEqualTo(Integer value) {
            addCriterion("st_tid <=", value, "stTid");
            return (Criteria) this;
        }

        public Criteria andStTidIn(List<Integer> values) {
            addCriterion("st_tid in", values, "stTid");
            return (Criteria) this;
        }

        public Criteria andStTidNotIn(List<Integer> values) {
            addCriterion("st_tid not in", values, "stTid");
            return (Criteria) this;
        }

        public Criteria andStTidBetween(Integer value1, Integer value2) {
            addCriterion("st_tid between", value1, value2, "stTid");
            return (Criteria) this;
        }

        public Criteria andStTidNotBetween(Integer value1, Integer value2) {
            addCriterion("st_tid not between", value1, value2, "stTid");
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