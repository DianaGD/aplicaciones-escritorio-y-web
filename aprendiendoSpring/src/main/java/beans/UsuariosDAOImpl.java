package beans;

import org.springframework.stereotype.Component;

@Component
public class UsuariosDAOImpl {
	
	public void devolverDineroApuesta(int idApuesta, int idUsuario){
		System.out.println("para la apuesta de id: "+idApuesta+" le devolvemos lo apostado al usuario de id: "+idUsuario);
		
	}

}
