package com.pro.proyectospro.configuracion.tag;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.pro.proyectospro.configuracion.domain.Recurso;
import com.pro.proyectospro.configuracion.domain.Urgencia;
import com.pro.proyectospro.negocio.iservice.IAtareaService;
import com.pro.proyectospro.negocio.iservice.IUrgenciaService;
import com.pro.proyectospro.negocio.service.AtareaService;
import com.pro.proyectospro.negocio.service.UrgenciaService;

public class cboUrgencia extends TagSupport{
	
	private static final long serialVersionUID = -7665469695787966243L;
	public int doStartTag() throws JspException {
		try {
			IUrgenciaService servicio = new UrgenciaService();
			ArrayList<Urgencia> lista = servicio.listaUrgencias();
			
			JspWriter out = pageContext.getOut();
			
			out.println("<select name='incidencia.codurgencia'>");
			for(int i=0;i<lista.size();i++)
			{
				String nombre =(lista.get(i).getDes());
				
				out.println("<option value='"+ lista.get(i).getCodigo() +"'>"+nombre+"</option>");
				
			}
			
			out.println("</select>");			
		} 
		catch (Exception e) {
			throw new JspException("Error: " + e.getMessage());
		}
		return SKIP_BODY;
	}
	public int doEndTag() throws JspException 
	{
		return EVAL_PAGE;
	}
}
