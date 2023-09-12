package es.curso.java.introduccion.ejercicios.condicionales;

/* Declarar e inicializar una variable de tipo String 
 * con el valor del nombre de un mes:
 * 
 * Dependiendo del nombre del mes indicar la estación del año.
 * Si el nombre del mes es incorrecto indicarlo.
 */
public class EjercicioIfEstaciones {
	public static void main(String[] args) {
		String mes = "Agosto";

		if (   mes == "Enero" || mes=="Febrero"  || mes=="Marzo"  ) {
			System.out.println("Estás en invierno");
		}else if (   mes == "Abril" || mes=="Mayo"  || mes=="Junio"  ) {
			System.out.println("Estás en primavera");
		}else if (   mes == "Julio" || mes=="Agosto"  || mes=="Septiembre"  ) {
			System.out.println("Estás en verano");
		}else if (   mes == "Octubre" || mes=="Noviembre"  || mes=="Diciembre"  ) {
			System.out.println("Estás en otoño");
		}else {
			System.out.println("Mes incorrecto");
		}
		
		System.out.println("Fin");
	}
}
