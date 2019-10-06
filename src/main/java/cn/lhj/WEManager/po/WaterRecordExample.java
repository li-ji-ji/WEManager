package cn.lhj.WEManager.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WaterRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaterRecordExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(String value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(String value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(String value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(String value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(String value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLike(String value) {
            addCriterion("house_id like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotLike(String value) {
            addCriterion("house_id not like", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<String> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<String> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(String value1, String value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(String value1, String value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andLastNumIsNull() {
            addCriterion("last_num is null");
            return (Criteria) this;
        }

        public Criteria andLastNumIsNotNull() {
            addCriterion("last_num is not null");
            return (Criteria) this;
        }

        public Criteria andLastNumEqualTo(Double value) {
            addCriterion("last_num =", value, "lastNum");
            return (Criteria) this;
        }

        public Criteria andLastNumNotEqualTo(Double value) {
            addCriterion("last_num <>", value, "lastNum");
            return (Criteria) this;
        }

        public Criteria andLastNumGreaterThan(Double value) {
            addCriterion("last_num >", value, "lastNum");
            return (Criteria) this;
        }

        public Criteria andLastNumGreaterThanOrEqualTo(Double value) {
            addCriterion("last_num >=", value, "lastNum");
            return (Criteria) this;
        }

        public Criteria andLastNumLessThan(Double value) {
            addCriterion("last_num <", value, "lastNum");
            return (Criteria) this;
        }

        public Criteria andLastNumLessThanOrEqualTo(Double value) {
            addCriterion("last_num <=", value, "lastNum");
            return (Criteria) this;
        }

        public Criteria andLastNumIn(List<Double> values) {
            addCriterion("last_num in", values, "lastNum");
            return (Criteria) this;
        }

        public Criteria andLastNumNotIn(List<Double> values) {
            addCriterion("last_num not in", values, "lastNum");
            return (Criteria) this;
        }

        public Criteria andLastNumBetween(Double value1, Double value2) {
            addCriterion("last_num between", value1, value2, "lastNum");
            return (Criteria) this;
        }

        public Criteria andLastNumNotBetween(Double value1, Double value2) {
            addCriterion("last_num not between", value1, value2, "lastNum");
            return (Criteria) this;
        }

        public Criteria andThisNumIsNull() {
            addCriterion("this_num is null");
            return (Criteria) this;
        }

        public Criteria andThisNumIsNotNull() {
            addCriterion("this_num is not null");
            return (Criteria) this;
        }

        public Criteria andThisNumEqualTo(Double value) {
            addCriterion("this_num =", value, "thisNum");
            return (Criteria) this;
        }

        public Criteria andThisNumNotEqualTo(Double value) {
            addCriterion("this_num <>", value, "thisNum");
            return (Criteria) this;
        }

        public Criteria andThisNumGreaterThan(Double value) {
            addCriterion("this_num >", value, "thisNum");
            return (Criteria) this;
        }

        public Criteria andThisNumGreaterThanOrEqualTo(Double value) {
            addCriterion("this_num >=", value, "thisNum");
            return (Criteria) this;
        }

        public Criteria andThisNumLessThan(Double value) {
            addCriterion("this_num <", value, "thisNum");
            return (Criteria) this;
        }

        public Criteria andThisNumLessThanOrEqualTo(Double value) {
            addCriterion("this_num <=", value, "thisNum");
            return (Criteria) this;
        }

        public Criteria andThisNumIn(List<Double> values) {
            addCriterion("this_num in", values, "thisNum");
            return (Criteria) this;
        }

        public Criteria andThisNumNotIn(List<Double> values) {
            addCriterion("this_num not in", values, "thisNum");
            return (Criteria) this;
        }

        public Criteria andThisNumBetween(Double value1, Double value2) {
            addCriterion("this_num between", value1, value2, "thisNum");
            return (Criteria) this;
        }

        public Criteria andThisNumNotBetween(Double value1, Double value2) {
            addCriterion("this_num not between", value1, value2, "thisNum");
            return (Criteria) this;
        }

        public Criteria andUseNumIsNull() {
            addCriterion("use_num is null");
            return (Criteria) this;
        }

        public Criteria andUseNumIsNotNull() {
            addCriterion("use_num is not null");
            return (Criteria) this;
        }

        public Criteria andUseNumEqualTo(Double value) {
            addCriterion("use_num =", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotEqualTo(Double value) {
            addCriterion("use_num <>", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumGreaterThan(Double value) {
            addCriterion("use_num >", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumGreaterThanOrEqualTo(Double value) {
            addCriterion("use_num >=", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumLessThan(Double value) {
            addCriterion("use_num <", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumLessThanOrEqualTo(Double value) {
            addCriterion("use_num <=", value, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumIn(List<Double> values) {
            addCriterion("use_num in", values, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotIn(List<Double> values) {
            addCriterion("use_num not in", values, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumBetween(Double value1, Double value2) {
            addCriterion("use_num between", value1, value2, "useNum");
            return (Criteria) this;
        }

        public Criteria andUseNumNotBetween(Double value1, Double value2) {
            addCriterion("use_num not between", value1, value2, "useNum");
            return (Criteria) this;
        }

        public Criteria andCostNumIsNull() {
            addCriterion("cost_num is null");
            return (Criteria) this;
        }

        public Criteria andCostNumIsNotNull() {
            addCriterion("cost_num is not null");
            return (Criteria) this;
        }

        public Criteria andCostNumEqualTo(Double value) {
            addCriterion("cost_num =", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumNotEqualTo(Double value) {
            addCriterion("cost_num <>", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumGreaterThan(Double value) {
            addCriterion("cost_num >", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_num >=", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumLessThan(Double value) {
            addCriterion("cost_num <", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumLessThanOrEqualTo(Double value) {
            addCriterion("cost_num <=", value, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumIn(List<Double> values) {
            addCriterion("cost_num in", values, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumNotIn(List<Double> values) {
            addCriterion("cost_num not in", values, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumBetween(Double value1, Double value2) {
            addCriterion("cost_num between", value1, value2, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostNumNotBetween(Double value1, Double value2) {
            addCriterion("cost_num not between", value1, value2, "costNum");
            return (Criteria) this;
        }

        public Criteria andCostStatusIsNull() {
            addCriterion("cost_status is null");
            return (Criteria) this;
        }

        public Criteria andCostStatusIsNotNull() {
            addCriterion("cost_status is not null");
            return (Criteria) this;
        }

        public Criteria andCostStatusEqualTo(Integer value) {
            addCriterion("cost_status =", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusNotEqualTo(Integer value) {
            addCriterion("cost_status <>", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusGreaterThan(Integer value) {
            addCriterion("cost_status >", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_status >=", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusLessThan(Integer value) {
            addCriterion("cost_status <", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cost_status <=", value, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusIn(List<Integer> values) {
            addCriterion("cost_status in", values, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusNotIn(List<Integer> values) {
            addCriterion("cost_status not in", values, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusBetween(Integer value1, Integer value2) {
            addCriterion("cost_status between", value1, value2, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_status not between", value1, value2, "costStatus");
            return (Criteria) this;
        }

        public Criteria andCostTimeIsNull() {
            addCriterion("cost_time is null");
            return (Criteria) this;
        }

        public Criteria andCostTimeIsNotNull() {
            addCriterion("cost_time is not null");
            return (Criteria) this;
        }

        public Criteria andCostTimeEqualTo(Date value) {
            addCriterion("cost_time =", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotEqualTo(Date value) {
            addCriterion("cost_time <>", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeGreaterThan(Date value) {
            addCriterion("cost_time >", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cost_time >=", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeLessThan(Date value) {
            addCriterion("cost_time <", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeLessThanOrEqualTo(Date value) {
            addCriterion("cost_time <=", value, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeIn(List<Date> values) {
            addCriterion("cost_time in", values, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotIn(List<Date> values) {
            addCriterion("cost_time not in", values, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeBetween(Date value1, Date value2) {
            addCriterion("cost_time between", value1, value2, "costTime");
            return (Criteria) this;
        }

        public Criteria andCostTimeNotBetween(Date value1, Date value2) {
            addCriterion("cost_time not between", value1, value2, "costTime");
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