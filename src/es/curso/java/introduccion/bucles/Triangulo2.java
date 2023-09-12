package es.curso.java.introduccion.bucles;

public class Triangulo2 {

	public static void main(String[] args) {
		int num = 4;
		int asteriscos =0;
	    for(int altura = 1; altura <= num; altura++){
	        //Espacios en blanco
	        for(int blancos = 1; blancos <= num-altura; blancos++){
	            System.out.print(" ");
	        }
	        //Asteriscos
	        for(asteriscos =1 ;asteriscos <= (altura*2)-1; asteriscos++){
	            System.out.print("*");
	        }
	        System.out.println("");//salto de linea
	    }
//	    asteriscos--;//decrementamos unidad por que incrementa una más en la última iteración
//	    System.out.println("Cantidad de caracteres en la base de la pirámide: "+asteriscos);


	}

}
