package es.curso.java.introduccion.ejercicios.condicionales;

/* Declarar e inicializar una variable de tipo String 
 * con el valor del nombre de un mes:
 * 
 * Dependiendo del nombre del mes indicar la estación del año.
 * Si el nombre del mes es incorrecto indicarlo.
 */
public class EjercicioIfEstacionesVariable {
	public static void main(String[] args) {
		String mes = "Eneroooo";
		String estacion = "";
		
		if (   mes == "Enero" || mes=="Febrero"  || mes=="Marzo"  ) {
			estacion = "invierno";
		}else if (   mes == "Abril" || mes=="Mayo"  || mes=="Junio"  ) {
			estacion = "primavera";
		}else if (   mes == "Julio" || mes=="Agosto"  || mes=="Septiembre"  ) {
			estacion = "verano";
		}else if (   mes == "Octubre" || mes=="Noviembre"  || mes=="Diciembre"  ) {
			estacion = "otoño";
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
