package java25arraysYcolecciones;

public class ApuestasDAOJDBCimpl implements ApuestasDAO{

	@Override
	public void cerrarApuesta(int id) {
		System.out.println("con jdbc cerrar apuesta");
	}

	@Override
	public void cancelarApuesta(int id) {
		System.out.println("con jdbc cancelar apuesta");
	}

}
