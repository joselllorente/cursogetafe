package es.curso.java.introduccion.ejercicios.bucles;

import java.util.Scanner;
/*
 * 1. Mostrar meses estacion --> Preguntar por la estación, los meses de esa estacion
2. Opcion2
3. Opcion3
4. Opcion4
5. Salir

Selecciona una opcion

 */
public class MenuEstacionReptitiendo {

	public static void main(String[] args) {
		int opcion=0;
		do {
		
			String menu = "1. Opcion1\n2. Opcion2\n3. Opcion3\n4. Opcion4\n5. Salir";
			System.out.println(menu);
			System.out.println("Selecciona una opcion");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch(opcion) {
				case 1: 
					System.out.println("Introduce la estación del año");
					scan = new Scanner(System.in);
					String estacion = scan.nextLine();
					String meses = "";
					switch(estacion.toLowerCase()) {
						case "verano": meses ="Julio, Agosto y Septiembre";break;
						case "otoño": meses ="Octubre, Noviembre y Diciembre";break;
						case "invierno": meses ="Enero, Febrero y Marzo";break;
						case "primavera": meses ="Abril, Mayo y Junio";break;
						//default: System.err.println("La estación introducida no es correcta");
					}
					
					if (!meses.equals("")) {
						System.out.println("Los meses de la estacion "+estacion+" son "+ meses);
					}else {
						System.err.println("La estación introducida no es correcta");
					}
					
					break;
				case 2:
				case 3:
				case 4: System.out.println("Has elegido la opcion "+opcion);break;
				case 5: System.out.println("Adios!!!");break;
				default: System.out.println("Opcion incorrecta");
			}
		}while(opcion!=5);
		
		

	}

}
