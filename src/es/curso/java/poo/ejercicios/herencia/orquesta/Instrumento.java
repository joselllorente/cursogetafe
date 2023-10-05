package es.curso.java.poo.ejercicios.herencia.orquesta;

public abstract class Instrumento {
	private String nombre;
	private String tipo;
	
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
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
		return "Instrumento [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (tipo != null ? "tipo=" + tipo : "") + "]";
	}
	

	public void afinar () {
		System.out.println("Afinando instrumento "+ this.nombre);
	}
	
	
	void tocar () {
		System.out.println("Tocando instrumento "+ this.nombre);
	}
	
}
