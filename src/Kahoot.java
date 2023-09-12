
public class Kahoot {

	public static void main(String[] args) {
		
		int num = 20;
		num++;
		System.out.println(num++);

		
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(b || (a && Math.PI>3.1) );
		
		int resultado=10;
		for (int i = 4 ; i<5 ; i++) {
			resultado +=2;
			if (i%2==0) {
				continue;
			}
			if (i%3==0) {
				break;
			}
		}
		System.out.println(resultado);
	}

}
