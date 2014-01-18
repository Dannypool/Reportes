package mx.com.ragna.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import mx.com.ragna.dto.AnilloDto;
import mx.com.ragna.dto.HorarioDto;
import mx.com.ragna.dto.ent.JuegosEnt;
import mx.com.ragna.service.JuegosService;

@ManagedBean(name="menu")
@ViewScoped
public class MenuBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<HorarioDto> listaHorario;
	private List<AnilloDto> listaAnillo;
	
	private String exito;
	
	@ManagedProperty(value="#{juegosService}")
	private JuegosService juegosService;

	@PostConstruct
	public void inicializar(){
		listaHorario = inicializaHorario();
		listaAnillo = inicializaAnillo();
		
	}
	
	public void irNuevamatria(){
		exito = "";
		JuegosEnt juego = new JuegosEnt();
		juego.setTitulo("Final Fantasy VII");
		juego.setDescripcion("Juego de Rol");
		juego.setCantidad(12);
		try{
			juegosService.guardaJuego(juego);
			exito = "segun se guardo";
		}catch(Exception e){
			exito = "esto es lo que paso " + e.getMessage();
		}
		
		
		
		//		try {
//			FacesContext.getCurrentInstance().getExternalContext().redirect("../capturaDatos/nuevaMateria.jsf");
//		} catch (Exception e) {
//			System.out.println("no pude cambiar de pag");
//		}
	}
	
	private List<AnilloDto> inicializaAnillo(){
		List<AnilloDto> listaAnillo = new ArrayList<AnilloDto>();
		AnilloDto anillo1= new AnilloDto();
		anillo1.setId(1);
		anillo1.setDescripcion("Horarios");
		
		AnilloDto anillo2= new AnilloDto();
		anillo2.setId(2);
		anillo2.setDescripcion("Materias");
		
		AnilloDto anillo3= new AnilloDto();
		anillo3.setId(3);
		anillo3.setDescripcion("Nueva Actividad");
		listaAnillo.add(anillo1);
		listaAnillo.add(anillo2);
		listaAnillo.add(anillo3);
		
		return listaAnillo;
		
	}
	
	private List<HorarioDto> inicializaHorario(){
		List<HorarioDto> lista = new ArrayList<HorarioDto>();
		HorarioDto horario1 = new HorarioDto();
		horario1.setNum(1);
		horario1.setClase("Fisica");
		horario1.setMaterial("Calculadora");
		horario1.setTarea("Primera Ley de Newton");
		horario1.setFecha(new Date());
		
		HorarioDto horario2 = new HorarioDto();
		horario2.setNum(2);
		horario2.setClase("Calculo");
		horario2.setTarea("Demostracion de Laplace");
		horario2.setFecha(new Date());
		
		HorarioDto horario3 = new HorarioDto();
		horario3.setNum(3);
		horario3.setClase("Electronica Digital");
		horario3.setMaterial("Transistores");
		horario3.setFecha(new Date());
		
		HorarioDto horario4 = new HorarioDto();
		horario4.setNum(4);
		horario4.setClase("Estrucutura de Datos");
		horario4.setTarea("Arboles Binarios");
		horario4.setFecha(new Date());
		
		lista.add(horario1);
		lista.add(horario2);
		lista.add(horario3);
		lista.add(horario4);
		return lista;
		
	}

	public List<HorarioDto> getListaHorario() {
		return listaHorario;
	}

	public void setListaHorario(List<HorarioDto> listaHorario) {
		this.listaHorario = listaHorario;
	}

	public List<AnilloDto> getListaAnillo() {
		return listaAnillo;
	}

	public void setListaAnillo(List<AnilloDto> listaAnillo) {
		this.listaAnillo = listaAnillo;
	}

	public JuegosService getJuegosService() {
		return juegosService;
	}

	public void setJuegosService(JuegosService juegosService) {
		this.juegosService = juegosService;
	}

	public String getExito() {
		return exito;
	}

	public void setExito(String exito) {
		this.exito = exito;
	}
}
