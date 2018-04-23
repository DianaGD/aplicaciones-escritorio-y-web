package java25arraysYcolecciones;

import java.util.HashMap;
import java.util.Map;

public class PrincipalTerceraParte {

	public static void main(String[] args) {
		//una vez dominados los arrays y las colecciones tipo List
		//vamos a ver las colecciones tipo Map
		//muy utilizados para cerrar sesiones
		Map<String, Cliente> mapClientes = new HashMap<String, Cliente>();
		
		mapClientes.put("primero", new Cliente());
		//en vez de tener posiciones numéricas, lo que tengo son strings
		//en este caso
		
		mapClientes.get("primero").setNombre("PRIMER CLIENTE");
		
		mapClientes.clear();//borramos todos

	}//end main
}//end class
