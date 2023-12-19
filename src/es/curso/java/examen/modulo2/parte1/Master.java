package es.curso.java.examen.modulo2.parte1;

public class Master extends CursoImpl {
	private boolean oficial;

//	public Master(boolean oficial) {
//		super();
//		this.oficial = oficial;
//	}

	public Master(String nombre, int codigo, int cupoMaximo, boolean oficial) {
		super(nombre, codigo, cupoMaximo);
		this.oficial = oficial;
	}

	/**
	 * @return the oficial
	 */
	public boolean isOficial() {
		return oficial;
	}

	/**
	 * @param oficial the oficial to set
	 */
	public void setOficial(boolean oficial) {
		this.oficial = oficial;
	}

	@Override
	public String toString() {
		return "Master [oficial=" + oficial + ", " + (super.toString() != null ? "toString()=" + super.toString() : "")
				+ "]";
	}
	
	
	
	

}
