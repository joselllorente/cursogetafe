package es.curso.java.introduccion.ejercicios.condicionales;

import java.util.Scanner;

/* Declarar e inicializar una variable de tipo String 
 * con el valor del nombre de un mes:
 * 
 * Dependiendo del nombre del mes indicar la estación del año.
 * Si el nombre del mes es incorrecto indicarlo.
 * 
 * Si el mes es Agosto indicar además que está en vacaciones de verano 
 * y si es diciembre en vacaciones de Navidad 
 */
public class EjercicioIfEstacionesVariableVacaciones {
	public static void main(String[] args) {
		//Cojo texto de la consola
		System.out.println("Introduce un mes");
		Scanner scan = new Scanner(System.in);
		String mes = "Abril";//scan.nextLine();
		
		System.out.println("EL valor recogido por la consola es '" +mes +"'");
		
		
		String estacion = "";
		
		if (   mes == "Enero" || mes=="Febrero"  || mes=="Marzo"  ) {
			estacion = "invierno";
		}else if (   mes == "Abril" || mes=="Mayo"  || mes=="Junio"  ) {
			estacion = "primavera";
		}else if (   mes == "Julio" || mes=="Agosto"  || mes=="Septiembre"  ) {
			estacion = "verano";
			if (mes=="Agosto") {
				//estacion = estacion + "Son vacaciones de verano";
				estacion += "\tSon vacaciones de verano";
			}
			
		}else if (   mes == "Octubre" || mes=="Noviembre"  || mes=="Diciembre"  ) {
			estacion = "otoño";
			if (mes=="Diciembre") {
				estacion += "\tSon vacaciones de Navidad";
			}
		}else {
			System.out.println("Mes incorrecto");
		}
		
		if(estacion!="") {
			System.out.println("Estás en " +estacion);
		}
		
//		if(estacion == "") {
//			System.out.println("Mes incorrecto");
//		}else {
//			System.out.println("Estás en " +estacion);
//		}
		
		
		System.out.println("Fin");
	}
}
