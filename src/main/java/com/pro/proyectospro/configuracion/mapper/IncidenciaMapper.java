package com.pro.proyectospro.configuracion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pro.proyectospro.configuracion.domain.Incidencia;
import com.pro.proyectospro.configuracion.domain.IncidenciaExample;
import com.pro.proyectospro.configuracion.herencia.MyMapper;

public interface IncidenciaMapper extends MyMapper<Incidencia, IncidenciaExample>{

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	int countByExample(IncidenciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	int deleteByExample(IncidenciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	int insert(Incidencia record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	int insertSelective(Incidencia record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	List<Incidencia> selectByExample(IncidenciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	Incidencia selectByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Incidencia record,
			@Param("example") IncidenciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Incidencia record,
			@Param("example") IncidenciaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Incidencia record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table incidencia
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Incidencia record);
}