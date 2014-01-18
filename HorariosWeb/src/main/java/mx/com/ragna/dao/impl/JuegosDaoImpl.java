package mx.com.ragna.dao.impl;

import java.util.List;

import mx.com.ragna.dao.JuegosDao;
import mx.com.ragna.dto.ent.JuegosEnt;

import org.hibernate.SessionFactory;


public class JuegosDaoImpl implements JuegosDao{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
    }



	
	@Override
	public void guardaJuegos(JuegosEnt juego) {
		getSessionFactory().getCurrentSession().save(juego);

		
	}

	@Override
	public void actualizaJuegos(JuegosEnt juego) {
		getSessionFactory().getCurrentSession().update(juego);

		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<JuegosEnt> buscaJuegosPorTitulo(String titulo) {
		
		
		
		return getSessionFactory().getCurrentSession().createQuery("FROM JuegosEnt").list();

	}

}
