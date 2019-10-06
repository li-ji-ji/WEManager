package cn.lhj.WEManager.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WaterElectRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaterElectRecordExample() {
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

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterionForJDBCDate("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterionForJDBCDate("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterionForJDBCDate("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andLastElectNumIsNull() {
            addCriterion("last_elect_num is null");
            return (Criteria) this;
        }

        public Criteria andLastElectNumIsNotNull() {
            addCriterion("last_elect_num is not null");
            return (Criteria) this;
        }

        public Criteria andLastElectNumEqualTo(Double value) {
            addCriterion("last_elect_num =", value, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andLastElectNumNotEqualTo(Double value) {
            addCriterion("last_elect_num <>", value, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andLastElectNumGreaterThan(Double value) {
            addCriterion("last_elect_num >", value, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andLastElectNumGreaterThanOrEqualTo(Double value) {
            addCriterion("last_elect_num >=", value, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andLastElectNumLessThan(Double value) {
            addCriterion("last_elect_num <", value, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andLastElectNumLessThanOrEqualTo(Double value) {
            addCriterion("last_elect_num <=", value, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andLastElectNumIn(List<Double> values) {
            addCriterion("last_elect_num in", values, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andLastElectNumNotIn(List<Double> values) {
            addCriterion("last_elect_num not in", values, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andLastElectNumBetween(Double value1, Double value2) {
            addCriterion("last_elect_num between", value1, value2, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andLastElectNumNotBetween(Double value1, Double value2) {
            addCriterion("last_elect_num not between", value1, value2, "lastElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumIsNull() {
            addCriterion("this_elect_num is null");
            return (Criteria) this;
        }

        public Criteria andThisElectNumIsNotNull() {
            addCriterion("this_elect_num is not null");
            return (Criteria) this;
        }

        public Criteria andThisElectNumEqualTo(Double value) {
            addCriterion("this_elect_num =", value, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumNotEqualTo(Double value) {
            addCriterion("this_elect_num <>", value, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumGreaterThan(Double value) {
            addCriterion("this_elect_num >", value, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumGreaterThanOrEqualTo(Double value) {
            addCriterion("this_elect_num >=", value, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumLessThan(Double value) {
            addCriterion("this_elect_num <", value, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumLessThanOrEqualTo(Double value) {
            addCriterion("this_elect_num <=", value, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumIn(List<Double> values) {
            addCriterion("this_elect_num in", values, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumNotIn(List<Double> values) {
            addCriterion("this_elect_num not in", values, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumBetween(Double value1, Double value2) {
            addCriterion("this_elect_num between", value1, value2, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andThisElectNumNotBetween(Double value1, Double value2) {
            addCriterion("this_elect_num not between", value1, value2, "thisElectNum");
            return (Criteria) this;
        }

        public Criteria andElectNumIsNull() {
            addCriterion("elect_num is null");
            return (Criteria) this;
        }

        public Criteria andElectNumIsNotNull() {
            addCriterion("elect_num is not null");
            return (Criteria) this;
        }

        public Criteria andElectNumEqualTo(Double value) {
            addCriterion("elect_num =", value, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectNumNotEqualTo(Double value) {
            addCriterion("elect_num <>", value, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectNumGreaterThan(Double value) {
            addCriterion("elect_num >", value, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectNumGreaterThanOrEqualTo(Double value) {
            addCriterion("elect_num >=", value, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectNumLessThan(Double value) {
            addCriterion("elect_num <", value, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectNumLessThanOrEqualTo(Double value) {
            addCriterion("elect_num <=", value, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectNumIn(List<Double> values) {
            addCriterion("elect_num in", values, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectNumNotIn(List<Double> values) {
            addCriterion("elect_num not in", values, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectNumBetween(Double value1, Double value2) {
            addCriterion("elect_num between", value1, value2, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectNumNotBetween(Double value1, Double value2) {
            addCriterion("elect_num not between", value1, value2, "electNum");
            return (Criteria) this;
        }

        public Criteria andElectCostIsNull() {
            addCriterion("elect_cost is null");
            return (Criteria) this;
        }

        public Criteria andElectCostIsNotNull() {
            addCriterion("elect_cost is not null");
            return (Criteria) this;
        }

        public Criteria andElectCostEqualTo(Double value) {
            addCriterion("elect_cost =", value, "electCost");
            return (Criteria) this;
        }

        public Criteria andElectCostNotEqualTo(Double value) {
            addCriterion("elect_cost <>", value, "electCost");
            return (Criteria) this;
        }

        public Criteria andElectCostGreaterThan(Double value) {
            addCriterion("elect_cost >", value, "electCost");
            return (Criteria) this;
        }

        public Criteria andElectCostGreaterThanOrEqualTo(Double value) {
            addCriterion("elect_cost >=", value, "electCost");
            return (Criteria) this;
        }

        public Criteria andElectCostLessThan(Double value) {
            addCriterion("elect_cost <", value, "electCost");
            return (Criteria) this;
        }

        public Criteria andElectCostLessThanOrEqualTo(Double value) {
            addCriterion("elect_cost <=", value, "electCost");
            return (Criteria) this;
        }

        public Criteria andElectCostIn(List<Double> values) {
            addCriterion("elect_cost in", values, "electCost");
            return (Criteria) this;
        }

        public Criteria andElectCostNotIn(List<Double> values) {
            addCriterion("elect_cost not in", values, "electCost");
            return (Criteria) this;
        }

        public Criteria andElectCostBetween(Double value1, Double value2) {
            addCriterion("elect_cost between", value1, value2, "electCost");
            return (Criteria) this;
        }

        public Criteria andElectCostNotBetween(Double value1, Double value2) {
            addCriterion("elect_cost not between", value1, value2, "electCost");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumIsNull() {
            addCriterion("last_water_num is null");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumIsNotNull() {
            addCriterion("last_water_num is not null");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumEqualTo(Double value) {
            addCriterion("last_water_num =", value, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumNotEqualTo(Double value) {
            addCriterion("last_water_num <>", value, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumGreaterThan(Double value) {
            addCriterion("last_water_num >", value, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumGreaterThanOrEqualTo(Double value) {
            addCriterion("last_water_num >=", value, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumLessThan(Double value) {
            addCriterion("last_water_num <", value, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumLessThanOrEqualTo(Double value) {
            addCriterion("last_water_num <=", value, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumIn(List<Double> values) {
            addCriterion("last_water_num in", values, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumNotIn(List<Double> values) {
            addCriterion("last_water_num not in", values, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumBetween(Double value1, Double value2) {
            addCriterion("last_water_num between", value1, value2, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andLastWaterNumNotBetween(Double value1, Double value2) {
            addCriterion("last_water_num not between", value1, value2, "lastWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumIsNull() {
            addCriterion("this_water_num is null");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumIsNotNull() {
            addCriterion("this_water_num is not null");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumEqualTo(Double value) {
            addCriterion("this_water_num =", value, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumNotEqualTo(Double value) {
            addCriterion("this_water_num <>", value, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumGreaterThan(Double value) {
            addCriterion("this_water_num >", value, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumGreaterThanOrEqualTo(Double value) {
            addCriterion("this_water_num >=", value, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumLessThan(Double value) {
            addCriterion("this_water_num <", value, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumLessThanOrEqualTo(Double value) {
            addCriterion("this_water_num <=", value, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumIn(List<Double> values) {
            addCriterion("this_water_num in", values, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumNotIn(List<Double> values) {
            addCriterion("this_water_num not in", values, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumBetween(Double value1, Double value2) {
            addCriterion("this_water_num between", value1, value2, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andThisWaterNumNotBetween(Double value1, Double value2) {
            addCriterion("this_water_num not between", value1, value2, "thisWaterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumIsNull() {
            addCriterion("water_num is null");
            return (Criteria) this;
        }

        public Criteria andWaterNumIsNotNull() {
            addCriterion("water_num is not null");
            return (Criteria) this;
        }

        public Criteria andWaterNumEqualTo(Double value) {
            addCriterion("water_num =", value, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumNotEqualTo(Double value) {
            addCriterion("water_num <>", value, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumGreaterThan(Double value) {
            addCriterion("water_num >", value, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumGreaterThanOrEqualTo(Double value) {
            addCriterion("water_num >=", value, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumLessThan(Double value) {
            addCriterion("water_num <", value, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumLessThanOrEqualTo(Double value) {
            addCriterion("water_num <=", value, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumIn(List<Double> values) {
            addCriterion("water_num in", values, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumNotIn(List<Double> values) {
            addCriterion("water_num not in", values, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumBetween(Double value1, Double value2) {
            addCriterion("water_num between", value1, value2, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterNumNotBetween(Double value1, Double value2) {
            addCriterion("water_num not between", value1, value2, "waterNum");
            return (Criteria) this;
        }

        public Criteria andWaterCostIsNull() {
            addCriterion("water_cost is null");
            return (Criteria) this;
        }

        public Criteria andWaterCostIsNotNull() {
            addCriterion("water_cost is not null");
            return (Criteria) this;
        }

        public Criteria andWaterCostEqualTo(Double value) {
            addCriterion("water_cost =", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostNotEqualTo(Double value) {
            addCriterion("water_cost <>", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostGreaterThan(Double value) {
            addCriterion("water_cost >", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostGreaterThanOrEqualTo(Double value) {
            addCriterion("water_cost >=", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostLessThan(Double value) {
            addCriterion("water_cost <", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostLessThanOrEqualTo(Double value) {
            addCriterion("water_cost <=", value, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostIn(List<Double> values) {
            addCriterion("water_cost in", values, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostNotIn(List<Double> values) {
            addCriterion("water_cost not in", values, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostBetween(Double value1, Double value2) {
            addCriterion("water_cost between", value1, value2, "waterCost");
            return (Criteria) this;
        }

        public Criteria andWaterCostNotBetween(Double value1, Double value2) {
            addCriterion("water_cost not between", value1, value2, "waterCost");
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