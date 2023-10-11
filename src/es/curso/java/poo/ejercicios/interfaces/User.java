package es.curso.java.poo.ejercicios.interfaces;

public class User {
	private Movil phone;
	private Motorcycle motorcycle;
	private Car car;
	private Television tv;


	public User() {
	}

	public User(Movil phone, Motorcycle motorcycle, Car car, Television tv) {
		this.phone = phone;
		this.motorcycle = motorcycle;
		this.car = car;
		this.tv = tv;
	}

	public Movil getPhone() {
		return this.phone;
	}

	public void setPhone(Movil phone) {
		this.phone = phone;
	}

	public Motorcycle getMotorcycle() {
		return this.motorcycle;
	}

	public void setMotorcycle(Motorcycle motorcycle) {
		this.motorcycle = motorcycle;
	}

	public Car getCar() {
		return this.car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Television getTv() {
		return this.tv;
	}

	public void setTv(Television tv) {
		this.tv = tv;
	}

	public User phone(Movil phone) {
		setPhone(phone);
		return this;
	}

	public User motorcycle(Motorcycle motorcycle) {
		setMotorcycle(motorcycle);
		return this;
	}

	public User car(Car car) {
		setCar(car);
		return this;
	}

	public User tv(Television tv) {
		setTv(tv);
		return this;
	}



}
