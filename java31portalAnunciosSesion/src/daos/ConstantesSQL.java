package daos;

public class ConstantesSQL {
	public static final String INSERCION_ANUNCIO = "insert into tabla_anuncios(titulo, precio, descripcion, telefono, email) values (?,?,?,?,?)";
	public static final String INSERCION_USUARIO = "insert into tabla_usuarios(nombre, email, poblacion, contraseña) values (?,?,?,?)";
	public static final String SELECCION_ANUNCIOS = "select * from tabla_anuncios";
	public static final String SELECCION_USUARIOS = "select * from tabla_usuarios";
	public static final String IDENTIFICACION_USUARIO = "select id from tabla_usuarios where email = ? and contraseña = ?";
	public static final String IDENTIFICACION_ADMIN = "select id from tabla_usuarios where email = ? and contraseña = ? and admin = 1";
	public static final String BORRAR_ANUNCIO = "delete from tabla_anuncios where id=?";
	public static final String BORRAR_USUARIO = "delete from tabla_usuarios where id=?";
}
