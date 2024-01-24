package es.curso.java.repaso.ejercicios.ejercicio1;

public class FerreteriaMain {

	public static void main(String[] args) {
		
		Tornillo tornillo1 = new Tornillo(1,"Gris",5,2,0.1);
		Tornillo tornillo2 = new Tornillo(2,"Gris",5,2,0.2);
		Tornillo tornillo3 = new Tornillo(3,"Gris",5,2,0.3);
		
		Tornillo [] tornillosFerreteria = {tornillo1,tornillo2,tornillo3};
		
		Ferreteria ferreteria1 = new Ferreteria(1,"N1","Dir1");
		ferreteria1.setTornillos(tornillosFerreteria);
		
		Ferreteria ferreteria2 = new Ferreteria(1,"N1","Dir1",tornillosFerreteria);
		
		System.out.println(ferreteria1.getTornillos());
		System.out.println(ferreteria2.getTornillos()[2].getPrecio());
		
		double precioTornillos=0;
		for(Tornillo tornillo : ferreteria1.getTornillos()) {
//			if(tornillo.getPrecio()>0.1) {
				precioTornillos += tornillo.getPrecio();
//			}
		}

		System.out.println(precioTornillos);
	}

}


