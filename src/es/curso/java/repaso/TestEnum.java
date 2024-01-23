package es.curso.java.repaso;

public enum TestEnum{
	
	test1("rojo",1),
	test2("azul",3),
	test3("verde",4);
	
	
	private String color;
	private int num;
	
	
	TestEnum(String color, int num){
		this.color=color;
		this.num=num;
	}
	
	public void test() {
		System.out.println("Llamando a metodo test");
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
}
