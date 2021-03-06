package com.pro.proyectospro.configuracion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pro.proyectospro.configuracion.domain.Area;
import com.pro.proyectospro.configuracion.domain.AreaExample;
import com.pro.proyectospro.configuracion.herencia.MyMapper;

public interface AreaMapper extends MyMapper<Area, AreaExample>{

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	int countByExample(AreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	int deleteByExample(AreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	int insert(Area record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	int insertSelective(Area record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	List<Area> selectByExample(AreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	Area selectByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Area record,
			@Param("example") AreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Area record,
			@Param("example") AreaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Area record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table area
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Area record);
}