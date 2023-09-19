package es.curso.java.introduccion.funciones;

public class VarArgs {

	public static void main(String[] args) {
		metodo1(12 ,15,17);

		
		
	}

	public static void metodo1 (int num , int... nombres ) {
		int [] numeros = nombres;
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
	
}
