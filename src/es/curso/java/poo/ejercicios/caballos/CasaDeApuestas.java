package es.curso.java.poo.ejercicios.caballos;

public class CasaDeApuestas {

	public static void main(String[] args) {
		Caballo caballo1=new Caballo(1,"Caballo1",1,6,40,200,true);
		Caballo caballo2=new Caballo(2,"Caballo2",2,6,40,200,true);
		
		Caballo[] caballos1= {caballo1,caballo2};

		Carrera carrera1=new Carrera(1,"getafe ",1000,caballos1);
		Carrera carrera2=new Carrera(2,"getafe2 ",2000,caballos1);
		Carrera carrera3=new Carrera(3,"getafe3 ",2000,caballos1);
		Carrera [] carreras = {carrera1,carrera2};
		
		GranPremio gp = new GranPremio(1,"Gran Prix Getafe",carreras);
//		//Creo los apostantes
//		Apostante apostante1 = new Apostante(0,"Apostante1",1000);
//		Apostante apostante2 = new Apostante(1,"Apostante2",1000);

		gp.empezarGranPremio();

	}

}
