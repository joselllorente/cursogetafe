package es.curso.java.repaso.herencia;

public class Cebra extends Animal {
	private String tipo;

	public Cebra(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cebra [" + (tipo != null ? "tipo=" + tipo : "") + "]";
	}

	@Override
	void comer() {
		System.out.println("La cebra está comiendo");
		
	}

	@Override
	public void correr() {
		System.out.println("La cebra está corriendo");
	}
	
	
	
	
}
