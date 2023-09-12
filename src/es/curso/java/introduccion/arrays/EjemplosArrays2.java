package es.curso.java.introduccion.arrays;

public class EjemplosArrays2 {

	public static void main(String[] args) {
		
		int numeros [] = new int[10];
//		System.out.println("Posicion2: "+numeros[2]);
//		System.out.println("Posicion3: "+numeros[3]);
//		System.out.println("Posicion3: "+numeros[4]);
//		System.out.println("Posicion3: "+numeros[5]);
		
		numeros[3]=10;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=10;
		}
		
		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println("indice:"+i);
//			System.out.println(numeros[i]);
//		}
		
		for (int num : numeros) {
			System.out.println(num);
		}

	}

}
