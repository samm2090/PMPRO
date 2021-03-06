package com.pro.proyectospro.configuracion.domain;

import java.util.ArrayList;
import java.util.List;

public class InteresadoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table interesado
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table interesado
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table interesado
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	public InteresadoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table interesado
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table interesado
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

		public Criteria andEmpresaIsNull() {
			addCriterion("empresa is null");
			return (Criteria) this;
		}

		public Criteria andEmpresaIsNotNull() {
			addCriterion("empresa is not null");
			return (Criteria) this;
		}

		public Criteria andEmpresaEqualTo(String value) {
			addCriterion("empresa =", value, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaNotEqualTo(String value) {
			addCriterion("empresa <>", value, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaGreaterThan(String value) {
			addCriterion("empresa >", value, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaGreaterThanOrEqualTo(String value) {
			addCriterion("empresa >=", value, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaLessThan(String value) {
			addCriterion("empresa <", value, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaLessThanOrEqualTo(String value) {
			addCriterion("empresa <=", value, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaLike(String value) {
			addCriterion("empresa like", value, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaNotLike(String value) {
			addCriterion("empresa not like", value, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaIn(List<String> values) {
			addCriterion("empresa in", values, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaNotIn(List<String> values) {
			addCriterion("empresa not in", values, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaBetween(String value1, String value2) {
			addCriterion("empresa between", value1, value2, "empresa");
			return (Criteria) this;
		}

		public Criteria andEmpresaNotBetween(String value1, String value2) {
			addCriterion("empresa not between", value1, value2, "empresa");
			return (Criteria) this;
		}

		public Criteria andDireccioneIsNull() {
			addCriterion("direccionE is null");
			return (Criteria) this;
		}

		public Criteria andDireccioneIsNotNull() {
			addCriterion("direccionE is not null");
			return (Criteria) this;
		}

		public Criteria andDireccioneEqualTo(String value) {
			addCriterion("direccionE =", value, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneNotEqualTo(String value) {
			addCriterion("direccionE <>", value, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneGreaterThan(String value) {
			addCriterion("direccionE >", value, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneGreaterThanOrEqualTo(String value) {
			addCriterion("direccionE >=", value, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneLessThan(String value) {
			addCriterion("direccionE <", value, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneLessThanOrEqualTo(String value) {
			addCriterion("direccionE <=", value, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneLike(String value) {
			addCriterion("direccionE like", value, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneNotLike(String value) {
			addCriterion("direccionE not like", value, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneIn(List<String> values) {
			addCriterion("direccionE in", values, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneNotIn(List<String> values) {
			addCriterion("direccionE not in", values, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneBetween(String value1, String value2) {
			addCriterion("direccionE between", value1, value2, "direccione");
			return (Criteria) this;
		}

		public Criteria andDireccioneNotBetween(String value1, String value2) {
			addCriterion("direccionE not between", value1, value2, "direccione");
			return (Criteria) this;
		}

		public Criteria andTelefonoeIsNull() {
			addCriterion("telefonoE is null");
			return (Criteria) this;
		}

		public Criteria andTelefonoeIsNotNull() {
			addCriterion("telefonoE is not null");
			return (Criteria) this;
		}

		public Criteria andTelefonoeEqualTo(String value) {
			addCriterion("telefonoE =", value, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeNotEqualTo(String value) {
			addCriterion("telefonoE <>", value, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeGreaterThan(String value) {
			addCriterion("telefonoE >", value, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeGreaterThanOrEqualTo(String value) {
			addCriterion("telefonoE >=", value, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeLessThan(String value) {
			addCriterion("telefonoE <", value, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeLessThanOrEqualTo(String value) {
			addCriterion("telefonoE <=", value, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeLike(String value) {
			addCriterion("telefonoE like", value, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeNotLike(String value) {
			addCriterion("telefonoE not like", value, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeIn(List<String> values) {
			addCriterion("telefonoE in", values, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeNotIn(List<String> values) {
			addCriterion("telefonoE not in", values, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeBetween(String value1, String value2) {
			addCriterion("telefonoE between", value1, value2, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andTelefonoeNotBetween(String value1, String value2) {
			addCriterion("telefonoE not between", value1, value2, "telefonoe");
			return (Criteria) this;
		}

		public Criteria andPaginawebIsNull() {
			addCriterion("paginaWeb is null");
			return (Criteria) this;
		}

		public Criteria andPaginawebIsNotNull() {
			addCriterion("paginaWeb is not null");
			return (Criteria) this;
		}

		public Criteria andPaginawebEqualTo(String value) {
			addCriterion("paginaWeb =", value, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebNotEqualTo(String value) {
			addCriterion("paginaWeb <>", value, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebGreaterThan(String value) {
			addCriterion("paginaWeb >", value, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebGreaterThanOrEqualTo(String value) {
			addCriterion("paginaWeb >=", value, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebLessThan(String value) {
			addCriterion("paginaWeb <", value, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebLessThanOrEqualTo(String value) {
			addCriterion("paginaWeb <=", value, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebLike(String value) {
			addCriterion("paginaWeb like", value, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebNotLike(String value) {
			addCriterion("paginaWeb not like", value, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebIn(List<String> values) {
			addCriterion("paginaWeb in", values, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebNotIn(List<String> values) {
			addCriterion("paginaWeb not in", values, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebBetween(String value1, String value2) {
			addCriterion("paginaWeb between", value1, value2, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andPaginawebNotBetween(String value1, String value2) {
			addCriterion("paginaWeb not between", value1, value2, "paginaweb");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaIsNull() {
			addCriterion("codDatosPersona is null");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaIsNotNull() {
			addCriterion("codDatosPersona is not null");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaEqualTo(Integer value) {
			addCriterion("codDatosPersona =", value, "coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaNotEqualTo(Integer value) {
			addCriterion("codDatosPersona <>", value, "coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaGreaterThan(Integer value) {
			addCriterion("codDatosPersona >", value, "coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaGreaterThanOrEqualTo(Integer value) {
			addCriterion("codDatosPersona >=", value, "coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaLessThan(Integer value) {
			addCriterion("codDatosPersona <", value, "coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaLessThanOrEqualTo(Integer value) {
			addCriterion("codDatosPersona <=", value, "coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaIn(List<Integer> values) {
			addCriterion("codDatosPersona in", values, "coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaNotIn(List<Integer> values) {
			addCriterion("codDatosPersona not in", values, "coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaBetween(Integer value1, Integer value2) {
			addCriterion("codDatosPersona between", value1, value2,
					"coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCoddatospersonaNotBetween(Integer value1,
				Integer value2) {
			addCriterion("codDatosPersona not between", value1, value2,
					"coddatospersona");
			return (Criteria) this;
		}

		public Criteria andCodproyectoIsNull() {
			addCriterion("codProyecto is null");
			return (Criteria) this;
		}

		public Criteria andCodproyectoIsNotNull() {
			addCriterion("codProyecto is not null");
			return (Criteria) this;
		}

		public Criteria andCodproyectoEqualTo(Integer value) {
			addCriterion("codProyecto =", value, "codproyecto");
			return (Criteria) this;
		}

		public Criteria andCodproyectoNotEqualTo(Integer value) {
			addCriterion("codProyecto <>", value, "codproyecto");
			return (Criteria) this;
		}

		public Criteria andCodproyectoGreaterThan(Integer value) {
			addCriterion("codProyecto >", value, "codproyecto");
			return (Criteria) this;
		}

		public Criteria andCodproyectoGreaterThanOrEqualTo(Integer value) {
			addCriterion("codProyecto >=", value, "codproyecto");
			return (Criteria) this;
		}

		public Criteria andCodproyectoLessThan(Integer value) {
			addCriterion("codProyecto <", value, "codproyecto");
			return (Criteria) this;
		}

		public Criteria andCodproyectoLessThanOrEqualTo(Integer value) {
			addCriterion("codProyecto <=", value, "codproyecto");
			return (Criteria) this;
		}

		public Criteria andCodproyectoIn(List<Integer> values) {
			addCriterion("codProyecto in", values, "codproyecto");
			return (Criteria) this;
		}

		public Criteria andCodproyectoNotIn(List<Integer> values) {
			addCriterion("codProyecto not in", values, "codproyecto");
			return (Criteria) this;
		}

		public Criteria andCodproyectoBetween(Integer value1, Integer value2) {
			addCriterion("codProyecto between", value1, value2, "codproyecto");
			return (Criteria) this;
		}

		public Criteria andCodproyectoNotBetween(Integer value1, Integer value2) {
			addCriterion("codProyecto not between", value1, value2,
					"codproyecto");
			return (Criteria) this;
		}

		public Criteria andSponsorIsNull() {
			addCriterion("sponsor is null");
			return (Criteria) this;
		}

		public Criteria andSponsorIsNotNull() {
			addCriterion("sponsor is not null");
			return (Criteria) this;
		}

		public Criteria andSponsorEqualTo(Boolean value) {
			addCriterion("sponsor =", value, "sponsor");
			return (Criteria) this;
		}

		public Criteria andSponsorNotEqualTo(Boolean value) {
			addCriterion("sponsor <>", value, "sponsor");
			return (Criteria) this;
		}

		public Criteria andSponsorGreaterThan(Boolean value) {
			addCriterion("sponsor >", value, "sponsor");
			return (Criteria) this;
		}

		public Criteria andSponsorGreaterThanOrEqualTo(Boolean value) {
			addCriterion("sponsor >=", value, "sponsor");
			return (Criteria) this;
		}

		public Criteria andSponsorLessThan(Boolean value) {
			addCriterion("sponsor <", value, "sponsor");
			return (Criteria) this;
		}

		public Criteria andSponsorLessThanOrEqualTo(Boolean value) {
			addCriterion("sponsor <=", value, "sponsor");
			return (Criteria) this;
		}

		public Criteria andSponsorIn(List<Boolean> values) {
			addCriterion("sponsor in", values, "sponsor");
			return (Criteria) this;
		}

		public Criteria andSponsorNotIn(List<Boolean> values) {
			addCriterion("sponsor not in", values, "sponsor");
			return (Criteria) this;
		}

		public Criteria andSponsorBetween(Boolean value1, Boolean value2) {
			addCriterion("sponsor between", value1, value2, "sponsor");
			return (Criteria) this;
		}

		public Criteria andSponsorNotBetween(Boolean value1, Boolean value2) {
			addCriterion("sponsor not between", value1, value2, "sponsor");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table interesado
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
     * This class corresponds to the database table interesado
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}