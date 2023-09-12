package es.curso.java.introduccion.ejercicios.arrays;

public class ArraysAlumnosNotasConSplit {

	public static void main(String[] args) {

		String test = "Alumno1|9|Matemáticas";
		String [] datos = test.split("\\|");
//		for (String dato : datos) {
//			System.out.println(dato);	
//		}
		System.out.println(datos.length);
		System.out.println(test.length());
		
//		String [] alumnosNotas = {"Alumno1:9","Alumno2:8","Alumno3:3","Alumno4:4",
//				"Alumno5:5","Alumno6:10","Alumno7:4"};
////		
//		int contador=0;
//		String nombres="";
//		for(int i=0; i<alumnosNotas.length;i++) {
//			String dato = alumnosNotas[i];
//			//System.out.println(dato);
//			int posicionDosPuntos = dato.indexOf(":");
//			String nombre = dato.split(":")[0];
//			String notaStr = dato.split(":")[1];
//			
//			System.out.println("Nombre: "+nombre);
//			System.out.println("Nota: "+notaStr);
//			int nota = Integer.parseInt(notaStr);
//			
//			if (nota>=5) {
//				nombres+=nombre+":";
//			}
//			
//		}
//		
//		String [] alumnosAprobados = nombres.split(":");
//
//		System.out.println("Alumnos aprobados:"+alumnosAprobados.length);
//		for (String alumno : alumnosAprobados) {
//			System.out.println(alumno);
//		}

	}

}
