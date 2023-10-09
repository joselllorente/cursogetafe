package es.curso.java.poo.ejercicios.hospital;

public class Habitacion {
	private int numero;
	private Enfermo enfermo;
	
	public Habitacion(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Enfermo getEnfermo() {
		return enfermo;
	}

	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}
	
	

}
