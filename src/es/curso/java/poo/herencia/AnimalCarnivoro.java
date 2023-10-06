package es.curso.java.poo.herencia;

public class AnimalCarnivoro extends Animal {

	public AnimalCarnivoro(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beber() {
		System.out.println("Bebiendo por la boca");
		
	}
	
	
	
}
