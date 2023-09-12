package es.curso.java.introduccion.ejercicios.strings;

import java.util.Scanner;

public class ValidarEmail {

	public static void main(String[] args) {
		String mensajeError="";
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduce un email");
			String email = scan.nextLine().trim();
			//email = email.trim();

			//boolean emailCorrecto=true;
			mensajeError="";
			if (email.indexOf("@")!=email.lastIndexOf("@") ||  
					email.indexOf("@")==-1){
				mensajeError="Debe tener una @";
				//emailCorrecto=false;
				
			}else {
				//asda.sdas@as.sd.as.d
				int posicionArroba = email.indexOf("@")+1;
				String dominio = email.substring(posicionArroba);
				if (!dominio.contains(".")) {
					mensajeError+=" El dominio debe contener al menos un punto";
				}else {
					if (dominio.indexOf(".")<2) {
						mensajeError+=" La distancia entre la arroba y el punto debe ser superior a 2 caracteres";
					}
					if (email.length()-(email.lastIndexOf(".")+1)<2 || email.length()-(email.lastIndexOf(".")+1)>6) {
						mensajeError+="El subdominio tiene que ser mayor o igual a 2 y menor o igual a 6";
					}
				}
				
				
			}
			
			if (email.contains(" ")) {
				//emailCorrecto=false;
				mensajeError+=" No puede tener espacios en blanco";
				
			}
			
			
			if (mensajeError.isEmpty()) {
				System.out.println("El email "+email+ " es correcto");
			}else {
				System.out.println("El email "+email+ " es incorrecto");
				System.out.println(mensajeError);
			}
		
		}while(!mensajeError.isEmpty());
	}

}
