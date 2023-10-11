package es.curso.java.poo.ejercicios.interfaces;

public abstract class ProductoElectronico implements TurnOnSystem{
	private boolean encendido;

	public ProductoElectronico(boolean encendido) {
		super();
		this.encendido = encendido;
	}

	/**
	 * @return the encendido
	 */
	public boolean isEncendido() {
		return encendido;
	}

	/**
	 * @param encendido the encendido to set
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	@Override
	public void reparar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
