package mx.com.ragna.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class Utilerias {
	
	public static void mensage(UIComponent componente, String titulo, String mensaje){
		FacesContext.getCurrentInstance().addMessage(componente.getClientId(FacesContext.getCurrentInstance()), new FacesMessage(FacesMessage.SEVERITY_INFO,titulo, mensaje));  
	}
	public static void mensageError(UIComponent componente, String titulo, String mensaje){
		FacesContext.getCurrentInstance().addMessage(componente.getClientId(FacesContext.getCurrentInstance()), new FacesMessage(FacesMessage.SEVERITY_ERROR,titulo, mensaje));
		
	}

}
