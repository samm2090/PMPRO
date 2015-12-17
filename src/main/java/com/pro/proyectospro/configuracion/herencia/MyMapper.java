package com.pro.proyectospro.configuracion.herencia;

import java.util.List;

import org.apache.ibatis.annotations.Param;
/** Sirve para consumir los mappers de manera genérica en el Model.
 * También vuelve ciega a la applicación de capacidades para hacer delete en BD*/
public interface MyMapper<T, E> {
	int countByExample(E example);
//	int deleteByExample(E example);
//	int deleteByPrimaryKey(Integer id);
	int insert(T record);
	int insertSelective(T record);
	List<T> selectByExample(E example);
	T selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") T record,@Param("example") E example);
	int updateByExample(@Param("record") T record,@Param("example") E example);
	int updateByPrimaryKeySelective(T record);
	int updateByPrimaryKey(T record);
}
