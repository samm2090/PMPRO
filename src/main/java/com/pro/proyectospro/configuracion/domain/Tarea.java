package com.pro.proyectospro.configuracion.domain;

public class Tarea {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tarea.codigo
	 * @mbggenerated
	 */
	private Integer codigo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tarea.des
	 * @mbggenerated
	 */
	private String des;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tarea.Area_codigo
	 * @mbggenerated
	 */
	private Integer areaCodigo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tarea.activo
	 * @mbggenerated
	 */
	private Boolean activo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tarea.codigo
	 * @return  the value of tarea.codigo
	 * @mbggenerated
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tarea.codigo
	 * @param codigo  the value for tarea.codigo
	 * @mbggenerated
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tarea.des
	 * @return  the value of tarea.des
	 * @mbggenerated
	 */
	public String getDes() {
		return des;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tarea.des
	 * @param des  the value for tarea.des
	 * @mbggenerated
	 */
	public void setDes(String des) {
		this.des = des;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tarea.Area_codigo
	 * @return  the value of tarea.Area_codigo
	 * @mbggenerated
	 */
	public Integer getAreaCodigo() {
		return areaCodigo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tarea.Area_codigo
	 * @param areaCodigo  the value for tarea.Area_codigo
	 * @mbggenerated
	 */
	public void setAreaCodigo(Integer areaCodigo) {
		this.areaCodigo = areaCodigo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tarea.activo
	 * @return  the value of tarea.activo
	 * @mbggenerated
	 */
	public Boolean getActivo() {
		return activo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tarea.activo
	 * @param activo  the value for tarea.activo
	 * @mbggenerated
	 */
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
}