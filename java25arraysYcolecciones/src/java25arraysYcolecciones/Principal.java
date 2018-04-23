package java25arraysYcolecciones;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//array no es mas que un conjunto de objetos del mismo tipo
		//tienen un tamaño fijo y no se pueden redimensionar
		
		//definición de un array de dos objetos
		Cliente[] miarray = {new Cliente(), new Cliente()};
		
		//definición de un array de cinco objetos
		Cliente[] otroarray = new Cliente[5];
		
		//en el último caso hay que inicializar los objetos:
		otroarray[0] = new Cliente("juan", "calle sol 4", "salamanca", "37001",	"999856621");
		
		//al array se le accede por un índice, la primera posición es la cero
		System.out.println("valor de la posicion 0: " + otroarray[0].toString());
		
		//la última posición del array es su tamaño menos uno
		//otroarray[5] = new Cliente(); //esto da error no hay indice 5
		//ya que solo hay 5 elementos y el primero es el cero
		//el ultimo indice seria el 4
		
		//como los arrays no son redimensionables, para eso en java 
		//tenemos las colecciones, que no son más que objetos 
		//que guardan otros objetos.
		
		//en java hay muchos tipos de colecciones pero las que mas se usan 
		//son las de tipo List y las de tipo Map
		
		//las de tipo List se comportan como un array dinámico
		//almacenando otros objetos en posiciones numericas basadas
		//en un indice, como los arrays
		
		ArrayList miArrayList = new ArrayList();
		miArrayList.add("primer elemento");
		miArrayList.add("segundo elemento");
		//las colecciones en las que no hemos dicho el tipo de dato
		//con el que van a trabajar son un verdadero problema
		miArrayList.add(new Cliente());
		//como puedo meterles cualquier cosa, yo ahora no se si en
		//cierta posicion tengo un string, un cliente o cualquier cosa
		
		//estoy forzado a hacer un casting
		String primerElemento = (String) miArrayList.get(0);
		
		//y en este caso he tenido suerte y puede ser que funcione
		System.out.println("primer elemento del arrayList: " + primerElemento);
		
		miArrayList.set(0, new Cliente());
		//vamos a ver si haciendo lo mismo funciona:
		primerElemento = (String) miArrayList.get(0);
	}

}
