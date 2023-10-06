package es.curso.java.poo.herencia;

public final class Leon extends AnimalCarnivoro {

	public Leon(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beber() {
		//super.beber();
		System.out.println("En el rio");
		
	}

	
}
