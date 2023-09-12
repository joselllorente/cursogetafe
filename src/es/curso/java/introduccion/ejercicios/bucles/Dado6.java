package es.curso.java.introduccion.ejercicios.bucles;

/*
 * Tirar un dado un numero indeterminado de veces,
   Parar cuando el numero que sale es el 6
 */
public class Dado6 {

	public static void main(String[] args) {
		
		do {
			int dado = (int)(Math.random()*6)+1;
			System.out.println(dado);
			if (dado==6) {
				break;
			}
		}while(true);

		
		int tirada = 0;
		do {
			tirada = (int)(Math.random()*6)+1;
			System.out.println(tirada);
		}while(tirada!=6);
		
		
		while (true) {
			int dado = (int)(Math.random()*6)+1;
			System.out.println(dado);
			if (dado==6) {
				break;
			}
		}
		
		
		for (  ; true ;  ) {
			int dado = (int)(Math.random()*6)+1;
			System.out.println(dado);
			if (dado==6) {
				break;
			}
			
		}
		
		
		

	}

}
