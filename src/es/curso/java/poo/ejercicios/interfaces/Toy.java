package es.curso.java.poo.ejercicios.interfaces;

public class Toy implements TurnOnSystem{
	private String tipo;

	public Toy(String tipo) {
		super();
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
	
	public void turnOn() {
		System.out.println("Encendiendo Moto");
		
	}


	public void turnOff() {
		System.out.println("Apagando Moto");
		
	}

	@Override
	public void reparar() {
		// TODO Auto-generated method stub
		
	}
}
