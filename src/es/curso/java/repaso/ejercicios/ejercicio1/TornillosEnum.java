package es.curso.java.repaso.ejercicios.ejercicio1;

public enum TornillosEnum {

	tornillo1(1,"Gris",5,2,0.1),
	tornillo2(2,"Gris",5,2,0.2),
	tornillo3(3,"Gris",5,2,0.3);
	
	private long id;
	private String color;
	private double longitud;
	private double diametro;
	private double precio;
	
	TornillosEnum(long id, String color, double longitud, double diametro, double precio) {

		this.id = id;
		this.color = color;
		this.longitud = longitud;
		this.diametro = diametro;
		this.precio = precio;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the diametro
	 */
	public double getDiametro() {
		return diametro;
	}

	/**
	 * @param diametro the diametro to set
	 */
	public void setDiametro(double diametro) {
		this.diametro = diametro;
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
	
	
	@Override
	public String toString() {
		return "";
	}
	
}
