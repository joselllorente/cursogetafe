package es.curso.java.colecciones.ejercicios.mapas.equipos;

public class Equipo {
	private String nombre;
	private int numLigas;
	private int numChampios;

	public Equipo(String nombre, int numLigas, int numChampios) {
		super();
		this.nombre = nombre;
		this.numLigas = numLigas;
		this.numChampios = numChampios;
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
	 * @return the numLigas
	 */
	public int getNumLigas() {
		return numLigas;
	}

	/**
	 * @param numLigas the numLigas to set
	 */
	public void setNumLigas(int numLigas) {
		this.numLigas = numLigas;
	}

	/**
	 * @return the numChampios
	 */
	public int getNumChampios() {
		return numChampios;
	}

	/**
	 * @param numChampios the numChampios to set
	 */
	public void setNumChampios(int numChampios) {
		this.numChampios = numChampios;
	}

	@Override
	public String toString() {
		return "Equipo [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "numLigas=" + numLigas
				+ ", numChampios=" + numChampios + "]";
	}

}
