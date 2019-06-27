package view;

import model.Pessoa;
import model.PFis;
import model.PJ;


public class Execucao {
	public static void main(String args[]) {
		PFis pf = new PFis();
		PJ pj = new PJ();
		
		pf.setNome("Hilton Castro");
		System.out.println(pf.getNome());
		pf.falar();
		
		pj.setRazaoSocial("ETEC Zona Leste");
		System.out.println(pj.getRazaoSocial());
		pj.falar();
	}
}
