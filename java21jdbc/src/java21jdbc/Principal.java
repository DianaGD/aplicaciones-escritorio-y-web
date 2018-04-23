package java21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {

		Cliente clienteAinsertar = new Cliente("Tienda Ropa Bien Vestir",
				"Calle Sol 34", "Salamanca", "37001", "669912356");
		// objetivo: registrar el cliente en la tabla clientes usando jdbc
		// Primer paso: configurar JDBC para decirle si voy a usar: mysql, sql
		// server(.net), oracle, db2

		// para ello simplemente debemos cargar el driver de la libreria de
		// conexión correspondiente
		// mysql-connector-java-5.1.46.jar
		// Class -> es una clase de java que vale para cargar una clase
		// en la aplicacion segun un String
		// la clase que hemos cargado tiene un codigo especificado
		// que no podemos ver porque ya viene compilado (por eso se llama .class
		// en lugar de .java
		// que configura jdbc para trabajar con mysql
		// Class.forName("com.mysql.jdbc.Driver");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out
					.println("no encuentro el driver. he puesto mal el Class.forName");
		}
		String url = "jdbc:mysql://localhost:3306/practica_escritorio"; // donde
																		// esta
																		// mi
																		// base
																		// de
																		// datos
		// en url digo donde esta mi base de datos -> POR LO MENOS SE VA A HACER
		// UNA VEZ POR PROYECTO

		// ahora el resto de codigo es 100% compatible con cualquier otra base
		// de datos

		// 2-ESTABLECEMOS CONEXION
		Connection miConexion = null;
		try {
			miConexion = DriverManager.getConnection(url, "root", "jeveris");
		} catch (SQLException e) {
			System.out
					.println("no pude obtener conexion, mirar usuario y password");
		}
		// seguridad: jamas deberiamos conectarnos como root desde la
		// aplicación final, la aplicacion deberia conectarse con la base de
		// datos usando un usuario y contraseña especifico que tenga
		// limitadas todas las operaciones que no se vayan a usar

		// voy a preparar un statement -> es algo que me permite lanzar una sql
		try {
			// Statement statementInsercionCliente =
			// miConexion.createStatement();
			// String sqlInsercionCliente =
			// "INSERT INTO tabla_clientes (nombre, domicilio, poblacion, codigo_postal, telefono) VALUES ("
			// + clienteAinsertar.getNombre() + ", 'W', 'X', 'Y', 'Z')";
			// la sql anterior es mala porque es vulnerable a ataques de
			// inyeccion sql
			// si el nombre del cliente es una sql, dicha sql alterara lo que
			// realmente
			// queremos hacer, que no es mas que un insert

			// así es como se deberia hacer:
			String sqlInsercionCliente = "INSERT INTO tabla_clientes (nombre, domicilio, poblacion, codigo_postal, telefono) VALUES"
					+ "(?,?,?,?,?)";
			//de esta forma le decimos a la base de datos que esta es la sql que queremos lanzar con,
			//en este caso 5 variables. Cuando le digamos a la base de datos que es cada variable no
			//se podra inyectar sql porque la base de datos espera variables del tipo indicado:
			//por ejemplo la primera ? tiene que ser un nombre valido correspondiente al tipo de dato
			//de nombre de la base de datos

			PreparedStatement ps = miConexion.prepareStatement(sqlInsercionCliente);
			//lo siguiente que esta comentado no vale por ser vulnerable a inserciones sql
//			statementInsercionCliente.executeUpdate(sqlInsercionCliente);
//			System.out.println("insercion realizada correctamente");
//			// cerrar el statement
//			statementInsercionCliente.close();
			
			ps.setString(1, clienteAinsertar.getNombre());
			ps.setString(2, clienteAinsertar.getDomicilio());
			ps.setString(3, clienteAinsertar.getPoblacion());
			ps.setString(4, clienteAinsertar.getCodigoPostal());
			ps.setString(5, clienteAinsertar.getTelefono());
			
			ps.execute();
			ps.close();
			System.out.println("cliente insertado correctamente");
			
		} catch (SQLException e) {
			System.out
					.println("error obteniendo el statement o error en la sql");
			e.printStackTrace();
		}// end catch

		// NO OLVIDAR: LIBERAR RECURSOS Y CONEXION
		try {
			miConexion.close();
		} catch (SQLException e) {
			System.out.println("no pude hacer el close");
		}

	}// end main

}
