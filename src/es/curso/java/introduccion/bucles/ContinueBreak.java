package es.curso.java.introduccion.bucles;

public class ContinueBreak {

	public static void main(String[] args) {
		//System.out.println(Math.random());
		System.out.println((int)(Math.random()*6)+1);
		
		for (int i = 0 ; i<5 ; i++) {
			System.out.println(i);
			System.out.println("Pasa0");
			if (i%2==0) {
				continue;
				//System.out.println("Hola");
			}
			if (i%3==0) {
				break;
			}
			System.out.println("Pasa1");
			System.out.println("Pasa2");
		}
		
		System.out.println("FIN");

	}

}
