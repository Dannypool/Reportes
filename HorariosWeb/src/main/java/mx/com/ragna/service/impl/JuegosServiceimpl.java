package mx.com.ragna.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import mx.com.ragna.dao.JuegosDao;
import mx.com.ragna.dto.ent.JuegosEnt;
import mx.com.ragna.service.JuegosService;

public class JuegosServiceimpl implements JuegosService{
	
	private JuegosDao juegosDao;
	
	@Transactional(readOnly = false)
	@Override
	public void guardaJuego(JuegosEnt juego) {
		// TODO Auto-generated method stub
		juegosDao.guardaJuegos(juego);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<JuegosEnt> buscaJuegosPorTitulo(String titulo){
		return juegosDao.buscaJuegosPorTitulo(titulo);
	}
	

	public void setJuegosDao(JuegosDao juegosDao) {
		this.juegosDao = juegosDao;
	}

}
