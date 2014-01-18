package mx.com.ragna.service;

import java.util.List;

import mx.com.ragna.dto.ent.JuegosEnt;

public interface JuegosService {
	
	public void guardaJuego(JuegosEnt juego);
	public List<JuegosEnt> buscaJuegosPorTitulo(String titulo);

}
