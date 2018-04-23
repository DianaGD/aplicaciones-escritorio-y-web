package constantesSQL;

public class ConstantesSQL {
	public static final String SQL_INSERCION_PRODUCTO = "insert into tabla_productos(nombre, precio, id_categoria) values (?,?,?)";
	public static final String SQL_SELECCION_PRODUCTOS = "SELECT tabla_productos.id, tabla_productos.nombre, tabla_productos.precio, tabla_categorias.nombre as nombre_categoria from tabla_productos, tabla_categorias where tabla_productos.id_categoria = tabla_categorias.id order by tabla_productos.id desc limit ?,?";
	public static final String SQL_SELECCION_CATEGORIAS = "select * from tabla_categorias";
	public static final String SQL_CANTIDAD_TOTAL_PRODUCTOS = "SELECT COUNT(id) as total FROM tabla_productos";
}