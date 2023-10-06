package es.curso.java.poo.ejercicios.caballos;

import java.util.Random;

public class Caballo {

	private long id;
	private String nombre;
	private int numero;
	private int edad;
	private double velocidad;
	private double peso;
	private double avance;
	private boolean trampa;

	public Caballo(long id, String nombre, int numero, 
			int edad, double velocidad, double peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
	}
	
	Caballo(long id, String nombre, int numero, int edad, 
			double velocidad, double peso, boolean trampa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
		this.trampa = trampa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAvance() {
		return avance;
	}

	public void correr() {
		double avance = 0;

		Random rd1 = new Random();
		int randomVelocidad = rd1.nextInt(20);
		int randomPeso = rd1.nextInt(1, 3);
		int randomEdad = rd1.nextInt(1, 3);

		avance = this.velocidad * randomVelocidad 
				- this.peso * randomPeso 
				- this.edad * randomEdad;
		
		System.out.println("El caballo "+ nombre + " ha avanzado "+ 
		(avance > 0 ? avance : 0));
		
		this.avance += avance > 0 ? avance : 0;
		
	}
	
	public void reseteaAvance(){
		this.avance = 0;
	}

}
