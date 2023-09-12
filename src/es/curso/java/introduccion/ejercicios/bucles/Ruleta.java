package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;

public class Ruleta {

	public static void main(String[] args) {
		final String preguntaApuesta = "¿Cuánto quieres apostar";
		String nombreUsuario = "Jugador1";
		double importeUsuario = 1000;

		int opcion = 0;
		System.out.println("Bienvenido "+nombreUsuario);
		do {
			System.out.println("Tienes "+importeUsuario + " euros ");
			System.out.println("1. Apostar por un número (0-36)\n" 
					+ "2. Apostar por docenas (0-12/13-24/25-36)\n"
					+ "3. Apostar por par/impar\n" 
					+ "4. Apostar por rojo/negro\n" 
					+ "5. Dejar de jugar\n" + "");
			
			System.out.println("Elige una opcion");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			//Esta accion solo se debe ejecutar en las opciones 1-4
			int numero = 0;
			double importeApostado= 0;
			if (opcion>0 && opcion<5) {
				//TODO controlar que sea importe correcto
				System.out.println(preguntaApuesta);
				scan = new Scanner(System.in);
				importeApostado= scan.nextDouble();
				importeUsuario = importeUsuario-importeApostado;
				
				//Simulamos que se lanza la ruleta
				numero = (int)(Math.random()*37);
			}
			switch (opcion) {
			case 1:
				//Pedimos numero al usuario
				//TODO controlar numero correcto
				System.out.println("Elige un numero");
				scan = new Scanner(System.in);
				int numeroApostado = scan.nextInt();

//Dos formas de hacer lo mismo
//				if (numero==numeroApostado) {//Ha ganado
//					double ganancia = (importeApostado*36);
//					importeUsuario = (importeUsuario-importeApostado) + ganancia ;
//				}else {
//					importeUsuario = importeUsuario-importeApostado;
//					//importeUsuario-=importeApostado;
//				}
				System.out.println("Numero del juego "+numero);
				
				if (numero==numeroApostado) {//Ha ganado
					double ganancia = (importeApostado*36);
					System.out.println("Enhorabuena has ganado "+ganancia + " euros");
					importeUsuario +=  ganancia ;
					
				}else {
					System.out.println("Has perdido, sigue probando");
				}
				break;
			case 2: 
				System.out.println("Elige una docena (1,2,3)");
				scan = new Scanner(System.in);
				int docenaApostada = scan.nextInt();
				
//				int docenaResultado = numero/12-1;
//				if (docenaApostada-1 == docenaResultado) {
//					
//				}
				System.out.println("Numero del juego "+numero);
//				if(numero%12==docenaApostada-1) {
//					double ganancia = (importeApostado*12);
//					System.out.println("Enhorabuena has ganado "+ganancia + " euros");
//					importeUsuario +=  ganancia ;
//				}
				
				if (numero>0 && numero<=12 && docenaApostada==1 ||
					numero>12 && numero<=24 && docenaApostada==2 || 
					numero>24 && numero<=36 && docenaApostada==3 ) {
					
					double ganancia = (importeApostado*12);
					System.out.println("Enhorabuena has ganado "+ganancia + " euros");
					importeUsuario +=  ganancia ;
					
				}else {
					System.out.println("Has perdido, sigue probando");
				}
				break;
			case 3:
				System.out.println("Elige par/impar");
				scan = new Scanner(System.in);
				String apuesta = scan.nextLine();
				System.out.println("Numero del juego "+numero);
				if (apuesta.equals("par") && numero%2==0 || 
					apuesta.equals("impar") && numero%2!=0) {
					
					double ganancia = (importeApostado*2);
					System.out.println("Enhorabuena has ganado "+ganancia + " euros");
					importeUsuario +=  ganancia ;
					
				}else {
					System.out.println("Has perdido, sigue probando");
				}
				break;
			case 4:
				System.out.println("Elige rojo/negro");
				scan = new Scanner(System.in);
				String colorApuesta = scan.nextLine();
				System.out.println("Numero del juego "+numero);
				if (colorApuesta.equals("rojo") && numero>18 || 
						colorApuesta.equals("negro") && numero<=18) {
					double ganancia = (importeApostado*2);
					System.out.println("Enhorabuena has ganado "+ganancia + " euros");
					importeUsuario +=  ganancia ;
				}else {
					System.out.println("Has perdido, sigue probando");
				}
				break;
			case 5:
				System.out.println("Adios");
			}
			
			
			
			
			if (importeUsuario==0) {
				System.out.println("Te has arruinado. Hasta otra!");
			}
		} while (opcion != 5 && importeUsuario!=0);

	}

}
