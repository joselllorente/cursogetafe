package es.curso.java.poo.ejercicios;

import java.util.Scanner;

public class AlumnosMain {

	public static void main(String[] args) {
		
//		Alumno alumno1 = new Alumno();
//		alumno1.setDni("A1");
//		alumno1.setNombre("A");
//		alumno1.setApellidos("A1");
//		alumno1.setNota(5);
		
		Alumno alumno2 = new Alumno("B2","B","Apellido2");
		alumno2.setNota(4);
		Alumno alumno3 = new Alumno("C3","C","Apellido3",9);
		
		//alumno1.estudiar();
		alumno2.estudiar();
		alumno3.estudiar();

		//Meto los objetos en un array
		Alumno [] alumnos = {alumno2,alumno3};
		
		//Creo objeto de la clase para llamar a metodo no estáticos
		AlumnosMain am = new AlumnosMain();
		am.pintarAprobados(alumnos);
		
	}
	
	public void pintarAprobados (Alumno [] alumnos) {
		System.out.println("Alumnos aprobados");
		for (Alumno alumno : alumnos) {
			if (alumno.getNota() >= 5) {
				System.out.println(alumno.getDni());
				System.out.println(alumno.getNombre());
				System.out.println(alumno.getApellidos());
				System.out.println(alumno.getNota());
				System.out.println("==========================");
			}
			
		}
		
		
	}
	
	

}

