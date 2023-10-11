package es.curso.java.poo.ejercicios.interfaces;

public abstract class Vehicle extends ProductoElectronico  {
	private long id;
	private String plate;
	private String company;
	private boolean power_status;


	public Vehicle(long id, String plate, String company, boolean power_status) {
		super(false);
		this.id = id;
		this.plate = plate;
		this.company = company;
		this.power_status = power_status;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlate() {
		return this.plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isPower_status() {
		return this.power_status;
	}

	public void setPower_status(boolean power_status) {
		this.power_status = power_status;
	}



}
