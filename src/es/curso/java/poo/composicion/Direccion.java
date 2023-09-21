package es.curso.java.poo.composicion;

public class Direccion {
	private String nombreCalle;
	private int numero;
	private int codPostal;
	private String poblacion;
	private String provincia;
	
	public Direccion(String nombreCalle, int numero, int codPostal) {
		this.nombreCalle = nombreCalle;
		this.numero = numero;
		this.codPostal = codPostal;
	}
	
	public Direccion(String nombreCalle, int numero, int codPostal, String poblacion, String provincia) {
		this.nombreCalle = nombreCalle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.poblacion = poblacion;
		this.provincia = provincia;
	}

	public String getNombreCalle() {
		return nombreCalle;
	}

	public void setNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	

	
	
}
