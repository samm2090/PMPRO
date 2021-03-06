package com.pro.proyectospro.configuracion.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pro.proyectospro.configuracion.domain.Rol;
import com.pro.proyectospro.configuracion.domain.RolExample;
import com.pro.proyectospro.configuracion.herencia.MyMapper;

public interface RolMapper extends MyMapper<Rol, RolExample>{

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	int countByExample(RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	int deleteByExample(RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	int insert(Rol record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	int insertSelective(Rol record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	List<Rol> selectByExample(RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	Rol selectByPrimaryKey(Integer codigo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") Rol record,
			@Param("example") RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") Rol record,
			@Param("example") RolExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Rol record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rol
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Rol record);
}