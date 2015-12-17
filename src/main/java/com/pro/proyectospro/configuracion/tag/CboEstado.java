package com.pro.proyectospro.configuracion.tag;

import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.pro.proyectospro.configuracion.domain.Estado;
import com.pro.proyectospro.negocio.service.EstadoService;

public class CboEstado extends TagSupport  {
	
	private static final long serialVersionUID = -1139838128363899564L;

	public int doStartTag() throws JspException{
		try{
			EstadoService service = new EstadoService();
			JspWriter out =pageContext.getOut();
			
			try{
				ArrayList<Estado> estados =(ArrayList<Estado>) service.listarEstados();
				out.println("<select name=\"\">");
				for(int i=0;i<estados.size();i++){
					Estado estado= estados.get(i);
					out.println("<option value="+estado.getCodigo()+">"+estado.getDes()+"</option>");	
				}
				out.println("</select>");
			}
			catch(Exception e){
				e.getStackTrace();
			}
			
		}
		catch(Exception e){
			throw new JspException("Error: "+e.getMessage());
		}
		return SKIP_BODY;
	}
	

}
