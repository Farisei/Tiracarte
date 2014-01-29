package it.camarilla.tiracarte.modello;

import java.util.ArrayList;
import java.util.List;


public class Mazzo {
	
	private String nome;
	private List <Carta> listaCarte = new ArrayList<Carta>(); 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Carta getCarta(int n){
		
		return listaCarte.get(n);
	}
	

}
