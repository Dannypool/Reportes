package mx.com.ragna.captura;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import mx.com.ragna.util.Utilerias;

import org.primefaces.component.inputtext.InputText;

@ManagedBean(name="nuevaMateria")
@ViewScoped

public class NuevaMateriaBean implements Serializable{
	
	private InputText htmlNombre;
	private InputText htmlMateria;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	public void inicializar(){
		
	}
	
	public void irMenu(){
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("../menu/menu.jsf");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void mensajeExito(){
		Utilerias.mensage(htmlNombre, "Titulo del Mensage", "Cuerpo del mensaje");
	}
	
	public void mensajeError(){
		Utilerias.mensageError(htmlMateria, "Titulo del Mensage", "Cuerpo del mensaje");
	}

	public InputText getHtmlNombre() {
		return htmlNombre;
	}

	public void setHtmlNombre(InputText htmlNombre) {
		this.htmlNombre = htmlNombre;
	}

	public InputText getHtmlMateria() {
		return htmlMateria;
	}

	public void setHtmlMateria(InputText htmlMateria) {
		this.htmlMateria = htmlMateria;
	}

}
