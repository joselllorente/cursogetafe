import java.text.NumberFormat;

public class StringsEquals {
	public static void main(String[] args) {
		
		String nombre1 = "Jose Luis";
		String nombre2 = "Jose Luis";
		String nombre3 = new String("Jose Luis");
		String nombre4 = "jose luis";
		
		System.out.println(nombre1==nombre3);
		System.out.println(nombre1.equals(nombre3));
		System.out.println(nombre1.equals(nombre4));
		System.out.println(nombre1.equalsIgnoreCase(nombre4));
		
		
		
		
	}

}
