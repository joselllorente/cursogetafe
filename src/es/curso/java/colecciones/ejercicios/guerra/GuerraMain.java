package es.curso.java.colecciones.ejercicios.guerra;

import java.util.Arrays;
import java.util.List;

import es.curso.java.colecciones.ejercicios.guerra.exceptions.LimiteValoresException;
import es.curso.java.colecciones.ejercicios.guerra.exceptions.UnidadesPermitadasException;

public class GuerraMain {

	public static void main(String[] args) { 
		GuerraMain gm = new GuerraMain();
		gm.empezarGuerra();
	}
	
	/**
	 * Método para iniciar la batalla pasando un VehiculoGuerra
	 * @param vehiculo
	 */
	public void empezarGuerra (VehiculoGuerra vehiculoAjeno) {
		System.out.println("Empezando la guerra entre " +vehiculoAjeno.getNombre());
		VehiculoGuerra vehiculoMio = null;
		try {
			if (Math.random()>0.5)
				vehiculoMio = generaTanque();
			else {
				vehiculoMio = generaNave();
			}
			System.out.println(" y "+vehiculoMio.getNombre());
			batalla (vehiculoAjeno, vehiculoMio);
		} catch (LimiteValoresException | UnidadesPermitadasException e) {
			System.err.println("Ha habido una excepción "+e.getMessage());
			e.printStackTrace();
		}

	}
	
	
	private void empezarGuerra () {
		try {
			VehiculoGuerra nave = generaNave();
			VehiculoGuerra tanque = generaTanque();
			
			batalla (nave, tanque);
		} catch (LimiteValoresException | UnidadesPermitadasException e) {
			System.err.println();
			e.printStackTrace();
		}
	}
	
	public void batalla (List<VehiculoGuerra> vehiculos) {
		
		batalla(vehiculos.get(0),vehiculos.get(1));
		
	}
	
	private void batalla (VehiculoGuerra vehiculo1, VehiculoGuerra vehiculo2) {
		System.out.println("Empieza la batalla");
		do {
			
			//Ataca vehiculo1
			int ataque = vehiculo1.atacar();
			int puntosVidaARestar = vehiculo2.defender(ataque);
			vehiculo2.setPuntosVida(vehiculo2.getPuntosVida()-puntosVidaARestar);
			System.out.println("Ataca "+vehiculo1.getNombre() + 
					" con " + ataque + " y la defensa de" + vehiculo2.getNombre() +
					" es de " + puntosVidaARestar + "[" + vehiculo1.getPuntosVida() 
					+ ","+ vehiculo2.getPuntosVida() + "]");
			
			if (vehiculo2.tieneVidas()) {
				ataque = vehiculo2.atacar();
				puntosVidaARestar = vehiculo1.defender(ataque);
				vehiculo1.setPuntosVida(vehiculo1.getPuntosVida()-puntosVidaARestar);
				System.out.println("Ataca "+vehiculo2.getNombre() + 
						" con " + ataque + " y la defensa de" + vehiculo1.getNombre() +
						" es de " + puntosVidaARestar + "[" + vehiculo2.getPuntosVida() 
						+ ","+ vehiculo1.getPuntosVida() + "]");
			}
			
		}while (vehiculo1.tieneVidas() && vehiculo2.tieneVidas());
		
		
		if (vehiculo1.tieneVidas()) {
			System.out.println("Ha ganado"+vehiculo1.getNombre());
		}else {
			System.out.println("Ha ganado"+vehiculo2.getNombre());
		}
		
		System.out.println("Batalla finalizada");
	}
	
//	private void empezarGuerra () {
//		try {
//			VehiculoGuerra nave = generaNave();
//			Batalla.nuevoVehiculo(nave);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	private VehiculoGuerra generaNave() throws LimiteValoresException, UnidadesPermitadasException {
		Nave nave = new Nave ("U.S.S. Enterprise",10,0);
		
		for(Guerrero guerrero : generaGuerreros () ) {
			nave.embarcarGuerro(guerrero);
		}

		return nave;
	}
	
	private VehiculoGuerra generaTanque() throws LimiteValoresException, UnidadesPermitadasException {
		Tanque tanque = new Tanque ("Aligator",3,7);
		
		for(Guerrero guerrero : generaGuerreros () ) {
			tanque.embarcarGuerro(guerrero);
		}
		
		return tanque;
	}
	
	
	private List<Guerrero> generaGuerreros ()   {
		List<Guerrero> guerreros = null;
		try {
			Guerrero guerrero1 = new Guerrero("G1","T1",10,0);
			Guerrero guerrero2 = new Guerrero("G2","T1",10,0);
			Guerrero guerrero3 = new Guerrero("G3","T1",10,0);
			Guerrero guerrero4 = new Guerrero("G4","T1",10,0);
			Guerrero guerrero5 = new Guerrero("G5","T1",10,0);
			Guerrero guerrero6 = new Guerrero("G6","T1",10,0);
			Guerrero guerrero7 = new Guerrero("G7","T1",10,0);
			Guerrero guerrero8 = new Guerrero("G8","T1",10,0);
			Guerrero guerrero9 = new Guerrero("G9","T1",10,0);
			Guerrero guerrero10 = new Guerrero("G10","T1",10,0); 
			Guerrero guerrero11 = new Guerrero("G10","T1",10,0);
			
			guerreros = Arrays.asList(guerrero1,guerrero2,guerrero3,
					guerrero4,guerrero5,guerrero6,guerrero7,
					guerrero8,guerrero9,guerrero10);
			//guerreros.add(guerrero1);
		}catch (LimiteValoresException lve) {
			System.err.println("Error generando guerreros " + lve.getMessage());
			lve.printStackTrace();
		}
		return guerreros;
	}

}
