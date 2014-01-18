package mx.com.ragna.service.impl;

import java.util.List;

import mx.com.ragna.dao.UsuarioDao;
import mx.com.ragna.dto.ent.UsuarioEnt;
import mx.com.ragna.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{

	private UsuarioDao usuarioDao;
	
	@Override
	public UsuarioEnt buscaUsuariosPorNombreUsuario(String usuario) throws Exception{
		
		List<UsuarioEnt> usuarios = usuarioDao.buscaUsuariosPorNombreUsuario(usuario);
		if(usuarios == null || usuarios.isEmpty())
			return null;
		return usuarios.get(0);
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

}
