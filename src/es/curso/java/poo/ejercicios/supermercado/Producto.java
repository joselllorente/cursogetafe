package es.curso.java.poo.ejercicios.supermercado;

public class Producto {
	private long id;
	private String nombre; 
	private double precio;
	private String tipo;
	
	public Producto(long id, String nombre, double precio, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio; 
		this.tipo = tipo;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "") + "precio=" + precio
				+ ", " + (tipo != null ? "tipo=" + tipo : "") + "]";
	}
	
	
	
	
}
