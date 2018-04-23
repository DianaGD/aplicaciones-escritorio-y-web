package daos;

import java.util.List;

import modelo.Producto;

public interface ProductosDAO {
	
	void registrarProducto(Producto p);

	List<Producto> obtenerProductos();

}
