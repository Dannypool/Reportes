package mx.com.ragna.controlador;


import java.util.List;

import javax.faces.bean.ManagedProperty;

import mx.com.ragna.dto.ent.JuegosEnt;
import mx.com.ragna.dto.ent.UsuarioEnt;
import mx.com.ragna.service.JuegosService;
import mx.com.ragna.service.UsuarioService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/usuario")
public class UsuarioControler {
	
    
	@ManagedProperty(value="#{juegosService}")
	private JuegosService juegosService;
	
	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody  UsuarioEnt getShopInJSON(@PathVariable String name) {
		UsuarioService service = (UsuarioService) buscaBean.locator("usuarioService");
		UsuarioEnt usuario = null;
		JuegosEnt juego;
		try {
//			JuegosEnt j1 = new JuegosEnt();
//			j1.setTitulo("Chrono trigger");
//			j1.setDescripcion("juego");
//			j1.setCantidad(5);
//			
//			//juegosService.guardaJuego(j1);
//			
//			List<JuegosEnt> lista = juegosService.buscaJuegosPorTitulo("final");
//			if(lista == null || lista.isEmpty())
//				return null;
//			return lista.get(0);
                    System.out.println("jkasdhlkjasdflkjhasd");
			usuario = service.buscaUsuariosPorNombreUsuario(name);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			usuario = new UsuarioEnt();
			usuario.setNombre(e.getMessage());
		}
		
		
		
		return usuario;

	}

}
