package es.curso.java.repaso.herencia;

public abstract class Animal {
	private String nombre;

	
	public Animal(String nombre) {
		this.nombre = nombre;
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
	
	public double calculoVelocidad() {
		
		return Math.random();
	}
	
	public void correr() {
		double resultado = calculoVelocidad();
		System.out.println("El animal "+ nombre + " está corriendo "+resultado +" km/h");
	}
	
	abstract void comer();
	
}
