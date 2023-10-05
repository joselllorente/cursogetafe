package es.curso.java.poo.ejercicios.herencia.orquesta;

public class Piano extends Instrumento {
	int numeroOctavas;
	String tipoPiano;
	
	public Piano(String nombre, String tipo, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo);
		this.numeroOctavas = numeroOctavas;
		this.tipoPiano = tipoPiano;
	}

	/**
	 * @return the numeroOctavas
	 */
	public int getNumeroOctavas() {
		return numeroOctavas;
	}

	/**
	 * @param numeroOctavas the numeroOctavas to set
	 */
	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}

	/**
	 * @return the tipoPiano
	 */
	public String getTipoPiano() {
		return tipoPiano;
	}

	/**
	 * @param tipoPiano the tipoPiano to set
	 */
	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}


	@Override
	public void afinar() {
		System.out.println("Afinando Piano "+ getNombre());
	}


	@Override
	public String toString() {
		return "Piano [numeroOctavas=" + numeroOctavas + ", " + (tipoPiano != null ? "tipoPiano=" + tipoPiano : "")
				+ "]";
	}

}
