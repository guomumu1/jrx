package com.jrx.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionItemExample() {
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

        public Criteria andTransIdIsNull() {
            addCriterion("trans_id is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(Integer value) {
            addCriterion("trans_id =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(Integer value) {
            addCriterion("trans_id <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(Integer value) {
            addCriterion("trans_id >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_id >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(Integer value) {
            addCriterion("trans_id <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(Integer value) {
            addCriterion("trans_id <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<Integer> values) {
            addCriterion("trans_id in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<Integer> values) {
            addCriterion("trans_id not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(Integer value1, Integer value2) {
            addCriterion("trans_id between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_id not between", value1, value2, "transId");
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andCardNbrIsNull() {
            addCriterion("card_nbr is null");
            return (Criteria) this;
        }

        public Criteria andCardNbrIsNotNull() {
            addCriterion("card_nbr is not null");
            return (Criteria) this;
        }

        public Criteria andCardNbrEqualTo(String value) {
            addCriterion("card_nbr =", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrNotEqualTo(String value) {
            addCriterion("card_nbr <>", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrGreaterThan(String value) {
            addCriterion("card_nbr >", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrGreaterThanOrEqualTo(String value) {
            addCriterion("card_nbr >=", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrLessThan(String value) {
            addCriterion("card_nbr <", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrLessThanOrEqualTo(String value) {
            addCriterion("card_nbr <=", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrLike(String value) {
            addCriterion("card_nbr like", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrNotLike(String value) {
            addCriterion("card_nbr not like", value, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrIn(List<String> values) {
            addCriterion("card_nbr in", values, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrNotIn(List<String> values) {
            addCriterion("card_nbr not in", values, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrBetween(String value1, String value2) {
            addCriterion("card_nbr between", value1, value2, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andCardNbrNotBetween(String value1, String value2) {
            addCriterion("card_nbr not between", value1, value2, "cardNbr");
            return (Criteria) this;
        }

        public Criteria andTrannoIsNull() {
            addCriterion("tranno is null");
            return (Criteria) this;
        }

        public Criteria andTrannoIsNotNull() {
            addCriterion("tranno is not null");
            return (Criteria) this;
        }

        public Criteria andTrannoEqualTo(Integer value) {
            addCriterion("tranno =", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotEqualTo(Integer value) {
            addCriterion("tranno <>", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoGreaterThan(Integer value) {
            addCriterion("tranno >", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tranno >=", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoLessThan(Integer value) {
            addCriterion("tranno <", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoLessThanOrEqualTo(Integer value) {
            addCriterion("tranno <=", value, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoIn(List<Integer> values) {
            addCriterion("tranno in", values, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotIn(List<Integer> values) {
            addCriterion("tranno not in", values, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoBetween(Integer value1, Integer value2) {
            addCriterion("tranno between", value1, value2, "tranno");
            return (Criteria) this;
        }

        public Criteria andTrannoNotBetween(Integer value1, Integer value2) {
            addCriterion("tranno not between", value1, value2, "tranno");
            return (Criteria) this;
        }

        public Criteria andMonthNbrIsNull() {
            addCriterion("month_nbr is null");
            return (Criteria) this;
        }

        public Criteria andMonthNbrIsNotNull() {
            addCriterion("month_nbr is not null");
            return (Criteria) this;
        }

        public Criteria andMonthNbrEqualTo(Integer value) {
            addCriterion("month_nbr =", value, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andMonthNbrNotEqualTo(Integer value) {
            addCriterion("month_nbr <>", value, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andMonthNbrGreaterThan(Integer value) {
            addCriterion("month_nbr >", value, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andMonthNbrGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_nbr >=", value, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andMonthNbrLessThan(Integer value) {
            addCriterion("month_nbr <", value, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andMonthNbrLessThanOrEqualTo(Integer value) {
            addCriterion("month_nbr <=", value, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andMonthNbrIn(List<Integer> values) {
            addCriterion("month_nbr in", values, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andMonthNbrNotIn(List<Integer> values) {
            addCriterion("month_nbr not in", values, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andMonthNbrBetween(Integer value1, Integer value2) {
            addCriterion("month_nbr between", value1, value2, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andMonthNbrNotBetween(Integer value1, Integer value2) {
            addCriterion("month_nbr not between", value1, value2, "monthNbr");
            return (Criteria) this;
        }

        public Criteria andBillIsNull() {
            addCriterion("bill is null");
            return (Criteria) this;
        }

        public Criteria andBillIsNotNull() {
            addCriterion("bill is not null");
            return (Criteria) this;
        }

        public Criteria andBillEqualTo(BigDecimal value) {
            addCriterion("bill =", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotEqualTo(BigDecimal value) {
            addCriterion("bill <>", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThan(BigDecimal value) {
            addCriterion("bill >", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bill >=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThan(BigDecimal value) {
            addCriterion("bill <", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bill <=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillIn(List<BigDecimal> values) {
            addCriterion("bill in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotIn(List<BigDecimal> values) {
            addCriterion("bill not in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill not between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("trans_type is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("trans_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(String value) {
            addCriterion("trans_type =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(String value) {
            addCriterion("trans_type <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(String value) {
            addCriterion("trans_type >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trans_type >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(String value) {
            addCriterion("trans_type <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(String value) {
            addCriterion("trans_type <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLike(String value) {
            addCriterion("trans_type like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotLike(String value) {
            addCriterion("trans_type not like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<String> values) {
            addCriterion("trans_type in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<String> values) {
            addCriterion("trans_type not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(String value1, String value2) {
            addCriterion("trans_type between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(String value1, String value2) {
            addCriterion("trans_type not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeIsNull() {
            addCriterion("txn_datetime is null");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeIsNotNull() {
            addCriterion("txn_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeEqualTo(Date value) {
            addCriterion("txn_datetime =", value, "txnDatetime");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeNotEqualTo(Date value) {
            addCriterion("txn_datetime <>", value, "txnDatetime");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeGreaterThan(Date value) {
            addCriterion("txn_datetime >", value, "txnDatetime");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("txn_datetime >=", value, "txnDatetime");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeLessThan(Date value) {
            addCriterion("txn_datetime <", value, "txnDatetime");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("txn_datetime <=", value, "txnDatetime");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeIn(List<Date> values) {
            addCriterion("txn_datetime in", values, "txnDatetime");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeNotIn(List<Date> values) {
            addCriterion("txn_datetime not in", values, "txnDatetime");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeBetween(Date value1, Date value2) {
            addCriterion("txn_datetime between", value1, value2, "txnDatetime");
            return (Criteria) this;
        }

        public Criteria andTxnDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("txn_datetime not between", value1, value2, "txnDatetime");
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