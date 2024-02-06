package es.curso.java.repaso.herencia;

public class Zoologico {

	public static void main(String[] args) {
		
		
		PerroAfricano pa = new PerroAfricano("PA1", "moteados");
		Animal animal = new PerroAfricano("PA2", "negro");
		Animal animal2 = new Cebra("CE1", "común");
		
		animal.correr();
		if(animal instanceof PerroAfricano) {
			PerroAfricano pa2 = ((PerroAfricano)animal);
			pa2.ladrar();
		}
		System.out.println(animal2.getNombre());
		//System.out.println(animal.toString());
//		animal2.toString();
	}

}

