package es.curso.java.introduccion.ejercicios.arrays;

import java.util.Scanner;

public class Colegio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el número de aulas del colegio");
		int numAulas = scan.nextInt();
		String [][] colegio = new String[numAulas][];
		
		for(int i=0;i<numAulas;i++) {
			scan = new Scanner(System.in);
			System.out.println("Introduce el número de alumnos del aula "+(i+1));
			int numAlumnos = scan.nextInt();
			colegio[i] = new String[numAlumnos];
		}
		
		//Insertamos los datos
		for (int i=0;i<colegio.length;i++) {
			System.out.println("Pidiendo los datos de los alumnos del aula "+(i+1));
			for(int j=0;j<colegio[i].length;j++) {
				scan = new Scanner(System.in);
				System.out.println("Introduce el nombre");
				String nombre = scan.nextLine();
				
				scan = new Scanner(System.in);
				System.out.println("Introduce el dni");
				String dni = scan.nextLine();
				
				scan = new Scanner(System.in);
				System.out.println("Introduce la nota");
				String nota = scan.nextLine();
				
				
				colegio[i][j]=nombre+":"+dni+":"+nota;
			}
		}
		
		for (int i=0;i<colegio.length;i++) {
			System.out.println("Aula: "+(i+1));
			for(int j=0;j<colegio[i].length;j++) {
				String datosAlumno = colegio[i][j];
				String [] datosAlumnosArray = datosAlumno.split(":");
				
				System.out.println("\t"+datosAlumnosArray[0]+ " " 
						+datosAlumnosArray[1]+ " "+ datosAlumnosArray[2]);
			}
		}

		System.out.println("============ Mostrando alumnos aprobados ============");
		for (int i=0;i<colegio.length;i++) {
			
			for(int j=0;j<colegio[i].length;j++) {
				String datosAlumno = colegio[i][j];
				String [] datosAlumnosArray = datosAlumno.split(":");
				int nota = Integer.parseInt(datosAlumnosArray[2]);
				if (nota>=5) {
					System.out.println("\t"+datosAlumnosArray[0]+ " " 
							+datosAlumnosArray[1]+ " "+ datosAlumnosArray[2]);
				}
			}
		}

	}

}
