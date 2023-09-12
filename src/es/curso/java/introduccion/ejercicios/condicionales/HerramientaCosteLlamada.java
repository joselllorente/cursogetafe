package es.curso.java.introduccion.ejercicios.condicionales;

import java.util.Scanner;

public class HerramientaCosteLlamada {

	public static void main(String[] args) {
		//Declaramos las variables
		int tiempo=0;
		String dia = "";
		int hora = 0;
		double costeLlamada = 0;
		
		//Obtenemos los datos
		System.out.println("Introduce tiempo llamada");
		Scanner scan = new Scanner(System.in);
		tiempo = scan.nextInt();
		 
		System.out.println("Introduce día de la semana");
		scan = new Scanner(System.in);
		dia = scan.nextLine();
		
		System.out.println("Introduce la hora de llamada");
		scan = new Scanner(System.in);
		hora= scan.nextInt();
		
		if(tiempo>0) {
			//Calculamos coste de la llamada
			costeLlamada=1;
			
			if(tiempo>5) {
				//costeLlamada = costeLlamada+ 0.8;
				costeLlamada += 0.8;
			}
			if(tiempo>8){
				costeLlamada += 0.7;
			}
			if(tiempo>10){
				costeLlamada += (tiempo-10)*0.5;
			}
			
			
			//Aplicamos impuestos
			if (dia.equalsIgnoreCase("domingo")) {
				//costeLlamada = costeLlamada * 1.03;
				costeLlamada *= 1.03;
			}else {
				
				if (hora> 6 && hora<= 12) {
					costeLlamada *= 1.15;
				}else if (hora >12 && hora<=23) {
					costeLlamada *= 1.10;
				}else {
					costeLlamada *= 0.9;
				}
				
			}
			
			
			//System.out.println("El coste de la llamada ha sido de "+costeLlamada);
			System.out.printf("El coste de la llamada ha sido de %.2f",costeLlamada);
			System.err.println();
		}else {
			System.err.println("El tiempo no puede ser negativo");
		}
		
		System.out.println("FIN");
		

	}

}
