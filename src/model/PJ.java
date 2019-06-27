package model;

public class PJ extends Pessoa{
	private String razaoSocial;
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
public void setRazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial;
}
public void falar( ) {
	System.out.println("Falando - Pessoa Juidica");
}
}
