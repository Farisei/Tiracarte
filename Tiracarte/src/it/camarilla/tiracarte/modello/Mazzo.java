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
	
	public int numeroCarte(){
		return listaCarte.size();
	}
	
	public void addCarta (Carta carta){
		this.listaCarte.add(carta);
	}
	
	public String toString(){
		
		StringBuilder build = new StringBuilder();
		build.append("Questo è il Mazzo");
		
		build.append(this.nome);
		build.append("/n");
		
		for(Carta carta:listaCarte){
			build.append("---------");
			build.append(carta.toString());
			build.append("/n");
			
		}
		
		return build.toString();
	}
}
