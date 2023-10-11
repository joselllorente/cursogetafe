package es.curso.java.poo.ejercicios.interfaces;

public abstract class ElectronicDevice extends ProductoElectronico {
	private long id;
	private double price;
	private String producer;
	private boolean powerStatus;

	public ElectronicDevice(long id, double price, String producer, boolean powerStatus) {
		super(false);
		this.id = id;
		this.price = price;
		this.producer = producer;
		this.powerStatus = powerStatus;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProducer() {
		return this.producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public boolean isPower_status() {
		return this.powerStatus;
	}


	public void setPower_status(boolean powerStatus) {
		this.powerStatus = powerStatus;
	}


	

}
