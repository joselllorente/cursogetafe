package es.curso.java.introduccion.ejercicios.funciones;

import es.curso.java.utils.Utilidades;

public class Calculadora {
	final static String [] OPCIONES_MENU_ARRAY = {"1. Sumar.","2. Restar",
			"3. Multiplicar", "4. Dividir" , "5. Cientifica" , "6. Salir"};
	
	final static String [] OPCIONES_MENU_CIENTIFICA = {"1. Potencia.","2. Raiz cuadrada",
			"3. Seno", "4. Coseno" , "5. Volver" };
	
	public static void main(String[] args) {
		double resultado = 0;
		int opcion = 0;
		do {
			opcion = Utilidades.pintarMenu(OPCIONES_MENU_ARRAY,"Introduce valor (1-6)");
			
			switch (opcion) {
				case 1: resultado = operar(resultado,"sumar"); break;
				case 2: resultado = operar(resultado,"restar"); break;
				case 3: resultado = operar(resultado,"multiplicar"); break;
				case 4: resultado = operar(resultado,"dividir"); break;
				case 5: resultado = menuCientifica(resultado); break;
				case 6: //Salir
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opción incorrecta");
			
			}
			
		}while(opcion!=6);

	}
	
	//Hacemos todas las operaciones en un único método
	public static double operar(double resultado, String operacion) {
		
		int num = Utilidades.pideDatoNumerico("Introduce un numero a "+operacion);
		
		switch(operacion) {
			case "sumar": resultado += num; break;
			case "restar": resultado -= num; break;
			case "multiplicar": resultado *= num; break;
			case "dividir": resultado /= num; break;
		}
		
		System.out.println("Resultado: "+ resultado);
		
		return resultado;
	}
	
	public static double menuCientifica(double resultado) {
		int opcion = 0;
		do {
			opcion = Utilidades.pintarMenu(OPCIONES_MENU_CIENTIFICA,"Introduce valor (1-5)");
			
			switch (opcion) {
				case 1: 
					int num = Utilidades.pideDatoNumerico("Introduce un numero");
					resultado = Math.pow(resultado, num); break;
					
				case 2: resultado = Math.sqrt(resultado); break;
				case 3: resultado = Math.sin(resultado); break;
				case 4: resultado = Math.cos(resultado); break;
				case 5: break;
				default:
					System.out.println("Opción incorrecta");
			
			}
			System.out.println("El resultado es "+resultado);
			
		}while(opcion!=5);
		
		return resultado;
	}

}




