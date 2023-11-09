package es.curso.java.colecciones.ejercicios.mapas.equipos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Liga {

	public static void main(String[] args) {
		Liga liga = new Liga();
		liga.iniciarLiga();

	}
	
	private void iniciarLiga() {
		Map<Equipo, List<Jugador>> equiposLigaEAS = new HashMap<Equipo,List<Jugador>>();
		
		Equipo equipo1 = new Equipo("Equipo1", 10, 10);
		Equipo equipo2 = new Equipo("Equipo2", 8, 0);
		
		Jugador jugador1 = new Jugador("Jugador1",22,"delantero");
		Jugador jugador2 = new Jugador("Jugador2",32,"delantero");
		Jugador jugador3 = new Jugador("Jugador3",18,"delantero");
		Jugador jugador4 = new Jugador("Jugador4",25,"delantero");
		Jugador jugador5 = new Jugador("Jugador5",26,"delantero");
		Jugador jugador6 = new Jugador("Jugador6",27,"portero");
		
		List<Jugador> jugadores1 = new ArrayList<Jugador>();
		jugadores1.add(jugador6);
		jugadores1.add(jugador2);
		jugadores1.add(jugador1);
		
		
		equiposLigaEAS.put(equipo1, jugadores1);
		equiposLigaEAS.put(equipo2, Arrays.asList(jugador3,jugador4,jugador5));
		
		
		equiposLigaEAS.get(equipo2).get(2).getEdad();
		
		
		
		
		Collection<List<Jugador>> todosJugadores = equiposLigaEAS.values();

		for (List<Jugador> listaJugadores : todosJugadores) {
			for (Jugador jugador : listaJugadores) {
				System.out.println(jugador.getNombre());
			}
		}
		
		System.out.println("============================");
		
		Set<Equipo> equipos = equiposLigaEAS.keySet();
		for (Equipo equipo : equipos) {
			System.out.println(equipo);
			List<Jugador> jugadores = equiposLigaEAS.get(equipo);
			for (Jugador jugador : jugadores) {
				System.out.println("\t"+jugador);
				//Si solo quiero sacar la informacion del portero
				if(jugador.getPosicion().equals("portero")) {
					System.out.println("Es portero");
				}
				
			}
		}
		
		System.out.println("============================");
		Set<Entry<Equipo,List<Jugador>>> entryequiposLigaEAS =	equiposLigaEAS.entrySet();
		for (Entry<Equipo, List<Jugador>> entry : entryequiposLigaEAS) {
			System.out.println(entry.getKey().getNombre());
			
		}
		
		
		
		
	}

}


