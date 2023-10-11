package es.curso.java.poo.ejercicios.interfaces;

public class Television extends ElectronicDevice {
	private int hdmi_ports;

	public Television(long id, double price, String producer, boolean powerStatus, int hdmi_ports) {
		super(id, price, producer, powerStatus);
		this.hdmi_ports = hdmi_ports;
	}

	public int getHdmi_ports() {
		return this.hdmi_ports;
	}

	public void setHdmi_ports(int hdmi_ports) {
		this.hdmi_ports = hdmi_ports;
	}

	public Television hdmi_ports(int hdmi_ports) {
		setHdmi_ports(hdmi_ports);
		return this;
	}

	@Override
	public void turnOn() {
		System.out.println("Encendiendo Tele");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Apagando Tele");
		
	}
	
}
