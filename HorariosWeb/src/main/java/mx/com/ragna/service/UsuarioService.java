package mx.com.ragna.service;


import mx.com.ragna.dto.ent.UsuarioEnt;

public interface UsuarioService {
	
	public UsuarioEnt buscaUsuariosPorNombreUsuario(String usuario) throws Exception;

}
