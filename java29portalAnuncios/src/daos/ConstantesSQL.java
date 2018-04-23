package daos;

public class ConstantesSQL {
	public static final String INSERCION_ANUNCIO = "insert into tabla_anuncios(titulo, precio, descripcion) values (?,?,?)";
	public static final String SELECCION_ANUNCIOS = "select * from tabla_anuncios";
}
