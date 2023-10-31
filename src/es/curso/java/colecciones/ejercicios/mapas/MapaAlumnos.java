package es.curso.java.colecciones.ejercicios.mapas;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.curso.java.poo.ejercicios.Alumno;
import es.curso.java.utils.Utilidades;

public class MapaAlumnos {

	public static void main(String[] args) {
		MapaAlumnos ma = new MapaAlumnos();
		//ma.inicioEjercicio1();
		ma.inicioEjercicio2();

	}
	
	public void inicioEjercicio2 () {
		Map< String , List<Alumno> > mapaColegios = new HashMap< String , List<Alumno> >(); 
		
		Alumno[] alumnos = generaAlumnos();
		
		List<Alumno> alumnosCole1 = Arrays.asList(alumnos[0],alumnos[1]);
		List<Alumno> alumnosCole2 = Arrays.asList(alumnos[2],alumnos[3]);
		
		mapaColegios.put("colegio1", alumnosCole1);
		mapaColegios.put("colegio2", alumnosCole2);
		
		//Primera manera de mostrar colegio y sus alumnos
//		Set<String> colegios = mapaColegios.keySet();
//		for (String colegio : colegios) {
//			System.out.println("Colegio: "+colegio);
//			List<Alumno> alumnosCole = mapaColegios.get(colegio);
//			for (Alumno alumno : alumnosCole) {
//				System.out.println("\t"+alumno);
//			}
//		}
		
		//Segunda manera de mostrar colegio y sus alumnos
		Set<Entry <String,List<Alumno>>> colegioEntry = mapaColegios.entrySet();
		for (Entry<String, List<Alumno>> entry : colegioEntry) {
			System.out.println("Colegio "+ entry.getKey() );
			List<Alumno> alumnosCole = entry.getValue();
			for (Alumno alumno : alumnosCole) {
				System.out.println("\t"+alumno);
			}
		}
		
		
		//Solicitar DNI y hay que indicar en que colegio se encuentra ese alumno  
		String dni = Utilidades.pideDatoTexto("Escribe dni a buscar");
		Set<String> colegios = mapaColegios.keySet();
		boolean alumnoEncontrado=false;
		for (String colegio : colegios) {
			System.out.println("Buscando en colegio "+ colegio);
			List<Alumno> alumnosCole = mapaColegios.get(colegio);
			for (Alumno alumno : alumnosCole) {
				if(dni.equals(alumno.getDni())) {
					System.out.println("El alumno está en el colegio "+ colegio);
					alumnoEncontrado=true;
					break;
				}
			}
			if(alumnoEncontrado)
				break;
		}
		
		
		
	}
	
	public void inicioEjercicio1 () {
		
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
