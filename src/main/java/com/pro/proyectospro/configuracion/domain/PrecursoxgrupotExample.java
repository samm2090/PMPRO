package com.pro.proyectospro.configuracion.domain;

import java.util.ArrayList;
import java.util.List;

public class PrecursoxgrupotExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public PrecursoxgrupotExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andCodigoIsNull() {
			addCriterion("codigo is null");
			return (Criteria) this;
		}

		public Criteria andCodigoIsNotNull() {
			addCriterion("codigo is not null");
			return (Criteria) this;
		}

		public Criteria andCodigoEqualTo(Integer value) {
			addCriterion("codigo =", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotEqualTo(Integer value) {
			addCriterion("codigo <>", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoGreaterThan(Integer value) {
			addCriterion("codigo >", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoGreaterThanOrEqualTo(Integer value) {
			addCriterion("codigo >=", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoLessThan(Integer value) {
			addCriterion("codigo <", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoLessThanOrEqualTo(Integer value) {
			addCriterion("codigo <=", value, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoIn(List<Integer> values) {
			addCriterion("codigo in", values, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotIn(List<Integer> values) {
			addCriterion("codigo not in", values, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoBetween(Integer value1, Integer value2) {
			addCriterion("codigo between", value1, value2, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodigoNotBetween(Integer value1, Integer value2) {
			addCriterion("codigo not between", value1, value2, "codigo");
			return (Criteria) this;
		}

		public Criteria andCodrecursoIsNull() {
			addCriterion("codRecurso is null");
			return (Criteria) this;
		}

		public Criteria andCodrecursoIsNotNull() {
			addCriterion("codRecurso is not null");
			return (Criteria) this;
		}

		public Criteria andCodrecursoEqualTo(Integer value) {
			addCriterion("codRecurso =", value, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodrecursoNotEqualTo(Integer value) {
			addCriterion("codRecurso <>", value, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodrecursoGreaterThan(Integer value) {
			addCriterion("codRecurso >", value, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodrecursoGreaterThanOrEqualTo(Integer value) {
			addCriterion("codRecurso >=", value, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodrecursoLessThan(Integer value) {
			addCriterion("codRecurso <", value, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodrecursoLessThanOrEqualTo(Integer value) {
			addCriterion("codRecurso <=", value, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodrecursoIn(List<Integer> values) {
			addCriterion("codRecurso in", values, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodrecursoNotIn(List<Integer> values) {
			addCriterion("codRecurso not in", values, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodrecursoBetween(Integer value1, Integer value2) {
			addCriterion("codRecurso between", value1, value2, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodrecursoNotBetween(Integer value1, Integer value2) {
			addCriterion("codRecurso not between", value1, value2, "codrecurso");
			return (Criteria) this;
		}

		public Criteria andCodatareaIsNull() {
			addCriterion("codATarea is null");
			return (Criteria) this;
		}

		public Criteria andCodatareaIsNotNull() {
			addCriterion("codATarea is not null");
			return (Criteria) this;
		}

		public Criteria andCodatareaEqualTo(Integer value) {
			addCriterion("codATarea =", value, "codatarea");
			return (Criteria) this;
		}

		public Criteria andCodatareaNotEqualTo(Integer value) {
			addCriterion("codATarea <>", value, "codatarea");
			return (Criteria) this;
		}

		public Criteria andCodatareaGreaterThan(Integer value) {
			addCriterion("codATarea >", value, "codatarea");
			return (Criteria) this;
		}

		public Criteria andCodatareaGreaterThanOrEqualTo(Integer value) {
			addCriterion("codATarea >=", value, "codatarea");
			return (Criteria) this;
		}

		public Criteria andCodatareaLessThan(Integer value) {
			addCriterion("codATarea <", value, "codatarea");
			return (Criteria) this;
		}

		public Criteria andCodatareaLessThanOrEqualTo(Integer value) {
			addCriterion("codATarea <=", value, "codatarea");
			return (Criteria) this;
		}

		public Criteria andCodatareaIn(List<Integer> values) {
			addCriterion("codATarea in", values, "codatarea");
			return (Criteria) this;
		}

		public Criteria andCodatareaNotIn(List<Integer> values) {
			addCriterion("codATarea not in", values, "codatarea");
			return (Criteria) this;
		}

		public Criteria andCodatareaBetween(Integer value1, Integer value2) {
			addCriterion("codATarea between", value1, value2, "codatarea");
			return (Criteria) this;
		}

		public Criteria andCodatareaNotBetween(Integer value1, Integer value2) {
			addCriterion("codATarea not between", value1, value2, "codatarea");
			return (Criteria) this;
		}

		public Criteria andActivoIsNull() {
			addCriterion("activo is null");
			return (Criteria) this;
		}

		public Criteria andActivoIsNotNull() {
			addCriterion("activo is not null");
			return (Criteria) this;
		}

		public Criteria andActivoEqualTo(Boolean value) {
			addCriterion("activo =", value, "activo");
			return (Criteria) this;
		}

		public Criteria andActivoNotEqualTo(Boolean value) {
			addCriterion("activo <>", value, "activo");
			return (Criteria) this;
		}

		public Criteria andActivoGreaterThan(Boolean value) {
			addCriterion("activo >", value, "activo");
			return (Criteria) this;
		}

		public Criteria andActivoGreaterThanOrEqualTo(Boolean value) {
			addCriterion("activo >=", value, "activo");
			return (Criteria) this;
		}

		public Criteria andActivoLessThan(Boolean value) {
			addCriterion("activo <", value, "activo");
			return (Criteria) this;
		}

		public Criteria andActivoLessThanOrEqualTo(Boolean value) {
			addCriterion("activo <=", value, "activo");
			return (Criteria) this;
		}

		public Criteria andActivoIn(List<Boolean> values) {
			addCriterion("activo in", values, "activo");
			return (Criteria) this;
		}

		public Criteria andActivoNotIn(List<Boolean> values) {
			addCriterion("activo not in", values, "activo");
			return (Criteria) this;
		}

		public Criteria andActivoBetween(Boolean value1, Boolean value2) {
			addCriterion("activo between", value1, value2, "activo");
			return (Criteria) this;
		}

		public Criteria andActivoNotBetween(Boolean value1, Boolean value2) {
			addCriterion("activo not between", value1, value2, "activo");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table precursoxgrupot
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}