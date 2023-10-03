package es.curso.java.poo.ejercicios.supermercado;

public class Test {

	public static void main(String[] args) {
		Cajera cajera1 = new Cajera(1,"Cajera1");
		System.out.println(cajera1);
		Cajera cajera2 = cajera1;
		System.out.println(cajera2);
		System.out.println(cajera2.getId() + " " + cajera2.getNombre());

	} 

}
