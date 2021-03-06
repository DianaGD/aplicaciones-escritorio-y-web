package modelo;

public class Cliente {

	private String nombre;
	private String domicilio;
	private String poblacion;
	private String codigoPostal;
	private String telefono;
	private int id;

	public Cliente() {
	}//end Cliente

	public Cliente(String nombre, String domicilio, String poblacion,
			String codigoPostal, String telefono) {
		super(); //opcional-llama por defecto al constructor vacio de la clase padre
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.poblacion = poblacion;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
	}//end Cliente using Fields
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//toString muy utilizado para sacar un String que represente al objeto-se puede autogenerar
	//devuelve una cadena con toda la información del objeto
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", domicilio=" + domicilio
				+ ", poblacion=" + poblacion + ", codigoPostal=" + codigoPostal
				+ ", telefono=" + telefono + "]";
	}
	
	
	
}// end class
