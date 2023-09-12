package es.curso.java.introduccion;

public class Variables {
	//VARIABLES DE INSTANCIA O CLASE
	static String curso="CURSO JAVA";
	static int numero=10;
	
	public static void main(String[] args) {
		
		//VARIABLES LOCALES: SOlo se puede usar dentro del método donde se declara
		int num;//Declaracion
		num=7;//Inicializar
		int numero5, numero6, numero7;
		numero5=9;
		
		System.out.println("Numeros: "+ numero + numero5 +num);
		
		//Comentario de línea
		
		/*
		  Comentario de bloque
		  Linea
		  Linea2
		*/
		
		//Declaración de variable
		//Tipos primitivos
		//Numeros enteros
		byte numero2 = 127;
		short numero1 = 32767;
		int numero = 9;
		long numero3 = 10l;
		//Numeros Decimales
		double decimal1 = 9.6;
		float decimal2 = 8.7f;
		//Caracteres
		char caracter = '@';
		//Boolean
		boolean esMayorEdad = true;
		boolean esPar = false;
		
		int edad = 1+1;
		String nombre = "Jose Luis";
		
		System.out.println("Mi nombre es: "+ nombre 
				+ " y edad: " + (edad + decimal1) + curso);
		
		//nombre = "1";
		
		
		//System.out.println(nombre.toUpperCase());
	}

	static void metodo1() {
		int num;
		String nombre= "";
		System.out.println("Mi nombre es: "+ nombre +curso);
		
	}
	
	
}