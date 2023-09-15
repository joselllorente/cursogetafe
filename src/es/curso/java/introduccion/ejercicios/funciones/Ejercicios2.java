package es.curso.java.introduccion.ejercicios.funciones;

public class Ejercicios2 {

	public static void main(String[] args) {

		
		String [] datos = juntaDatos("Hola",7);
		juntaDatos("Hola");
		//System.out.println(datos);
		
//		for (String dato : datos) {
//			System.out.println(dato);
//		}

		
		String [] datosDificil = juntaDatosDificil("Hola",500);
		for (String dato : datosDificil) {
			System.out.println(dato);
		}
	}
	
	
	//SOBRECARGA DE METODOS. Métodos que se tienen el mismo nombre pero diferente
	// numero y/o tipo de parámetros
	public static String [] juntaDatos (String texto) {
		
		return juntaDatos(texto,4);
	}

	/**
	 * Devolver el texto tantas veces como indique el numRepeticiones
	 * @author Jose Luis Llorente
	 * @since 1.0
	 * @param texto el texto que va a ser almacenado en el array
	 * @param numRepeticiones numero de repeticiones que se va a repetir el texto en el array
	 * @return Array con l...
	 */
	public static String [] juntaDatos (String texto, int numRepeticiones) {
		String [] datos = new String[numRepeticiones];
		
		for (int i = 0; i < datos.length; i++) {
			datos[i]=texto;
		}
		
		return datos;
	}
	
	
	/**
	 * metemos en el array los valores del texto que llega eliminando un caracter en cada repetecion
	EJ. texto="Hola", numRepeticiones=3  => {Hola, Hol, Ho}
	 * @param texto
	 * @param numRepeticiones
	 * @return
	 */
	public static String [] juntaDatosDificil (String texto, int numRepeticiones) {
		
		int tamanio = texto.length()>=numRepeticiones?numRepeticiones:texto.length();
		
//		int tamanio2 = 0;
//		if (texto.length()>=numRepeticiones) {
//			tamanio2 = numRepeticiones;
//		}else {
//			tamanio2 = texto.length();
//		}
		
		String [] datos = new String[tamanio];
		
		for (int i = 0; i < datos.length; i++) {
			datos[i]=texto.substring(0,texto.length()-i);
		}
		
		return datos;
	}
	
	
	
	
}
