package java25arraysYcolecciones;

public class ApuestasDAOhibernateImpl implements ApuestasDAO{

	@Override
	public void cerrarApuesta(int id) {
		System.out.println("cerrando apuesta con hibernate");
	}

	@Override
	public void cancelarApuesta(int id) {
		System.out.println("cancelanco apuesta con hibernate");
	}

}
