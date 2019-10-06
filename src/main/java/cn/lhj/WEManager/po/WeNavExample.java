package cn.lhj.WEManager.po;

import java.util.ArrayList;
import java.util.List;

public class WeNavExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeNavExample() {
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

        public Criteria andNavNameIsNull() {
            addCriterion("nav_name is null");
            return (Criteria) this;
        }

        public Criteria andNavNameIsNotNull() {
            addCriterion("nav_name is not null");
            return (Criteria) this;
        }

        public Criteria andNavNameEqualTo(String value) {
            addCriterion("nav_name =", value, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameNotEqualTo(String value) {
            addCriterion("nav_name <>", value, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameGreaterThan(String value) {
            addCriterion("nav_name >", value, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameGreaterThanOrEqualTo(String value) {
            addCriterion("nav_name >=", value, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameLessThan(String value) {
            addCriterion("nav_name <", value, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameLessThanOrEqualTo(String value) {
            addCriterion("nav_name <=", value, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameLike(String value) {
            addCriterion("nav_name like", value, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameNotLike(String value) {
            addCriterion("nav_name not like", value, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameIn(List<String> values) {
            addCriterion("nav_name in", values, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameNotIn(List<String> values) {
            addCriterion("nav_name not in", values, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameBetween(String value1, String value2) {
            addCriterion("nav_name between", value1, value2, "navName");
            return (Criteria) this;
        }

        public Criteria andNavNameNotBetween(String value1, String value2) {
            addCriterion("nav_name not between", value1, value2, "navName");
            return (Criteria) this;
        }

        public Criteria andNavUrlIsNull() {
            addCriterion("nav_url is null");
            return (Criteria) this;
        }

        public Criteria andNavUrlIsNotNull() {
            addCriterion("nav_url is not null");
            return (Criteria) this;
        }

        public Criteria andNavUrlEqualTo(String value) {
            addCriterion("nav_url =", value, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlNotEqualTo(String value) {
            addCriterion("nav_url <>", value, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlGreaterThan(String value) {
            addCriterion("nav_url >", value, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlGreaterThanOrEqualTo(String value) {
            addCriterion("nav_url >=", value, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlLessThan(String value) {
            addCriterion("nav_url <", value, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlLessThanOrEqualTo(String value) {
            addCriterion("nav_url <=", value, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlLike(String value) {
            addCriterion("nav_url like", value, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlNotLike(String value) {
            addCriterion("nav_url not like", value, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlIn(List<String> values) {
            addCriterion("nav_url in", values, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlNotIn(List<String> values) {
            addCriterion("nav_url not in", values, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlBetween(String value1, String value2) {
            addCriterion("nav_url between", value1, value2, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavUrlNotBetween(String value1, String value2) {
            addCriterion("nav_url not between", value1, value2, "navUrl");
            return (Criteria) this;
        }

        public Criteria andNavSortIsNull() {
            addCriterion("nav_sort is null");
            return (Criteria) this;
        }

        public Criteria andNavSortIsNotNull() {
            addCriterion("nav_sort is not null");
            return (Criteria) this;
        }

        public Criteria andNavSortEqualTo(Integer value) {
            addCriterion("nav_sort =", value, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavSortNotEqualTo(Integer value) {
            addCriterion("nav_sort <>", value, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavSortGreaterThan(Integer value) {
            addCriterion("nav_sort >", value, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("nav_sort >=", value, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavSortLessThan(Integer value) {
            addCriterion("nav_sort <", value, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavSortLessThanOrEqualTo(Integer value) {
            addCriterion("nav_sort <=", value, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavSortIn(List<Integer> values) {
            addCriterion("nav_sort in", values, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavSortNotIn(List<Integer> values) {
            addCriterion("nav_sort not in", values, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavSortBetween(Integer value1, Integer value2) {
            addCriterion("nav_sort between", value1, value2, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavSortNotBetween(Integer value1, Integer value2) {
            addCriterion("nav_sort not between", value1, value2, "navSort");
            return (Criteria) this;
        }

        public Criteria andNavStatusIsNull() {
            addCriterion("nav_status is null");
            return (Criteria) this;
        }

        public Criteria andNavStatusIsNotNull() {
            addCriterion("nav_status is not null");
            return (Criteria) this;
        }

        public Criteria andNavStatusEqualTo(Integer value) {
            addCriterion("nav_status =", value, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavStatusNotEqualTo(Integer value) {
            addCriterion("nav_status <>", value, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavStatusGreaterThan(Integer value) {
            addCriterion("nav_status >", value, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("nav_status >=", value, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavStatusLessThan(Integer value) {
            addCriterion("nav_status <", value, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavStatusLessThanOrEqualTo(Integer value) {
            addCriterion("nav_status <=", value, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavStatusIn(List<Integer> values) {
            addCriterion("nav_status in", values, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavStatusNotIn(List<Integer> values) {
            addCriterion("nav_status not in", values, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavStatusBetween(Integer value1, Integer value2) {
            addCriterion("nav_status between", value1, value2, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("nav_status not between", value1, value2, "navStatus");
            return (Criteria) this;
        }

        public Criteria andNavContentIsNull() {
            addCriterion("nav_content is null");
            return (Criteria) this;
        }

        public Criteria andNavContentIsNotNull() {
            addCriterion("nav_content is not null");
            return (Criteria) this;
        }

        public Criteria andNavContentEqualTo(String value) {
            addCriterion("nav_content =", value, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentNotEqualTo(String value) {
            addCriterion("nav_content <>", value, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentGreaterThan(String value) {
            addCriterion("nav_content >", value, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentGreaterThanOrEqualTo(String value) {
            addCriterion("nav_content >=", value, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentLessThan(String value) {
            addCriterion("nav_content <", value, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentLessThanOrEqualTo(String value) {
            addCriterion("nav_content <=", value, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentLike(String value) {
            addCriterion("nav_content like", value, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentNotLike(String value) {
            addCriterion("nav_content not like", value, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentIn(List<String> values) {
            addCriterion("nav_content in", values, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentNotIn(List<String> values) {
            addCriterion("nav_content not in", values, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentBetween(String value1, String value2) {
            addCriterion("nav_content between", value1, value2, "navContent");
            return (Criteria) this;
        }

        public Criteria andNavContentNotBetween(String value1, String value2) {
            addCriterion("nav_content not between", value1, value2, "navContent");
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