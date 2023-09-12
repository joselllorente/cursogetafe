package es.curso.java.introduccion.bucles;

public class BucleFor {

	public static void main(String[] args) {
		
		
		for ( int num=0;  num<5 ;  num--  ) { 
			System.out.println("Hola Mundo" + num);
		}
		
//		for (int num=0; num<=50 ; num+=2) {
//			System.out.println(num + " " + (49-num));
//		}
		
//		for (int num=49; num>=0 ; num-=2) {
//			System.out.println(num);
//		}
		
//		for (int num=2; num<=50 ; num+=2) {
//			System.out.println(num + " " + (51-num));
//		}
	
		String var1 = "";
		for (int numPar=0, numImpar=49 ; numPar<=50 ; numPar+=2, numImpar-=2   ) {
			System.out.println(numPar + " " + numImpar);
		}
		
		
	}

}
