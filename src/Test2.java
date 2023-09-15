
public class Test2 {

	public static void main(String[] args) {
		String[] result = solution("Cadena de texto");
		for (String string : result) {
			System.out.println(string);
		}
		

	}

	public static String[] solution(String s) {

		String[] str = s.split("");
		int cont = 1;
		String[] str2;

		if (str.length % 2 == 0) {
			str2 = new String[str.length / 2];
		} else {
			str2 = new String[(str.length / 2) + 1];
		}

		for (int i = 0; i < str2.length; i++) {
			String idx = s.substring(s.length() - 1);
			int tmp = s.indexOf(idx);

			if (tmp % 2 == 0 && i == str2.length - 1) {
				str2[i] = str[i + i] + "_";
			} else {
				str2[i] = str[i + i] + str[(i + i) + cont];
			}
		}
		return str2;
	}
}
