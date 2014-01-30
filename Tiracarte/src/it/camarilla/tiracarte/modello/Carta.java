package it.camarilla.tiracarte.modello;

public class Carta {

	private int numero;
	private String seme;
	
	public String getSeme() {
		return seme;
	}
	public void setSeme(String seme) {
		this.seme = seme;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return numero+"_"+seme;
	}

	public String toString(){
		return "La Carta e' "+this.getNome();
	}
}
