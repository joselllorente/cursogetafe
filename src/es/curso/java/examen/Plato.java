package es.curso.java.examen;

public class Plato {
	private String nombre;
	private double precio;
	private boolean disponible;
	
	public Plato(String nombre, double precio, boolean disponible) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Plato [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "precio=" + precio + ", disponible="
				+ disponible + "]";
	}
	
	

}
