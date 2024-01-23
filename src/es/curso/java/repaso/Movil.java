package es.curso.java.repaso;

public class Movil {

	//Variables de instancia
	private long id;
	private String marca;
	private String modelo;
	private double precio;
	private boolean cincog=true;
	

	public Movil() {
	}
	
	public Movil(long id) {
		super();
		this.id = id;
	}
	
	public Movil(long id, String marca, String modelo, double precio) {
		this(id);
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		
	}

	public void llamar() {
		System.out.println("El teléfono "
				+id+" está llamando ");
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
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
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
	 * @return the cincog
	 */
	public boolean isCincog() {
		return cincog;
	}

	/**
	 * @param cincog the cincog to set
	 */
	public void setCincog(boolean cincog) {
		this.cincog = cincog;
	}

	
	
}
