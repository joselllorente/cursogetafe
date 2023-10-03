package es.curso.java.excepciones.ejercicios;

import java.util.Random;

public class Cafeteria {
	private String nombre;
	
	public Cafeteria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Cafeteria cafeteria = new Cafeteria("Cafeteria 1");
		cafeteria.abrirCafeteria();
	}

	private void abrirCafeteria() {
		Random rd = new Random();
		
		boolean clienteSatisfecho;
		
		do {
			clienteSatisfecho = true;
			double temperatura = rd.nextDouble(0, 100);
			System.out.println("Temperatura "+temperatura);
			CoffeCup tazaCafe = new CoffeCup(temperatura);
			ClienteCafeteria cliente1 = new ClienteCafeteria("Cliente1");
			try {
				cliente1.tomarTazaCafe(tazaCafe);
			} catch (TooHotTemperatureException e) {
				clienteSatisfecho = false;
				System.out.println("El cliente se ha quemado, quiere otro café");
				System.out.println(e.getMessage());
				continue;
			} catch (TooColdTemperatureException e) {
				clienteSatisfecho = false;
				System.out.println("El cliente se ha quejado el café estaba muy frio");
				continue;
			}catch (TemperatureException e) {
				clienteSatisfecho = false;
				System.out.println("El cliente se ha quejado el café estaba muy frio");
				continue;
			}finally {
				System.out.println("POR AQUI PASO SIEMPRE");
				
			}
			
			System.out.println("PASANDO");
		
		}while(!clienteSatisfecho);
		
		
	}
	
	
}
