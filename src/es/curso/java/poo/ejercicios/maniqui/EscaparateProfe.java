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
		
		ManiquiProfe [] maniquis = {maniqui1, maniqui2};
		escaparate.mostrarPrecionManiquis(maniquis);
	}
	
	public void mostrarEscaparate (ManiquiProfe...maniquis) {
		for (ManiquiProfe maniquiProfe : maniquis) {
			
			System.out.println(maniquiProfe.getId());
			if (maniquiProfe.getCamisa() != null) {
				System.out.println("Datos de la camisa");
				System.out.println(maniquiProfe.getCamisa().getColor());
				System.out.println(maniquiProfe.getCamisa().getTalla());
				System.out.println(maniquiProfe.getCamisa().getPrecio());
				
				Boton [] arrayBotones = maniquiProfe.getCamisa().getBotones();
				for (Boton boton : arrayBotones) {
					System.out.println(boton.getColor());
					System.out.println(boton.getForma());
				}
				
			}
			
			
			if (maniquiProfe.getPantalon() != null) {
				System.out.println("Datos del pantalon");
				System.out.println(maniquiProfe.getPantalon().getColor());
				System.out.println(maniquiProfe.getPantalon().getTalla());
				System.out.println(maniquiProfe.getPantalon().getPrecio());
				
				Boton botonPantalon = maniquiProfe.getPantalon().getBoton();
				System.out.println(botonPantalon.getColor());
				System.out.println(botonPantalon.getForma());
			}
			
			if (maniquiProfe.getVestido() != null) {
				System.out.println("Datos del vestido");
				System.out.println(maniquiProfe.getVestido().getColor());
				System.out.println(maniquiProfe.getVestido().getTalla());
				System.out.println(maniquiProfe.getVestido().getPrecio());

			}
			
			
		}
	}

	public void mostrarPrecionManiquis (ManiquiProfe [] maniquis) {
		double precioTotal = 0;
		for (ManiquiProfe  maniquiProfe: maniquis) {
			precioTotal = 0;
			if (maniquiProfe.getVestido() != null) {
				double precioVestido = maniquiProfe.getVestido().getPrecio();
				precioTotal += precioVestido;
			}
			if (maniquiProfe.getPantalon() != null) {
				precioTotal += maniquiProfe.getPantalon().getPrecio();
			}
			if (maniquiProfe.getCamisa() != null) {
				precioTotal += maniquiProfe.getCamisa().getPrecio();
			}
			System.out.println("El precio total es de "+precioTotal);
		}
		
		
	}
		
}
