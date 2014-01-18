package mx.com.ragna.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import mx.com.ragna.dao.UsuarioDao;
import mx.com.ragna.dto.ent.UsuarioEnt;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class UsuarioDaoImpl implements UsuarioDao{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
    }
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<UsuarioEnt> buscaUsuariosPorNombreUsuario(String usuario) throws Exception{
	Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(UsuarioEnt.class);
        criteria.createAlias(usuario, usuario)
        //criteria.add(Restrictions.eq("usuario", usuario));
        //criteria.add(Restrictions.ge("idUsuario", 1));
        criteria.add(Restrictions.like("usuario", usuario, MatchMode.END));
        return criteria.list();
        //return getSessionFactory().getCurrentSession().createQuery("FROM UsuarioEnt u WHERE u.usuario = ?")
		//		.setParameter(0, usuario).list();
	}

}
