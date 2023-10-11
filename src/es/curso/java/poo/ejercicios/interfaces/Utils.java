package es.curso.java.poo.ejercicios.interfaces;

public class Utils {
	
	public static TurnOnSystem devuelveObjeto() {
		TurnOnSystem tos=null;
		
		double result = Math.random();

		if(result>0.5) {
			tos = new Movil(1,100,"",true,"Android");
		}else {
			tos = new Car(1,"","",false,4);	
		}
		
		return tos;
	}

}
