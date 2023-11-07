package es.curso.java.ddbb.ejercicios.biblioteca.entities;

public class Direccion {
	private long id;
	private String tipo;
	private String nombre;
	private String ciudad;
	private String provincia;
	private int codPostal;
	
	public Direccion(long id, String tipo, String nombre, String ciudad, String provincia, int codPostal) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codPostal = codPostal;
	}
	
	public Direccion(String tipo, String nombre, String ciudad, String provincia, int codPostal) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codPostal = codPostal;
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
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}
	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	/**
	 * @return the codPostal
	 */
	public int getCodPostal() {
		return codPostal;
	}
	/**
	 * @param codPostal the codPostal to set
	 */
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	@Override
	public String toString() {
		return "Direccion [id=" + id + ", " + (tipo != null ? "tipo=" + tipo + ", " : "")
				+ (nombre != null ? "nombre=" + nombre + ", " : "") + (ciudad != null ? "ciudad=" + ciudad + ", " : "")
				+ (provincia != null ? "provincia=" + provincia + ", " : "") + "codPostal=" + codPostal + "]";
	}
	
	
	
}
