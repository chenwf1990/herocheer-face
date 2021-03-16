package com.herocheer.face.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AppOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppOrderInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdIsNull() {
            addCriterion("appAcctId is null");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdIsNotNull() {
            addCriterion("appAcctId is not null");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdEqualTo(Long value) {
            addCriterion("appAcctId =", value, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdNotEqualTo(Long value) {
            addCriterion("appAcctId <>", value, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdGreaterThan(Long value) {
            addCriterion("appAcctId >", value, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdGreaterThanOrEqualTo(Long value) {
            addCriterion("appAcctId >=", value, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdLessThan(Long value) {
            addCriterion("appAcctId <", value, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdLessThanOrEqualTo(Long value) {
            addCriterion("appAcctId <=", value, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdIn(List<Long> values) {
            addCriterion("appAcctId in", values, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdNotIn(List<Long> values) {
            addCriterion("appAcctId not in", values, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdBetween(Long value1, Long value2) {
            addCriterion("appAcctId between", value1, value2, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppAcctIdNotBetween(Long value1, Long value2) {
            addCriterion("appAcctId not between", value1, value2, "appAcctId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdIsNull() {
            addCriterion("appExpensesId is null");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdIsNotNull() {
            addCriterion("appExpensesId is not null");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdEqualTo(Long value) {
            addCriterion("appExpensesId =", value, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdNotEqualTo(Long value) {
            addCriterion("appExpensesId <>", value, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdGreaterThan(Long value) {
            addCriterion("appExpensesId >", value, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("appExpensesId >=", value, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdLessThan(Long value) {
            addCriterion("appExpensesId <", value, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdLessThanOrEqualTo(Long value) {
            addCriterion("appExpensesId <=", value, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdIn(List<Long> values) {
            addCriterion("appExpensesId in", values, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdNotIn(List<Long> values) {
            addCriterion("appExpensesId not in", values, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdBetween(Long value1, Long value2) {
            addCriterion("appExpensesId between", value1, value2, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andAppExpensesIdNotBetween(Long value1, Long value2) {
            addCriterion("appExpensesId not between", value1, value2, "appExpensesId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("orderNo <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("orderNo like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("payType =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("payType <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("payType >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payType >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("payType <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payType <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("payType in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("payType not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("payType between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payType not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNull() {
            addCriterion("payNo is null");
            return (Criteria) this;
        }

        public Criteria andPayNoIsNotNull() {
            addCriterion("payNo is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoEqualTo(String value) {
            addCriterion("payNo =", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotEqualTo(String value) {
            addCriterion("payNo <>", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThan(String value) {
            addCriterion("payNo >", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("payNo >=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThan(String value) {
            addCriterion("payNo <", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("payNo <=", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoLike(String value) {
            addCriterion("payNo like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotLike(String value) {
            addCriterion("payNo not like", value, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoIn(List<String> values) {
            addCriterion("payNo in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotIn(List<String> values) {
            addCriterion("payNo not in", values, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoBetween(String value1, String value2) {
            addCriterion("payNo between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("payNo not between", value1, value2, "payNo");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNull() {
            addCriterion("payAmount is null");
            return (Criteria) this;
        }

        public Criteria andPayAmountIsNotNull() {
            addCriterion("payAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPayAmountEqualTo(BigDecimal value) {
            addCriterion("payAmount =", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("payAmount <>", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThan(BigDecimal value) {
            addCriterion("payAmount >", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payAmount >=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThan(BigDecimal value) {
            addCriterion("payAmount <", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payAmount <=", value, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountIn(List<BigDecimal> values) {
            addCriterion("payAmount in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("payAmount not in", values, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payAmount between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payAmount not between", value1, value2, "payAmount");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeIsNull() {
            addCriterion("expireBeginTime is null");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeIsNotNull() {
            addCriterion("expireBeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeEqualTo(Long value) {
            addCriterion("expireBeginTime =", value, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeNotEqualTo(Long value) {
            addCriterion("expireBeginTime <>", value, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeGreaterThan(Long value) {
            addCriterion("expireBeginTime >", value, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("expireBeginTime >=", value, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeLessThan(Long value) {
            addCriterion("expireBeginTime <", value, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeLessThanOrEqualTo(Long value) {
            addCriterion("expireBeginTime <=", value, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeIn(List<Long> values) {
            addCriterion("expireBeginTime in", values, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeNotIn(List<Long> values) {
            addCriterion("expireBeginTime not in", values, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeBetween(Long value1, Long value2) {
            addCriterion("expireBeginTime between", value1, value2, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireBeginTimeNotBetween(Long value1, Long value2) {
            addCriterion("expireBeginTime not between", value1, value2, "expireBeginTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeIsNull() {
            addCriterion("expireEndTime is null");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeIsNotNull() {
            addCriterion("expireEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeEqualTo(Long value) {
            addCriterion("expireEndTime =", value, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeNotEqualTo(Long value) {
            addCriterion("expireEndTime <>", value, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeGreaterThan(Long value) {
            addCriterion("expireEndTime >", value, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("expireEndTime >=", value, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeLessThan(Long value) {
            addCriterion("expireEndTime <", value, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("expireEndTime <=", value, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeIn(List<Long> values) {
            addCriterion("expireEndTime in", values, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeNotIn(List<Long> values) {
            addCriterion("expireEndTime not in", values, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeBetween(Long value1, Long value2) {
            addCriterion("expireEndTime between", value1, value2, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andExpireEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("expireEndTime not between", value1, value2, "expireEndTime");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andUseNumIsNull() {
            addCriterion("useNum is null");
            return (Criteria) this;
        }

        public Criteria andUseNumIsNotNull() {
            addCriterion("useNum is not null");
            return (Criteria) this;
        }

        public Criteria andUseNumEqualTo(Integer value) {
            addCriterion("useNum =", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotEqualTo(Integer value) {
            addCriterion("useNum <>", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumGreaterThan(Integer value) {
            addCriterion("useNum >", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("useNum >=", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumLessThan(Integer value) {
            addCriterion("useNum <", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumLessThanOrEqualTo(Integer value) {
            addCriterion("useNum <=", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumIn(List<Integer> values) {
            addCriterion("useNum in", values, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotIn(List<Integer> values) {
            addCriterion("useNum not in", values, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumBetween(Integer value1, Integer value2) {
            addCriterion("useNum between", value1, value2, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("useNum not between", value1, value2, "useNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLastAccessIsNull() {
            addCriterion("lastAccess is null");
            return (Criteria) this;
        }

        public Criteria andLastAccessIsNotNull() {
            addCriterion("lastAccess is not null");
            return (Criteria) this;
        }

        public Criteria andLastAccessEqualTo(Long value) {
            addCriterion("lastAccess =", value, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andLastAccessNotEqualTo(Long value) {
            addCriterion("lastAccess <>", value, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andLastAccessGreaterThan(Long value) {
            addCriterion("lastAccess >", value, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andLastAccessGreaterThanOrEqualTo(Long value) {
            addCriterion("lastAccess >=", value, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andLastAccessLessThan(Long value) {
            addCriterion("lastAccess <", value, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andLastAccessLessThanOrEqualTo(Long value) {
            addCriterion("lastAccess <=", value, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andLastAccessIn(List<Long> values) {
            addCriterion("lastAccess in", values, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andLastAccessNotIn(List<Long> values) {
            addCriterion("lastAccess not in", values, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andLastAccessBetween(Long value1, Long value2) {
            addCriterion("lastAccess between", value1, value2, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andLastAccessNotBetween(Long value1, Long value2) {
            addCriterion("lastAccess not between", value1, value2, "lastAccess");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creatorId is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creatorId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creatorId =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creatorId <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creatorId >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creatorId >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creatorId <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creatorId <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creatorId in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creatorId not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creatorId between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creatorId not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("createdBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("createdBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("createdBy =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("createdBy <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("createdBy >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("createdBy >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("createdBy <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("createdBy <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("createdBy like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("createdBy not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("createdBy in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("createdBy not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("createdBy between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("createdBy not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("createdTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("createdTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Long value) {
            addCriterion("createdTime =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Long value) {
            addCriterion("createdTime <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Long value) {
            addCriterion("createdTime >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("createdTime >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Long value) {
            addCriterion("createdTime <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Long value) {
            addCriterion("createdTime <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Long> values) {
            addCriterion("createdTime in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Long> values) {
            addCriterion("createdTime not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Long value1, Long value2) {
            addCriterion("createdTime between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Long value1, Long value2) {
            addCriterion("createdTime not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNull() {
            addCriterion("updaterId is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIsNotNull() {
            addCriterion("updaterId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdEqualTo(Long value) {
            addCriterion("updaterId =", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotEqualTo(Long value) {
            addCriterion("updaterId <>", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThan(Long value) {
            addCriterion("updaterId >", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("updaterId >=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThan(Long value) {
            addCriterion("updaterId <", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdLessThanOrEqualTo(Long value) {
            addCriterion("updaterId <=", value, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdIn(List<Long> values) {
            addCriterion("updaterId in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotIn(List<Long> values) {
            addCriterion("updaterId not in", values, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdBetween(Long value1, Long value2) {
            addCriterion("updaterId between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdaterIdNotBetween(Long value1, Long value2) {
            addCriterion("updaterId not between", value1, value2, "updaterId");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updatedBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updatedBy =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updatedBy <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updatedBy >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updatedBy >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updatedBy <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updatedBy <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updatedBy like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updatedBy not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updatedBy in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updatedBy not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updatedBy between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updatedBy not between", value1, value2, "updatedBy");
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