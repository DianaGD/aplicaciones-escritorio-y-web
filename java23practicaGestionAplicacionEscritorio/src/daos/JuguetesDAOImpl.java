package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Juguete;

public class JuguetesDAOImpl implements JuguetesDAO{
	// primero hay que hacer la conexion
	private Connection miConexion = null;

	public JuguetesDAOImpl() {
		// preparo driver y conexion
		try {
			Class.forName("com.mysql.jdbc.Driver");
			miConexion = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/practica_escritorio","root","jeveris");

		} catch (ClassNotFoundException e) {
			System.out.println("no encuentro el driver-libreria de mysql");
		} catch (SQLException e) {
			System.out.println("error de conexion o la sql esta mal");
		}
	}//end JuguetesDAOImpl

	@Override
	public void registrarJuguete(Juguete j) {
		String sqlInsercionJuguete = "INSERT INTO tabla_juguetes (marca, nombre, descripcion, precio, categoria, edad, contenido) VALUES"
				+ "(?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = miConexion.prepareStatement(sqlInsercionJuguete);
			ps.setString(1, j.getMarca());
			ps.setString(2, j.getNombre());
			ps.setString(3, j.getDescripcion());
			ps.setString(4, j.getPrecio());
			ps.setString(5, j.getCategoria());
			ps.setString(6, j.getEdad());
			ps.setString(7, j.getContenido());			
			System.out.println("antes de ps.execute()");
			ps.execute();
			ps.close();
			System.out.println("juguete insertado correctamente");
		} catch (SQLException e) {
			System.out.println("fallo en la sql");
		}
		
	}

	@Override
	public void borrarJuguete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Juguete[] obtenerJuguetes() {
		// TODO Auto-generated method stub
		return null;
	}

}
