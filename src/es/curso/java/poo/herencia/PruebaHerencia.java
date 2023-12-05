package es.curso.java.poo.herencia;

public class PruebaHerencia {

	public static void main(String[] args) {
//		Animal animal = new Animal("Animal1",1);
//		animal.comer();
		
		Elefante elefante1 = new Elefante("Dumbo",2);
		elefante1 = null;
		elefante1.barritar();
		//elefante1.comer();
		//System.out.println(elefante1.getNombre());
		//elefante1.barritar();
		
		Animal animal2 = new Elefante("Pisony",3);
		animal2.comer();
		if (animal2 instanceof Elefante) {
			Elefante e = (Elefante)animal2;
			e.barritar();
		}
		Animal animal3 = new PerroAfricano("Firulais", 4);
		if (animal3 instanceof Elefante) {
			Elefante e2 = (Elefante)animal3;
			e2.barritar();
		}
		
		System.out.println(elefante1 instanceof Animal);
		
		//
		//Elefante e = new Animal("",2);
		
		Animal animal = new Elefante("Dumbo",2);
		if(animal instanceof Elefante) {
			Elefante e =((Elefante)animal);
			e.barritar();
		}
		//animal.barritar();
	}
	
	

}
