package com.pro.proyectospro.configuracion.tag;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.pro.proyectospro.configuracion.domain.Recurso;
import com.pro.proyectospro.negocio.service.RecursoService;

public class CboRecursos extends TagSupport{
	
	private static final long serialVersionUID = -7665469695787966243L;
	public int doStartTag() throws JspException {
		try {
			RecursoService servicio = new RecursoService();
			ArrayList<Recurso> lista = servicio.listarRecursos();
			
			JspWriter out = pageContext.getOut();
			
			out.println("<select name='codigo'>");
			for(int i=0;i<lista.size();i++)
			{
				String nombre = servicio.obtenerNombreRecurso(lista.get(i).getCoddatospersona());
				
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
		// acciones al finalizar la etiqueta
		return EVAL_PAGE;
	}

}
