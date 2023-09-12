package es.curso.java.introduccion.ejercicios;

/*
 * Declarar 3 variables:
 * 	 + 2 de tipo String nombre y apellidos
 * 	 + 1 de tipo int anioNacimiento
 * Inicializar las variables
 * Mostrar los datos con la edad del usuario e indicando con true o false
 * si el año es par o impar 
 */
public class EjercicioVariablesOperadores {

	public static void main(String[] args) {

		// Declarado e inicilizado las variables
		String nombre = "Jose Luis";
		String apellidos = "Llorente";
		int anioNacimiento = 2000;

		int edad = 2023 - anioNacimiento;
		boolean anioEsPar = (anioNacimiento % 2) == 0;

		System.out.println("El usuario " + nombre + " " + apellidos + " tiene\t" + edad + " años y \nnació en año par "
				+ anioEsPar);

		System.out.println("El usuario " + nombre + " " + apellidos + " tiene\t" + (2023 - anioNacimiento)
				+ " años y \nnació en año par " + ((anioNacimiento % 2) == 0));

	}

}
