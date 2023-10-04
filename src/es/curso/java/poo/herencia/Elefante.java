package es.curso.java.poo.herencia;

public class Elefante extends Animal{
	private int numColmillos;
	
	public Elefante(String nombre, int edad) {
		super(nombre, edad);
		numColmillos = 2;
		// TODO Auto-generated constructor stub
	}

	public Elefante(String nombre, int edad, int numColmillos) {
		super(nombre, edad);
		this.numColmillos = numColmillos;
	}


	public void barritar () {
		System.out.println("El elefante "+ getNombre() + " esta barritando según Rocio");
	}
	
	public void comer() {
		System.out.println("El elefante "+ getNombre() + " esta comiendo");
	}
	
}
