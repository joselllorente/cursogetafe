package es.curso.java.examen.modulo2.parte1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PrincipalParte1 {

	public static void main(String[] args) {
		
		PrincipalParte1 principal = new PrincipalParte1();
		principal.iniciarAcademia();
	}
	
	private void iniciarAcademia() {
		Master master1 = new Master("Master1",1,15,true);
		Master master2 = new Master("Master2",2,20,false);
		Master master3 = new Master("Master3",3,10,true);

		Map<Integer, Master> masters = new HashMap<>();
		masters.put(master1.getCodigo(), master1);
		masters.put(master2.getCodigo(), master2);
		masters.put(master3.getCodigo(), master3);

		masters.remove(2);
		
		Collection<Master> mastersMapa = masters.values();
		for (Master master : mastersMapa) {
			if (master.isOficial()) {
				System.out.println(master.getNombreCurso());
			}
		}
		
		mastersMapa.forEach(System.out::println);
		
		mastersMapa.forEach( 
					master -> {
						if (master.isOficial()) {
							System.out.println(master.getNombre()); 
						}
					});
		
		mastersMapa.stream().
			filter(master-> master.isOficial()).
			forEach(master -> System.out.println(master.getNombre()));
	}

}
