package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Anuncio;
import daos.AnunciosDAO;
import daos.ConstantesSQL;
import daos.GenericDAO;

public class AnunciosDAOImpl extends GenericDAO implements AnunciosDAO {

	@Override
	public void registrarAnuncio(Anuncio anuncio) {
		// siempre llamar a conectar() y desconectar()
		conectar();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.INSERCION_ANUNCIO);
			ps.setString(1, anuncio.getTitulo());
			ps.setDouble(2, anuncio.getPrecio());
			ps.setString(3, anuncio.getDescripcion());
			ps.setString(4, anuncio.getTelefono());
			ps.setString(5, anuncio.getEmail());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("la sql de insercion de anuncio esta mal");
		}

		desconectar();
	}// end registrarAnuncio

	@Override
	public List<Anuncio> obtenerAnuncios() {
		conectar();
		List<Anuncio> anuncios = new ArrayList<Anuncio>();
		try {
			PreparedStatement ps = miConexion
					.prepareStatement(ConstantesSQL.SELECCION_ANUNCIOS);
			ResultSet resultado = ps.executeQuery();
			while(resultado.next()){
				Anuncio anuncio = new Anuncio();
				anuncio.setTitulo(resultado.getString("titulo"));
				anuncio.setPrecio(resultado.getDouble("precio"));
				anuncio.setDescripcion(resultado.getString("descripcion"));
				anuncio.setTelefono(resultado.getString("telefono"));
				anuncio.setEmail(resultado.getString("email"));
				anuncios.add(anuncio);
			}//end while
		} catch (SQLException e) {
			System.out.println("sql select anuncios esta mal");
		}
		desconectar();
		return anuncios;
	}// end obtenerAnuncios

}// end class
