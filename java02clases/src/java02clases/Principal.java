package java02clases;

public class Principal {

	public static void main(String[] args) {
		// Así es como creo un objeto de Producto
		// ahora mismo nuevo tiene todo lo que tiene Producto
		Producto nuevo = new Producto();
		nuevo.nombre = "Memoria USB 8GB";
		nuevo.precio = 8.99;
		nuevo.cantidad = 45;
		nuevo.comprar();
		
		// Creamos otro objeto de Producto
		Producto otro = new Producto();
		otro.nombre = "Ratón óptico usb";
		otro.precio = 4.99;
		otro.cantidad = 85;
		otro.comprar();
	}

}
