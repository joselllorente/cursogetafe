package es.curso.java.poo.ejercicios.maniqui;

public class ManiquiProfe {
	private long id;
	private Vestido vestido;
	private Camisa camisa;
	private Pantalon pantalon;

	
	//Constructores
	public ManiquiProfe(long id) {
		this.id = id;
	}

	public ManiquiProfe(long id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}

	public ManiquiProfe(long id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}

	
	//Métodos get y set
	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public long getId() {
		return id;
	}

	//Métodos
	public void desvestir() {
		this.camisa = null;
		this.vestido = null;
		this.pantalon = null;
	}
	
	
	public void vestir(Pantalon pantalon, Camisa camisa) {
		desvestir();
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
	
	public void vestir(Vestido vestido) {
		desvestir();
		this.vestido = vestido;
	}
}
