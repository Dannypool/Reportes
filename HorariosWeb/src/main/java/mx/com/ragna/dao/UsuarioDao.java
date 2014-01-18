package mx.com.ragna.dao;

import java.util.List;

import mx.com.ragna.dto.ent.UsuarioEnt;

public interface UsuarioDao {
	public List<UsuarioEnt> buscaUsuariosPorNombreUsuario(String usuario) throws Exception;

}
