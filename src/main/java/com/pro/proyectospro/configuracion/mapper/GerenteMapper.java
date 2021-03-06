package com.pro.proyectospro.configuracion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pro.proyectospro.configuracion.domain.Gerente;
import com.pro.proyectospro.configuracion.domain.GerenteExample;
import com.pro.proyectospro.configuracion.herencia.MyMapper;

public interface GerenteMapper extends MyMapper<Gerente, GerenteExample> {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	int countByExample(GerenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	int deleteByExample(GerenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	int insert(Gerente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	int insertSelective(Gerente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	List<Gerente> selectByExample(GerenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	Gerente selectByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Gerente record,
			@Param("example") GerenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Gerente record,
			@Param("example") GerenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Gerente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table gerente
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Gerente record);
}