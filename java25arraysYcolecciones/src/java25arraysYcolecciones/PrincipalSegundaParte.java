package java25arraysYcolecciones;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrincipalSegundaParte {

	public static void main(String[] args) {
		// las colecciones siempre hay que parametrizarlas
		// que simplemente es decirlas con que tipo de dato
		// van a trabajar

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		// lo siguiente da error y eso está muy bien, porque
		// la colección de clientes me asegura que de ella solo puedo
		// meter y sacar objetos de la clase Cliente
		// clientes.add("primer elemento");

		clientes.add(new Cliente());
		clientes.add(new Cliente());

		Cliente primerCliente = clientes.get(0); // no hace falta casting
		// System.out.println(primerCliente);

		// de un interfaz no puedo crear un objeto, pero puedo
		// definir un elemento del tipo interfaz y darle un objeto
		// de una clase que implemente el interfaz
		ApuestasDAO dao = new ApuestasDAOhibernateImpl();

		dao.cancelarApuesta(55);
		dao.cerrarApuesta(13);
		
		//de la misma forma tenemos muchos tipos de colecciones:
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		
		List<String> unlist = new ArrayList<String>();
		unlist.add("primer elemento");
		unlist.add("segundo elemento");
		
		System.out.println("primer elemento: " + unlist.get(0));
		unlist.remove(1); //elimino el segundo elemento
		unlist.set(0, "nuevo primer elemento");
		System.out.println("primer elemento: " + unlist.get(0));
		
		//ahora mismo nos daria igual que un list fuese un ArrayList
		//un LinkedList o cualquier otro list. Ahora ya se manejar List
		//y no me hace falta preocuparme por la implementacion que realmente
		//utilice
		
		//a partir de ahora, siempre que quiera un list, lo hare a traves de
		//una variable tipo List, no ArrayList ni LinkedList ni otra cosa.
		
		List<Integer> otroList = new ArrayList<Integer>();
		List<String> otroListmas = new LinkedList<String>();
		List<Cliente> ultimoLlist = new ArrayList<Cliente>();
		
		//como se trabajar list da igual lo que luego realmente sea
	}

}
