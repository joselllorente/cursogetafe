package es.curso.java.introduccion.arrays;

public class EjemplosArrays {

	public static void main(String[] args) {
		
		String nombre = "Raúl"; 
		//Si ya conocemos los valores
		String [] nombres = {"n1","n2","n3","n4","n5"};
		//System.out.println(nombres.length);
		nombres[2]="n10";
		for (int i=0 ; i<nombres.length ; i++  ) {
			//System.out.println(i);
			System.out.println(nombres[i]);
		}
		System.out.println(nombres[4]);
		
		//Si no conocemos los valores
		int [] numeros = new int[3];
		
		numeros[1]=9;
		for (int i=0 ; i<numeros.length ; i++  ) {
			System.out.println(numeros[i]);
		}
		
	}

}
