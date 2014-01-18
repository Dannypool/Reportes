package mx.com.ragna.login;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.DateSelectEvent;



@ManagedBean(name="login")
public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usuario;
	private String pass;
	
	@PostConstruct
	public void inicializar(){
		
		
	}
	
	public void acceder(){
		if(usuario.equalsIgnoreCase("ramses")
			&& pass.equalsIgnoreCase("12345")){
			try {
				FacesContext.getCurrentInstance().getExternalContext().redirect("../menu/menu.jsf");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
