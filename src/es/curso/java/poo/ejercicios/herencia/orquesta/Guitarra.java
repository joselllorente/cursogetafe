package es.curso.java.poo.ejercicios.herencia.orquesta;

public class Guitarra extends Instrumento{
	int numCuerdas;
	
	public Guitarra (String nombre, String tipo, int numCuerdas) {
		super(nombre,tipo);
		this.numCuerdas=numCuerdas;
	}

	/**
	 * @return the numCuerdas
	 */
	public int getNumCuerdas() {
		return numCuerdas;
	}

	/**
	 * @param numCuerdas the numCuerdas to set
	 */
	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + "]";
	}
	
	@Override
	public void afinar () {
		System.out.println("Afinando la guitarra "+ this.getNombre());
	}
	
}

