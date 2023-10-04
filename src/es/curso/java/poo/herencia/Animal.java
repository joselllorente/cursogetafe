package es.curso.java.poo.herencia;

public class Animal {
	
	private String nombre;
	private int edad;
	
	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void comer() {
		System.out.println("El animal "+ getNombre() + " esta comiendo");
	}
	
	

}
