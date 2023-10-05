package es.curso.java.poo.ejercicios.herencia.orquesta;

public class GuitarraElectrica extends Guitarra {
	private double potencia;
	
	public GuitarraElectrica(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo, numCuerdas);
		// TODO Auto-generated constructor stub
	}

	public GuitarraElectrica(String nombre, String tipo, int numCuerdas, double potencia) {
		super(nombre, tipo, numCuerdas);
		this.potencia = potencia;
	}

	

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + "]";
	}

	@Override
	public void tocar() {
		super.tocar();
		System.out.println("Muy alto");
	}
	
	

}
