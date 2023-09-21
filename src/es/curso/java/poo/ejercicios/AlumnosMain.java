package es.curso.java.poo.ejercicios;

import java.util.Scanner;

public class AlumnosMain {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno();
		alumno1.dni ="A1";
		alumno1.nombre ="A";
		alumno1.apellidos ="A1";
		alumno1.nota = 5;
		
		Alumno alumno2 = new Alumno("B2","B","Apellido2");
		alumno2.nota = 4;
		
		Alumno alumno3 = new Alumno("C3","C","Apellido3",9);
		
		alumno1.estudiar();
		alumno2.estudiar();
		alumno3.estudiar();

		//Meto los objetos en un array
		Alumno [] alumnos = {alumno1,alumno2,alumno3};
		
		//Creo objeto de la clase para llamar a metodo no estáticos
		AlumnosMain am = new AlumnosMain();
		am.pintarAprobados(alumnos);
		
	}
	
	public void pintarAprobados (Alumno [] alumnos) {
		System.out.println("Alumnos aprobados");
		for (Alumno alumno : alumnos) {
			if (alumno.nota >= 5) {
				System.out.println(alumno.dni);
				System.out.println(alumno.nombre);
				System.out.println(alumno.apellidos);
				System.out.println(alumno.nota);
				System.out.println("==========================");
			}
			
		}
		
		
	}
	
	

}

