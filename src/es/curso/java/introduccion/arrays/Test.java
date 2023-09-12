package es.curso.java.introduccion.arrays;

public class Test {

	public static void main(String[] args) {
		int i = 2;
		int notas  [] = new int [i];
		
		notas[0]=10;

		System.out.println(notas[0]);

		i=4;		
		notas  = new int [i];
		System.out.println(notas[0]);
	}

}
