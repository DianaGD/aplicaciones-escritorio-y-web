package daos;

public class ConstantesSQL {
	public static final String INSERCION_ANUNCIO = "insert into tabla_anuncios(titulo, precio, descripcion, telefono, email) values (?,?,?,?,?)";
	public static final String INSERCION_USUARIO = "insert into tabla_usuarios(nombre, email, poblacion, contraseņa) values (?,?,?,?)";
	public static final String SELECCION_ANUNCIOS = "select * from tabla_anuncios";
	public static final String SELECCION_USUARIOS = "select * from tabla_usuarios";
	public static final String IDENTIFICACION_USUARIO = "select id from tabla_usuarios where email = ? and contraseņa = ?";
	public static final String IDENTIFICACION_ADMIN = "select id from tabla_usuarios where email = ? and contraseņa = ? and admin = 1";
	public static final String BORRAR_ANUNCIO = "delete from tabla_anuncios where id=?";
	public static final String BORRAR_USUARIO = "delete from tabla_usuarios where id=?";
	public static final String OBTENER_ANUNCIO_POR_ID = "select * from tabla_anuncios where id = ?";
	public static final String GUARDAR_CAMBIOS_ANUNCIO = "update tabla_anuncios set titulo=?, precio=?, descripcion=?, telefono=?, email=? where id=?";
	public static final String GUARDAR_CAMBIOS_USUARIO = "update tabla_usuarios set nombre=?, email=?, poblacion=?, contraseņa=? where id=?";
	public static final String OBTENER_USUARIO_POR_ID = "select * from tabla_usuarios where id=?";
}
