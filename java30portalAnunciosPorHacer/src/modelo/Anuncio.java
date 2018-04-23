package modelo;

public class Anuncio {

	private String titulo;
	private double precio;
	private String descripcion;
	private String telefono;
	private String email;

	public Anuncio() {
	}

	public Anuncio(String titulo, double precio, String descripcion,
			String telefono, String email) {
		super();
		this.titulo = titulo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.email = email;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Anuncio [titulo=" + titulo + ", precio=" + precio
				+ ", descripcion=" + descripcion + "]";
	}
	
	
}
