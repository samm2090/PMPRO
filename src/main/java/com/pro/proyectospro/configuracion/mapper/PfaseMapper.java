package com.pro.proyectospro.configuracion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pro.proyectospro.configuracion.domain.Pfase;
import com.pro.proyectospro.configuracion.domain.PfaseExample;
import com.pro.proyectospro.configuracion.herencia.MyMapper;

public interface PfaseMapper extends MyMapper<Pfase, PfaseExample>{

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	int countByExample(PfaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	int deleteByExample(PfaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	int insert(Pfase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	int insertSelective(Pfase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	List<Pfase> selectByExample(PfaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	Pfase selectByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Pfase record,
			@Param("example") PfaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Pfase record,
			@Param("example") PfaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Pfase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfase
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Pfase record);
}