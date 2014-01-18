package mx.com.ragna.dao.impl;

import org.hibernate.SessionFactory;

public class ConexionBase {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
    }

}
