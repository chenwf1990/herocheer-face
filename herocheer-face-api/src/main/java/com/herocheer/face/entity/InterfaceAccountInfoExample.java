package com.herocheer.face.entity;

import java.util.ArrayList;
import java.util.List;

public class InterfaceAccountInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterfaceAccountInfoExample() {
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

        public Criteria andUserKeyIsNull() {
            addCriterion("userKey is null");
            return (Criteria) this;
        }

        public Criteria andUserKeyIsNotNull() {
            addCriterion("userKey is not null");
            return (Criteria) this;
        }

        public Criteria andUserKeyEqualTo(String value) {
            addCriterion("userKey =", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotEqualTo(String value) {
            addCriterion("userKey <>", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThan(String value) {
            addCriterion("userKey >", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThanOrEqualTo(String value) {
            addCriterion("userKey >=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThan(String value) {
            addCriterion("userKey <", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThanOrEqualTo(String value) {
            addCriterion("userKey <=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLike(String value) {
            addCriterion("userKey like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotLike(String value) {
            addCriterion("userKey not like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyIn(List<String> values) {
            addCriterion("userKey in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotIn(List<String> values) {
            addCriterion("userKey not in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyBetween(String value1, String value2) {
            addCriterion("userKey between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotBetween(String value1, String value2) {
            addCriterion("userKey not between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserAuthIsNull() {
            addCriterion("userAuth is null");
            return (Criteria) this;
        }

        public Criteria andUserAuthIsNotNull() {
            addCriterion("userAuth is not null");
            return (Criteria) this;
        }

        public Criteria andUserAuthEqualTo(String value) {
            addCriterion("userAuth =", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotEqualTo(String value) {
            addCriterion("userAuth <>", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthGreaterThan(String value) {
            addCriterion("userAuth >", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthGreaterThanOrEqualTo(String value) {
            addCriterion("userAuth >=", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthLessThan(String value) {
            addCriterion("userAuth <", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthLessThanOrEqualTo(String value) {
            addCriterion("userAuth <=", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthLike(String value) {
            addCriterion("userAuth like", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotLike(String value) {
            addCriterion("userAuth not like", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthIn(List<String> values) {
            addCriterion("userAuth in", values, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotIn(List<String> values) {
            addCriterion("userAuth not in", values, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthBetween(String value1, String value2) {
            addCriterion("userAuth between", value1, value2, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotBetween(String value1, String value2) {
            addCriterion("userAuth not between", value1, value2, "userAuth");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountIsNull() {
            addCriterion("dayMaxCount is null");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountIsNotNull() {
            addCriterion("dayMaxCount is not null");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountEqualTo(Integer value) {
            addCriterion("dayMaxCount =", value, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountNotEqualTo(Integer value) {
            addCriterion("dayMaxCount <>", value, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountGreaterThan(Integer value) {
            addCriterion("dayMaxCount >", value, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dayMaxCount >=", value, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountLessThan(Integer value) {
            addCriterion("dayMaxCount <", value, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountLessThanOrEqualTo(Integer value) {
            addCriterion("dayMaxCount <=", value, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountIn(List<Integer> values) {
            addCriterion("dayMaxCount in", values, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountNotIn(List<Integer> values) {
            addCriterion("dayMaxCount not in", values, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountBetween(Integer value1, Integer value2) {
            addCriterion("dayMaxCount between", value1, value2, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andDayMaxCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dayMaxCount not between", value1, value2, "dayMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountIsNull() {
            addCriterion("monthMaxCount is null");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountIsNotNull() {
            addCriterion("monthMaxCount is not null");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountEqualTo(Integer value) {
            addCriterion("monthMaxCount =", value, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountNotEqualTo(Integer value) {
            addCriterion("monthMaxCount <>", value, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountGreaterThan(Integer value) {
            addCriterion("monthMaxCount >", value, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthMaxCount >=", value, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountLessThan(Integer value) {
            addCriterion("monthMaxCount <", value, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountLessThanOrEqualTo(Integer value) {
            addCriterion("monthMaxCount <=", value, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountIn(List<Integer> values) {
            addCriterion("monthMaxCount in", values, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountNotIn(List<Integer> values) {
            addCriterion("monthMaxCount not in", values, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountBetween(Integer value1, Integer value2) {
            addCriterion("monthMaxCount between", value1, value2, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andMonthMaxCountNotBetween(Integer value1, Integer value2) {
            addCriterion("monthMaxCount not between", value1, value2, "monthMaxCount");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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