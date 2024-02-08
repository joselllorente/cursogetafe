package es.curso.java.hibernate.advanced.compositekey;

import java.io.Serializable;


public class DireccionPK implements Serializable{

	private String direccion;
	private String codigoPostal;
	
	public DireccionPK(String direccion, String codigoPostal) {
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
	}
	public DireccionPK() {
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	
	
}
