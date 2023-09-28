package es.curso.java.poo.ejercicios.caballos;

import es.curso.java.utils.Utilidades;

public class Apostante {
	private long id;
	private String nombre;
	private int apuesta;
	private double saldo;
	
	public Apostante(long id, String nombre, double saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getApuesta() {
		return apuesta;
	}
	public void setApuesta(int apuesta) {
		this.apuesta = apuesta;
	}
	public double getSaldo() {
		return saldo;
	}

	public long getId() {
		return id;
	}
	
	public int apostar (Caballo [] caballosParticipantes) {
		int importeApostado = 0;
		if (this.saldo>0) {
			System.out.println("Estos son los caballos participantes");
			for (Caballo caballo : caballosParticipantes) {
				System.out.println(caballo.getNombre() + " " +caballo.getNumero());
			}
			
			this.apuesta = Utilidades.pideDatoNumerico(this.nombre + " por qué número de caballo deseas apostar");
			importeApostado = Utilidades.pideDatoNumerico("Cuánto deseas apostar, tienes "+ this.saldo);
			this.saldo -= importeApostado;
		} 
		return importeApostado;
	}
	
	public void actualizaSaldo(int importe) {
		this.saldo += importe;
	}
}
