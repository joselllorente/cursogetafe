package es.curso.java.colecciones.ejercicios.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import es.curso.java.poo.ejercicios.Alumno;
import es.curso.java.utils.Utilidades;

public class MapaAlumnos {

	public static void main(String[] args) {
		MapaAlumnos ma = new MapaAlumnos();
		ma.inicioEjercicio();

	}
	
	public void inicioEjercicio () {
		
		Map<String,Alumno> alumnosMap = new HashMap<String,Alumno>();
		
		for(Alumno alumno : generaAlumnos()) {
			alumnosMap.put(alumno.getDni(), alumno);
		}
		
		System.out.println(alumnosMap.size());
		
		//Mostrar la información de todos los alumnos
		Collection<Alumno> alumnos = alumnosMap.values();
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
		buscaAlumno(alumnosMap);
		
		
		//Devolver la nota media de todos los alumnos
		double sumaNotas=0;
		for (Alumno alumno : alumnos) {
			sumaNotas += alumno.getNota();
		}
		System.out.println("La media de las notas de todos los alumnos "
				+ "es"+(sumaNotas/alumnos.size()));
		
	}
	
	public void buscaAlumno(Map<String,Alumno> alumnosMap) {
		//- A partir de un dni, mirar si esta el alumno en el mapa 
		//y si está devolver la información del alumno
		String dni = Utilidades.pideDatoTexto("Escribe dni a buscar");
		
		Alumno alumonoEncontrado = alumnosMap.get(dni);
		if (alumonoEncontrado!=null) {
			System.out.println(alumonoEncontrado);
		}else {
			System.out.println("No existe ningun alumno con DNI: "+dni);
		}
		
		
//		if (alumnosMap.containsKey(dni)) {
//			System.out.println(alumnosMap.get(dni));
//		}else {
//			System.out.println("No existe ningun alumno con DNI: "+dni);
//		}
	}
	
	public Alumno[] generaAlumnos() {
		Alumno alumno1 = new Alumno("111A","A1","Ape1",8);
		Alumno alumno2 = new Alumno("222B","B2","Ape2",6);
		Alumno alumno3 = new Alumno("333C","A3","Ape3",4);
		Alumno alumno4 = new Alumno("444D","A4","Ape4",6);
		
		//Alumno[] alumnos = {alumno1,alumno2,alumno3,alumno4};
		//return alumnos;
		
		return new Alumno[] {alumno1,alumno2,alumno3,alumno4};
	}
	

}
