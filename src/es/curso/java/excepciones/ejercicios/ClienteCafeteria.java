package es.curso.java.excepciones.ejercicios;

public class ClienteCafeteria {
	private String nombre;

	public ClienteCafeteria(String nombre) {
		super();
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
	
	void tomarTazaCafe (CoffeCup taza) 
			throws TooHotTemperatureException,
			TooColdTemperatureException{
		
		if (taza.getTemperature()>70) {
			//TooHotTemperatureException thte = new TooHotTemperatureException();
			//throw thte;
			throw new TooHotTemperatureException("El café está muy caliente");
		}else if (taza.getTemperature()<40) {
			throw new TooColdTemperatureException("El café estaba muy frio");
		}else {
			System.out.println("EL cliente "+this.nombre +" se está "
					+ "tomando la taza de café a "
					+taza.getTemperature() + " grados");
		}
	}
	
}
