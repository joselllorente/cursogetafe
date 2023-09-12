package es.curso.java.introduccion.arrays;


public class ArraysBidimensionales {

	public static void main(String[] args) {
		
		int [][] numeros = { {1,2,3} , {4,5,6} };
		
		
//		String [] datos = {"dato1","dato2"};
//		System.out.println(datos);
		String [][] animales = new String[3][5];
		
//		System.out.println(animales[2][1]);
//		System.out.println(animales[2][4]);
		animales[0][0] = "Gato";
		
//		System.out.println(animales.length);//Numero de filas
//		System.out.println(animales[0].length);//Numero de columnas de la fila 0
		
		//Metemos información en el array
		for (int i=0; i<animales.length;i++) {
			//System.out.println("Fila "+i);
			for(int j=0; j<animales[i].length ; j++ ) {
				//System.out.println("\tColumna "+j);
				animales[i][j]="*";
			}
		}
		
		//Mostramos información
		for (int i=0; i<animales.length;i++) {
			//System.out.println("Fila "+i);
			for(int j=0; j<animales[i].length ; j++ ) {
				//System.out.println("\tColumna "+j);
				System.out.print(animales[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("========================================");
		
		for( String [] fila : animales ) {
			//System.out.println(fila);
			for (String dato : fila) {
				System.out.print(dato);
			}
			System.out.print("\n");
		}

	}

}
