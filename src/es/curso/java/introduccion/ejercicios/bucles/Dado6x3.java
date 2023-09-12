package es.curso.java.introduccion.ejercicios.bucles;

public class Dado6x3 {

	public static void main(String[] args) {
		int tirada = 0;
		int contador = 0;
		int contadorGeneral=0;
		do {
			tirada = (int)(Math.random()*6)+1;
			System.out.println(tirada);
			
			if (tirada==6) {
				contador++;
			}else {
				contador=0;
			}
			contadorGeneral++;
			
			if (contador==3) {
				break;
			}
			
		}while(true);	
		//}while(contador!=3);
		
		System.out.println("FIN. Se han necesista "+ contadorGeneral + " tiradas");

	}

}
