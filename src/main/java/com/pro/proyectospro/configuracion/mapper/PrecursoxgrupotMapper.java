package com.pro.proyectospro.configuracion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pro.proyectospro.configuracion.domain.Precursoxgrupot;
import com.pro.proyectospro.configuracion.domain.PrecursoxgrupotExample;
import com.pro.proyectospro.configuracion.herencia.MyMapper;

public interface PrecursoxgrupotMapper extends MyMapper<Precursoxgrupot, PrecursoxgrupotExample>{

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	int countByExample(PrecursoxgrupotExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	int deleteByExample(PrecursoxgrupotExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	int insert(Precursoxgrupot record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	int insertSelective(Precursoxgrupot record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	List<Precursoxgrupot> selectByExample(PrecursoxgrupotExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	Precursoxgrupot selectByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Precursoxgrupot record,
			@Param("example") PrecursoxgrupotExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Precursoxgrupot record,
			@Param("example") PrecursoxgrupotExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Precursoxgrupot record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table precursoxgrupot
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Precursoxgrupot record);
}