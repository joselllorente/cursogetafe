package es.curso.java.introduccion.ejercicios.condicionales;

import java.util.Scanner;

public class CosteLlamada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int duracion;
	    String dia;
	    
	    double precio = 1;
	    double impuesto;
	    // Solicitud de datos al usuario
	    System.out.println("Calculamos el precio base de la llamada y el impuesto a pagar:");
	    System.out.print("Duración de la llamada en minutos: ");
	    duracion = scanner.nextInt();
	    System.out.print("Día de la semana: ");
	    dia = scanner.next(); scanner.nextLine();
	    
	    // Calculamos el precio base a pagar:
	    if (duracion > 5 && duracion<=8){
	        precio += 0.8;
	    } else if (duracion > 8 && duracion<=10	 ){
	        precio += 0.7;
	    } else if (duracion > 10){
	    	precio += (duracion-10)*0.5;
	        precio = 1.80;
	    } else {
	        precio = 1;
	    }   
	    
	    // Preguntamos día y calculamos impuesto correspondiente.
	    if (!dia.toUpperCase().equals("DOMINGO")) {
	      System.out.print("¿En que horario se realizó la llamada? ");
	      int horario = scanner.nextInt();
	      if (horario<=12) {
	        impuesto = precio * 0.15;
	      } else if (horario>12 ) {
	        impuesto = precio * 0.10;
	      // Si el horario es incorrecto se dará valor 0 al impuesto y el programa 
	      // presentará error.
	      } else {
	        impuesto = 0; 
	      }
	    } else {
	      impuesto = precio * 0.03;
	    }
	    
	    // Mostramos resultado en pantalla, si horario incorrecto, mostrará error.
	    if (impuesto == 0) {
	      System.out.println("El horario introducido es incorrecto, reinicia el programa "
	          + "e introduce los valores correctos.");
	    } else {
	      System.out.println("El precio total de la llamada es de " + (precio + impuesto) 
	          + " siendo el precio base de " + precio + " y el impuesto a pagar " + impuesto);
	    }
	    System.out.printf("");
	}

}
