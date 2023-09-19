package es.curso.java.introduccion.ejercicios.funciones;

import java.util.Scanner;

import es.curso.java.utils.Utilidades;

public class ColegioMenuFunciones {
	
	final static String OPCIONES_MENU = "1. Insertar Alumno.:"
			+ "2. Mostrar Alumnos por Aula:"
			+ "3. Mostrar todos los alumnos aprobado del colegio:"
			+ "4. Buscar Alumno:"
			+ "5. Borrar Alumno:"
			+ "6. Salir";
	
	final static String [] OPCIONES_MENU_ARRAY = {"1. Insertar Alumno.","2. Mostrar Alumnos por Aula",
			"3. Mostrar todos los alumnos aprobado del colegio", "4. Buscar Alumno"
			, "5. Borrar Alumno"
			, "6. Salir"} ;

	public static void main(String[] args) {
		
		int numAulas = Utilidades.pideDatoNumerico("Introduce el número de aulas del colegio");
		String [][] colegio = new String[numAulas][];
		dimensionarColegio(colegio);
//		for(int i=0;i<numAulas;i++) {
//			int numAlumnos = Utilidades.pideDatoNumerico("Introduce el número de alumnos del aula "+(i+1));
//			colegio[i] = new String[numAlumnos];
//		}

		int opcion = 0;
		do {
			opcion = Utilidades.pintarMenu(OPCIONES_MENU,"Introduce valor (1-6)",":");
			
			switch (opcion) {
				case 1: insertarAlumno(colegio); break;
				case 2: mostrarAlumnos(colegio); break;
				case 3: mostrarAlumnosAprobados(colegio); break;
				case 4: buscarPorDni(colegio); break;
				case 5: borrarAlumno(colegio); break;
				case 6: //Salir
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opción incorrecta");
			
			}
			
		}while(opcion!=6);
	
	}

	
	public static void dimensionarColegio (String cole[][]){
		for(int i=0;i<cole.length;i++) {
			int numAlumnos = Utilidades.pideDatoNumerico("Introduce el número de alumnos del aula "+(i+1));
			cole[i] = new String[numAlumnos];
		}
	}
	
	public static void insertarAlumno(String [][] cole) {
		int numAula = Utilidades.pideDatoNumerico("En qué aula quieres insertarlo? 1-"+cole.length);
		String[] aula = cole[numAula-1];
		
		boolean claseLlena = true;
		for (int i = 0; i < aula.length; i++) {
			if (aula[i]==null) {
				System.out.println("Posición "+(i+1)+ " libre");
				claseLlena=false;
				
				String nombre = Utilidades.pideDatoTexto("Introduce el nombre");
				String dni = Utilidades.pideDatoTexto("Introduce el dni");
				String nota = Utilidades.pideDatoTexto("Introduce la nota");
				
				aula[i]=nombre+":"+dni+":"+nota;
				break;
			}
		}
		if (claseLlena) {
			System.out.println("El aula está llena");
		}
	}
	
	public static void mostrarAlumnos (String [][] colegio) {
		//Mostrar Alumnos
		for (int i=0;i<colegio.length;i++) {
			System.out.println("Aula: "+(i+1));
			for(int j=0;j<colegio[i].length;j++) {
				String datosAlumno = colegio[i][j];
				if (datosAlumno!=null) {
					String [] datosAlumnosArray = datosAlumno.split(":");
					System.out.println("\t"+datosAlumnosArray[0]+ " " 
						+datosAlumnosArray[1]+ " "+ datosAlumnosArray[2]);
				}
			}
		}
	}
	
	public static void mostrarAlumnosAprobados (String [][] colegio) {
		//Mostrar aprobados
		
		System.out.println("============ Mostrando alumnos aprobados ============");
//		for (int i=0;i<colegio.length;i++) {
//			for(int j=0;j<colegio[i].length;j++) {
//				String datosAlumno = colegio[i][j];
//				if (datosAlumno!=null) {
//					String [] datosAlumnosArray = datosAlumno.split(":");
//					int nota = Integer.parseInt(datosAlumnosArray[2]);
//					if (nota>=5) {
//						System.out.println("\t"+datosAlumnosArray[0]+ " " 
//								+datosAlumnosArray[1]+ " "+ 
//								datosAlumnosArray[2]);
//					}
//				}
//			}
//		}
		
		
		for (String [] aulaFE : colegio) {
			for ( String datosAlumno : aulaFE ) {
				if (datosAlumno!=null) {
					String [] datosAlumnosArray = datosAlumno.split(":");
					int nota = Integer.parseInt(datosAlumnosArray[2]);
					if (nota>=5) {
						System.out.println("\t"+datosAlumnosArray[0]+ " " 
								+datosAlumnosArray[1]+ " "+ 
								datosAlumnosArray[2]);
					}
				}
			}
		}
	}
	
	public static void buscarPorDni (String [][] colegio) {
		//Buscar por dni
		String dni = Utilidades.pideDatoTexto("Introduce el dni del alumno a buscar");
		
		boolean alumnoEncontrado = false;
		for (int i=0;i<colegio.length && !alumnoEncontrado ;i++) {
			for(int j=0;j<colegio[i].length && !alumnoEncontrado  ;j++) {
				String datosAlumno = colegio[i][j];
				//Me aseguro de que haya información en esa posición
				if (datosAlumno!=null) {
					String dniAlumno = datosAlumno.split(":")[1];
					if (dni.equalsIgnoreCase(dniAlumno)) {
						System.out.println("El alumnos está en el aula "+(i+1));
						alumnoEncontrado=true;
						//Cuando hemos encontrado para que no sigan los bucles
						//Ponemos i y j en sus valores máximos
//								i=colegio.length;
//								j=colegio[i].length;
					}
				}
				
			}
			
		}
		if (!alumnoEncontrado) {
			System.out.println("El alumno con dni "+dni+" no está en el colegio");
		}
	}
	
	public static void borrarAlumno(String [][] colegio) {
		//Borrar a partir de un dni
		String dni = Utilidades.pideDatoTexto("Introduce el dni del alumno a borrar");
		
		boolean alumnoEncontrado = false;
		for (int i=0;i<colegio.length && !alumnoEncontrado ;i++) {
			for(int j=0;j<colegio[i].length && !alumnoEncontrado  ;j++) {
				String datosAlumno = colegio[i][j];
				//Me aseguro de que haya información en esa posición
				if (datosAlumno!=null) {
					String dniAlumno = datosAlumno.split(":")[1];
					if (dni.equalsIgnoreCase(dniAlumno)) {
						colegio[i][j]=null;
						alumnoEncontrado=true;
						System.out.println("Alumno borrado");
					}
				}
				
			}
			
		}
		if (!alumnoEncontrado) {
			System.out.println("El alumno con dni "+dni+" no está en el colegio");
		}
		
	}
}

