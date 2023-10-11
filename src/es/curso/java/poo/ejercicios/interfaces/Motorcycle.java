package es.curso.java.poo.ejercicios.interfaces;

public class Motorcycle extends Vehicle {
	private int wheels;

	public Motorcycle(long id, String plate, String company, 
			boolean power_status, int wheels) {
		super(id, plate, company, power_status);
		this.wheels = wheels;
	}

	public int getWheels() {
		return this.wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public Motorcycle wheels(int wheels) {
		setWheels(wheels);
		return this;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Encendiendo Moto");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Apagando Moto");
		
	}
	
}
