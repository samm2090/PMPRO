package com.pro.proyectospro.configuracion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pro.proyectospro.configuracion.domain.Fase;
import com.pro.proyectospro.configuracion.domain.FaseExample;
import com.pro.proyectospro.configuracion.herencia.MyMapper;

public interface FaseMapper extends MyMapper<Fase, FaseExample>{

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	int countByExample(FaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	int deleteByExample(FaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	int insert(Fase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	int insertSelective(Fase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	List<Fase> selectByExample(FaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	Fase selectByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Fase record,
			@Param("example") FaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Fase record,
			@Param("example") FaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Fase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fase
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Fase record);
}