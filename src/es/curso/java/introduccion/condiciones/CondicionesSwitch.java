package es.curso.java.introduccion.condiciones;

public class CondicionesSwitch {

	public static void main(String[] args) {
		String color = "azul";
		
		switch (color) {
			case "azul" : System.out.println("El color es azul");
			case "amarillo" : System.out.println("El color es amarillo");break;
			default: System.out.println("Otro color");
		}
		
		
		String mes = "MARZO";
		String estacion="";
		
		switch (mes.toLowerCase()) {
			case "enero":
			case "febrero":
			case "marzo":
				estacion="invierno"; 
				System.out.println("Invierno");
				break;
			case "abril":
			case "mayo":
			case "junio":System.out.println("Primavera");break;
			case "julio":
			case "agosto":
			case "septiembre":System.out.println("Verano");break;
			case "octubre":
			case "noviembre":
			case "diciembre":System.out.println("Otoño");break;
			default: System.out.println("Mes incorrecto");
		}
		

	}

}

