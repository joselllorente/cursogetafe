package es.curso.java.introduccion.arrays;

public class ArrayBidimensionalAsimetrico {

	public static void main(String[] args) {
		
		int [][] numeros = new int[3][];
		
		numeros[0] = new int[2];
		numeros[0][1]= 3;
		
		numeros[1] = new int[4];
		numeros[2] = new int[3];
		
		
		for (int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros[i].length;j++) {
				System.out.print(numeros[i][j]);
			}
			System.out.println();
			
		}
		

	}

}
