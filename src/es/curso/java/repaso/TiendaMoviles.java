package es.curso.java.repaso;

public class TiendaMoviles {

	public static void main(String[] args) {
		
		Movil m1 = new Movil();
		
		Movil m2 = new Movil(2);
//		m2.setMarca("M2");
		
		Movil m3 = new Movil(3,"M1","Mod1",300);

		Movil[] moviles = {m1,m2,m3,new Movil(5)};
		
		m2.setId(10);
		m1 = m2;
		System.out.println(moviles[0].getId());
		
		m1.llamar();
		m2.llamar();
//		System.out.println(m2.getMarca());
//		m3.llamar();
//		m4.llamar();
//		System.out.println(m4.getMarca());
//		
//		if(m4.isCincog()) {
//			System.out.println("Entra");
//			System.out.println(m4.isCincog());
//		}
		
		
		TestEnum.test1.getColor();
		TestEnum.test1.test();
		
				
		TestEnum.values();
	}

}
