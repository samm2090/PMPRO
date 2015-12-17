package com.pro.proyectospro.util;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class DozerUtil {
	
	private static Mapper dozerMapper;
	
	static {
		dozerMapper = new DozerBeanMapper();
	}
	
	public static <T> T copiarObjeto(T objeto, Class<T> claseObjeto) {
		return dozerMapper.map(objeto, claseObjeto);
	}
	
}