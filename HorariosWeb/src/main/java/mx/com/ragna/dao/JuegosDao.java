package mx.com.ragna.dao;

import java.util.List;

import mx.com.ragna.dto.ent.JuegosEnt;

public interface JuegosDao {
	
	public void guardaJuegos(JuegosEnt juego);
	public void actualizaJuegos(JuegosEnt juego);
	public List<JuegosEnt> buscaJuegosPorTitulo(String titulo);

}
