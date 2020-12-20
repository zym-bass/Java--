package com.yiming.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IdcardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IdcardExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(Integer value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(Integer value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(Integer value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(Integer value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<Integer> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<Integer> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(Integer value1, Integer value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andICardnoIsNull() {
            addCriterion("i_cardno is null");
            return (Criteria) this;
        }

        public Criteria andICardnoIsNotNull() {
            addCriterion("i_cardno is not null");
            return (Criteria) this;
        }

        public Criteria andICardnoEqualTo(String value) {
            addCriterion("i_cardno =", value, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoNotEqualTo(String value) {
            addCriterion("i_cardno <>", value, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoGreaterThan(String value) {
            addCriterion("i_cardno >", value, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoGreaterThanOrEqualTo(String value) {
            addCriterion("i_cardno >=", value, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoLessThan(String value) {
            addCriterion("i_cardno <", value, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoLessThanOrEqualTo(String value) {
            addCriterion("i_cardno <=", value, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoLike(String value) {
            addCriterion("i_cardno like", value, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoNotLike(String value) {
            addCriterion("i_cardno not like", value, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoIn(List<String> values) {
            addCriterion("i_cardno in", values, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoNotIn(List<String> values) {
            addCriterion("i_cardno not in", values, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoBetween(String value1, String value2) {
            addCriterion("i_cardno between", value1, value2, "iCardno");
            return (Criteria) this;
        }

        public Criteria andICardnoNotBetween(String value1, String value2) {
            addCriterion("i_cardno not between", value1, value2, "iCardno");
            return (Criteria) this;
        }

        public Criteria andIUselifeIsNull() {
            addCriterion("i_uselife is null");
            return (Criteria) this;
        }

        public Criteria andIUselifeIsNotNull() {
            addCriterion("i_uselife is not null");
            return (Criteria) this;
        }

        public Criteria andIUselifeEqualTo(Date value) {
            addCriterionForJDBCDate("i_uselife =", value, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIUselifeNotEqualTo(Date value) {
            addCriterionForJDBCDate("i_uselife <>", value, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIUselifeGreaterThan(Date value) {
            addCriterionForJDBCDate("i_uselife >", value, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIUselifeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("i_uselife >=", value, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIUselifeLessThan(Date value) {
            addCriterionForJDBCDate("i_uselife <", value, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIUselifeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("i_uselife <=", value, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIUselifeIn(List<Date> values) {
            addCriterionForJDBCDate("i_uselife in", values, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIUselifeNotIn(List<Date> values) {
            addCriterionForJDBCDate("i_uselife not in", values, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIUselifeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("i_uselife between", value1, value2, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIUselifeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("i_uselife not between", value1, value2, "iUselife");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdIsNull() {
            addCriterion("i_person2_id is null");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdIsNotNull() {
            addCriterion("i_person2_id is not null");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdEqualTo(Integer value) {
            addCriterion("i_person2_id =", value, "iPerson2Id");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdNotEqualTo(Integer value) {
            addCriterion("i_person2_id <>", value, "iPerson2Id");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdGreaterThan(Integer value) {
            addCriterion("i_person2_id >", value, "iPerson2Id");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_person2_id >=", value, "iPerson2Id");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdLessThan(Integer value) {
            addCriterion("i_person2_id <", value, "iPerson2Id");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdLessThanOrEqualTo(Integer value) {
            addCriterion("i_person2_id <=", value, "iPerson2Id");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdIn(List<Integer> values) {
            addCriterion("i_person2_id in", values, "iPerson2Id");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdNotIn(List<Integer> values) {
            addCriterion("i_person2_id not in", values, "iPerson2Id");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdBetween(Integer value1, Integer value2) {
            addCriterion("i_person2_id between", value1, value2, "iPerson2Id");
            return (Criteria) this;
        }

        public Criteria andIPerson2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_person2_id not between", value1, value2, "iPerson2Id");
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