package es.curso.java.repaso.ejercicios.ejercicio1;

public class Ferreteria {
	private long id;
	private String nombre;
	private String direccion;
	private Tornillo[] tornillos;
	
	public Ferreteria(long id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Ferreteria(long id, String nombre, String direccion, Tornillo[] tornillos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tornillos = tornillos;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the tornillos
	 */
	public Tornillo[] getTornillos() {
		return tornillos;
	}

	/**
	 * @param tornillos the tornillos to set
	 */
	public void setTornillos(Tornillo[] tornillos) {
		this.tornillos = tornillos;
	}
	
	
	

}
