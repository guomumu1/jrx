package com.jrx.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TotalItemDailyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalItemDailyExample() {
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

        public Criteria andSIndexIsNull() {
            addCriterion("s_index is null");
            return (Criteria) this;
        }

        public Criteria andSIndexIsNotNull() {
            addCriterion("s_index is not null");
            return (Criteria) this;
        }

        public Criteria andSIndexEqualTo(String value) {
            addCriterion("s_index =", value, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexNotEqualTo(String value) {
            addCriterion("s_index <>", value, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexGreaterThan(String value) {
            addCriterion("s_index >", value, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexGreaterThanOrEqualTo(String value) {
            addCriterion("s_index >=", value, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexLessThan(String value) {
            addCriterion("s_index <", value, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexLessThanOrEqualTo(String value) {
            addCriterion("s_index <=", value, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexLike(String value) {
            addCriterion("s_index like", value, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexNotLike(String value) {
            addCriterion("s_index not like", value, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexIn(List<String> values) {
            addCriterion("s_index in", values, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexNotIn(List<String> values) {
            addCriterion("s_index not in", values, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexBetween(String value1, String value2) {
            addCriterion("s_index between", value1, value2, "sIndex");
            return (Criteria) this;
        }

        public Criteria andSIndexNotBetween(String value1, String value2) {
            addCriterion("s_index not between", value1, value2, "sIndex");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNull() {
            addCriterion("trans_date is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("trans_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(Date value) {
            addCriterionForJDBCDate("trans_date =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trans_date <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trans_date >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trans_date >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(Date value) {
            addCriterionForJDBCDate("trans_date <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trans_date <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<Date> values) {
            addCriterionForJDBCDate("trans_date in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trans_date not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trans_date between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trans_date not between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNull() {
            addCriterion("surname is null");
            return (Criteria) this;
        }

        public Criteria andSurnameIsNotNull() {
            addCriterion("surname is not null");
            return (Criteria) this;
        }

        public Criteria andSurnameEqualTo(String value) {
            addCriterion("surname =", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotEqualTo(String value) {
            addCriterion("surname <>", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThan(String value) {
            addCriterion("surname >", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameGreaterThanOrEqualTo(String value) {
            addCriterion("surname >=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThan(String value) {
            addCriterion("surname <", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLessThanOrEqualTo(String value) {
            addCriterion("surname <=", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameLike(String value) {
            addCriterion("surname like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotLike(String value) {
            addCriterion("surname not like", value, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameIn(List<String> values) {
            addCriterion("surname in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotIn(List<String> values) {
            addCriterion("surname not in", values, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameBetween(String value1, String value2) {
            addCriterion("surname between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andSurnameNotBetween(String value1, String value2) {
            addCriterion("surname not between", value1, value2, "surname");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtIsNull() {
            addCriterion("tran_max_amt is null");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtIsNotNull() {
            addCriterion("tran_max_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtEqualTo(BigDecimal value) {
            addCriterion("tran_max_amt =", value, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("tran_max_amt <>", value, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtGreaterThan(BigDecimal value) {
            addCriterion("tran_max_amt >", value, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_max_amt >=", value, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtLessThan(BigDecimal value) {
            addCriterion("tran_max_amt <", value, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_max_amt <=", value, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtIn(List<BigDecimal> values) {
            addCriterion("tran_max_amt in", values, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("tran_max_amt not in", values, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_max_amt between", value1, value2, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andTranMaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_max_amt not between", value1, value2, "tranMaxAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtIsNull() {
            addCriterion("pay_amt is null");
            return (Criteria) this;
        }

        public Criteria andPayAmtIsNotNull() {
            addCriterion("pay_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmtEqualTo(BigDecimal value) {
            addCriterion("pay_amt =", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotEqualTo(BigDecimal value) {
            addCriterion("pay_amt <>", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThan(BigDecimal value) {
            addCriterion("pay_amt >", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amt >=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThan(BigDecimal value) {
            addCriterion("pay_amt <", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_amt <=", value, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtIn(List<BigDecimal> values) {
            addCriterion("pay_amt in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotIn(List<BigDecimal> values) {
            addCriterion("pay_amt not in", values, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amt between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andPayAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_amt not between", value1, value2, "payAmt");
            return (Criteria) this;
        }

        public Criteria andTranCntIsNull() {
            addCriterion("tran_cnt is null");
            return (Criteria) this;
        }

        public Criteria andTranCntIsNotNull() {
            addCriterion("tran_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andTranCntEqualTo(Integer value) {
            addCriterion("tran_cnt =", value, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andTranCntNotEqualTo(Integer value) {
            addCriterion("tran_cnt <>", value, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andTranCntGreaterThan(Integer value) {
            addCriterion("tran_cnt >", value, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andTranCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("tran_cnt >=", value, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andTranCntLessThan(Integer value) {
            addCriterion("tran_cnt <", value, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andTranCntLessThanOrEqualTo(Integer value) {
            addCriterion("tran_cnt <=", value, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andTranCntIn(List<Integer> values) {
            addCriterion("tran_cnt in", values, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andTranCntNotIn(List<Integer> values) {
            addCriterion("tran_cnt not in", values, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andTranCntBetween(Integer value1, Integer value2) {
            addCriterion("tran_cnt between", value1, value2, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andTranCntNotBetween(Integer value1, Integer value2) {
            addCriterion("tran_cnt not between", value1, value2, "tranCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntIsNull() {
            addCriterion("pay_cnt is null");
            return (Criteria) this;
        }

        public Criteria andPayCntIsNotNull() {
            addCriterion("pay_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andPayCntEqualTo(Integer value) {
            addCriterion("pay_cnt =", value, "payCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntNotEqualTo(Integer value) {
            addCriterion("pay_cnt <>", value, "payCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntGreaterThan(Integer value) {
            addCriterion("pay_cnt >", value, "payCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_cnt >=", value, "payCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntLessThan(Integer value) {
            addCriterion("pay_cnt <", value, "payCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntLessThanOrEqualTo(Integer value) {
            addCriterion("pay_cnt <=", value, "payCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntIn(List<Integer> values) {
            addCriterion("pay_cnt in", values, "payCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntNotIn(List<Integer> values) {
            addCriterion("pay_cnt not in", values, "payCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntBetween(Integer value1, Integer value2) {
            addCriterion("pay_cnt between", value1, value2, "payCnt");
            return (Criteria) this;
        }

        public Criteria andPayCntNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_cnt not between", value1, value2, "payCnt");
            return (Criteria) this;
        }

        public Criteria andTranAmtIsNull() {
            addCriterion("tran_amt is null");
            return (Criteria) this;
        }

        public Criteria andTranAmtIsNotNull() {
            addCriterion("tran_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTranAmtEqualTo(BigDecimal value) {
            addCriterion("tran_amt =", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotEqualTo(BigDecimal value) {
            addCriterion("tran_amt <>", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtGreaterThan(BigDecimal value) {
            addCriterion("tran_amt >", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amt >=", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtLessThan(BigDecimal value) {
            addCriterion("tran_amt <", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amt <=", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtIn(List<BigDecimal> values) {
            addCriterion("tran_amt in", values, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotIn(List<BigDecimal> values) {
            addCriterion("tran_amt not in", values, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amt between", value1, value2, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amt not between", value1, value2, "tranAmt");
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