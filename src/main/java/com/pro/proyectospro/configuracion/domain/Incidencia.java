package com.pro.proyectospro.configuracion.domain;

public class Incidencia {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column incidencia.codigo
	 * @mbggenerated
	 */
	private Integer codigo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column incidencia.des
	 * @mbggenerated
	 */
	private String des;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column incidencia.activo
	 * @mbggenerated
	 */
	private Boolean activo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column incidencia.codigo
	 * @return  the value of incidencia.codigo
	 * @mbggenerated
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column incidencia.codigo
	 * @param codigo  the value for incidencia.codigo
	 * @mbggenerated
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column incidencia.des
	 * @return  the value of incidencia.des
	 * @mbggenerated
	 */
	public String getDes() {
		return des;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column incidencia.des
	 * @param des  the value for incidencia.des
	 * @mbggenerated
	 */
	public void setDes(String des) {
		this.des = des;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column incidencia.activo
	 * @return  the value of incidencia.activo
	 * @mbggenerated
	 */
	public Boolean getActivo() {
		return activo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column incidencia.activo
	 * @param activo  the value for incidencia.activo
	 * @mbggenerated
	 */
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
}