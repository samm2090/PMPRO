package com.pro.proyectospro.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public final class Util {
	
	private Util(){
		
		
	}
	
	public static String getFechaActual(){
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		Date hoy = new Date();
		
		return sdf.format(hoy).toString();
	
	}
	
	public static String formatearFecha(String fecha)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Date f = sdf.parse(fecha);
			sdf=new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(f);
		} catch (ParseException e) {
			return "fecha incorrecta";
		}
			
	}
		
	
	
}
