package es.curso.java.poo.ejercicios.maniqui;

public class EscaparateProfe {

	public static void main(String[] args) {
		Boton boton1 = new Boton(1,"cuadrado",10,"negro");
		Boton boton2 = new Boton(2,"cuadrado",10,"negro");
		Boton boton3 = new Boton(3,"redondo",15,"negro");

		Boton[] botonesCamisa = {boton1,boton2};
		
		
		Pantalon pantalon1 = new Pantalon(1,29,"negro",29, boton3);
		Vestido vestido1=new Vestido(1,29,"rojo",26.52);
		Camisa camisa1=new Camisa(1,25.5,"blanco",25,botonesCamisa);
		
		ManiquiProfe maniqui1 = new ManiquiProfe(0);
		maniqui1.vestir(pantalon1,camisa1);
		
		ManiquiProfe maniqui2 = new ManiquiProfe(1,vestido1);
		
		//System.out.println(maniqui1.getCamisa().getBotones()[0].getColor());
		
		EscaparateProfe escaparate = new EscaparateProfe();
		escaparate.mostrarEscaparate(maniqui1, maniqui2);
	}
	
	public void mostrarEscaparate (ManiquiProfe...maniquis) {
		for (ManiquiProfe maniquiProfe : maniquis) {
			
		}
	}

}
