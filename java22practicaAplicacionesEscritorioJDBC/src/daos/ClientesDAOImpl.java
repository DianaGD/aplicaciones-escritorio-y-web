package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Cliente;

public class ClientesDAOImpl implements ClientesDAO {
	// primero hay que hacer la conexion
	private Connection miConexion = null;

	public ClientesDAOImpl() {
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
	}// end ClientesDAOImpl

	@Override
	public void registrarCliente(Cliente c) {
		String sqlInsercionCliente = "INSERT INTO tabla_clientes (nombre, domicilio, poblacion, codigo_postal, telefono) VALUES"
				+ "(?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = miConexion.prepareStatement(sqlInsercionCliente);
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getDomicilio());
			ps.setString(3, c.getPoblacion());
			ps.setString(4, c.getCodigoPostal());
			ps.setString(5, c.getTelefono());

			ps.execute();
			ps.close();
			System.out.println("cliente insertado correctamente");
		} catch (SQLException e) {
			System.out.println("fallo en la sql");
		}
	}

	@Override
	public void borrarCliente(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente[] obtenerClientes() {
		// TODO Auto-generated method stub
		return null;
	}

}
