package daos;

public class ConstantesSQL {
	public static final String INSERCION_ANUNCIO = "insert into tabla_anuncios(titulo, precio, descripcion, telefono, email) values (?,?,?,?,?)";
	public static final String INSERCION_USUARIO = "insert into tabla_usuarios(nombre, email, poblacion, contraseña) values (?,?,?,?)";
	public static final String SELECCION_ANUNCIOS = "select * from tabla_anuncios";
	public static final String SELECCION_USUARIOS = "select * from tabla_usuarios";
}
