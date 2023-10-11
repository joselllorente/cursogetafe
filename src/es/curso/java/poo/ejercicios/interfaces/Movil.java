package es.curso.java.poo.ejercicios.interfaces;

public class Movil extends ElectronicDevice {
	private String os;



	public Movil(long id, double price, String producer, boolean powerStatus, String os) {
		super(id, price, producer, powerStatus);
		this.os = os;
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Movil os(String os) {
		setOs(os);
		return this;
	}

	@Override
	public void turnOn() {
		System.out.println("Encendiendo Movil");
		setEncendido(true);
		
	}

	@Override
	public void turnOff() {
		System.out.println("Apagando Movil");
		setEncendido(false);
	}
	

}
