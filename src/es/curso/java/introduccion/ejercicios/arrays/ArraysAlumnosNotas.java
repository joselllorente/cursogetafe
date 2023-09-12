package es.curso.java.introduccion.ejercicios.arrays;

public class ArraysAlumnosNotas {

	public static void main(String[] args) {
		
		String [] alumnosNotas = {"Alumno1:9","Alumno2:8","Alumno3:3","Alumno4:4",
				"Alumno5:5","Alumno6:10","Alumno7:4"};
		
		int contador=0;
		for(int i=0; i<alumnosNotas.length;i++) {
			String dato = alumnosNotas[i];
			//System.out.println(dato);
			int posicionDosPuntos = dato.indexOf(":");
			String nombre = dato.substring(0,posicionDosPuntos);
			String notaStr = dato.substring(posicionDosPuntos+1);
			System.out.println("Nombre: "+nombre);
			System.out.println("Nota: "+notaStr);
			int nota = Integer.parseInt(notaStr);
			
			if (nota>=5) {
				contador++;
			}
			
		}
		
		String [] alumnosAprobados = new String [contador];
		
		int indice=0;
		for(int i=0; i<alumnosNotas.length;i++) {
			String dato = alumnosNotas[i];
			//System.out.println(dato);
			int posicionDosPuntos = dato.indexOf(":");
			String nombre = dato.substring(0,posicionDosPuntos);
			String notaStr = dato.substring(posicionDosPuntos+1);
			
			int nota = Integer.parseInt(notaStr);
			
			if (nota>=5) {
				alumnosAprobados[indice] = nombre;
				indice++;
			}
		}
		
		System.out.println("Alumnos aprobados:");
		for (String alumno : alumnosAprobados) {
			System.out.println(alumno);
		}

	}

}
