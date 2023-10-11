package es.curso.java.poo.ejercicios.interfaces;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.main();
		
	}
	
	private void main() {
		Motorcycle moto = new Motorcycle(1,"","",true,2);
		Car car = new Car(1,"","",false,4);	
		Movil movil = new Movil(0, 0, null, false, null);
		Television tele = new Television(0, 0, null, false, 0);
		Toy juguete = new Toy("Consola");
		
		//TurnOnSystem tos = Utils.devuelveObjeto();
		//tos.turnOn();
		//System.out.println(tos.getClass().getName());
		encenderCosas(moto);
		encenderCosas(car);
		encenderCosas(movil);
		encenderCosas(tele);
		encenderCosas(juguete);
		
		TurnOnSystem[] aparatos = {moto,car,movil,tele};

		encenderCosas(aparatos);
	}
	
	private void encenderCosas (TurnOnSystem... aparatos) {
		for (TurnOnSystem aparato : aparatos) {
			encenderCosas(aparato);
			//aparato.turnOn();
			
		}
		
	}
	
	private void encenderCosas (TurnOnSystem aparato) {
		aparato.turnOn();
		System.out.println("Termina");
	}

}

