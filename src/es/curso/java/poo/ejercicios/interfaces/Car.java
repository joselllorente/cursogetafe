package es.curso.java.poo.ejercicios.interfaces;

public class Car extends Vehicle {
	private int wheels;

	public Car(long id, String plate, String company, boolean power_status, int wheels) {
		super(id, plate, company, power_status);
		this.wheels = wheels;
	}

	public Car(Vehicle vehicle, int wheels) {
		super(vehicle.getId(), vehicle.getPlate(), vehicle.getCompany(), vehicle.isPower_status());
		this.wheels = wheels;
	}

	public int getWheels() {
		return this.wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public void turnOn() {
		System.out.println("Encendiendo Coche");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Apagando Coche");
		
	}

	
	

}
