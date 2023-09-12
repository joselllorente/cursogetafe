package es.curso.java.introduccion.ejercicios.arrays;

import java.util.Scanner;

public class ColegioMenu {

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
		
//		String [][] colegio = new String[2][];
//		colegio[0]= new String[1];
//		colegio[1]= new String[2];
		

		//String [][] colegio = {  {"A:A1:1"}  , {"B:B2:2","C:C3:6"}  };
		//String [][] colegio2 = {  {"A:A1:1"}  , {"B:B2:2",null}  };
		
		
		int opcion = 0;
		do {
			System.out.println("1. Insertar Alumno.");
			System.out.println("2. Mostrar Alumnos por Aula");
			System.out.println("3. Mostrar todos los alumnos aprobado del colegio");
			System.out.println("4. Buscar Alumno");
			System.out.println("5. Borrar Alumno");
			System.out.println("6. Salir");
			
			scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch (opcion) {
				case 1: //Insertar alumnos
					//Pedimos el aula donde se va a insertar el alumno
					System.out.println("En qué aula quieres insertarlo? 1-"+colegio.length);
					scan = new Scanner(System.in);
					
					int numAula = scan.nextInt();
					String[] aula = colegio[numAula-1];
					
					boolean claseLlena = true;
					for (int i = 0; i < aula.length; i++) {
						if (aula[i]==null) {
							System.out.println("Posición "+(i+1)+ " libre");
							claseLlena=false;
							scan = new Scanner(System.in);
							System.out.println("Introduce el nombre");
							String nombre = scan.nextLine();
							
							scan = new Scanner(System.in);
							System.out.println("Introduce el dni");
							String dni = scan.nextLine();
							
							scan = new Scanner(System.in);
							System.out.println("Introduce la nota");
							String nota = scan.nextLine();
							
							aula[i]=nombre+":"+dni+":"+nota;
							//colegio[numAula-1][i]=nombre+":"+dni+":"+nota;
							break;
						}
					}
					if (claseLlena) {
						System.out.println("El aula está llena");
					}
					
					break;
				case 2: //Mostrar Alumnos
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
					
					
					break;
				case 3: //Mostrar aprobados
					
					System.out.println("============ Mostrando alumnos aprobados ============");
//					for (int i=0;i<colegio.length;i++) {
//						for(int j=0;j<colegio[i].length;j++) {
//							String datosAlumno = colegio[i][j];
//							if (datosAlumno!=null) {
//								String [] datosAlumnosArray = datosAlumno.split(":");
//								int nota = Integer.parseInt(datosAlumnosArray[2]);
//								if (nota>=5) {
//									System.out.println("\t"+datosAlumnosArray[0]+ " " 
//											+datosAlumnosArray[1]+ " "+ 
//											datosAlumnosArray[2]);
//								}
//							}
//						}
//					}
					
					
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
					
					
					break;
				case 4: //Buscar por dni
					System.out.println("Introduce el dni del alumno a buscar");
					scan = new Scanner(System.in);
					String dni = scan.nextLine();
					
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
					
					
					break;
				case 5: //Borrar a partir de un dni
					
					System.out.println("Introduce el dni del alumno a borrar");
					scan = new Scanner(System.in);
					dni = scan.nextLine();
					
					alumnoEncontrado = false;
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
					
					
					break;
				case 6: //Salir
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opción incorrecta");
			
			}
			
			
			
		}while(opcion!=6);
	
	}

}
