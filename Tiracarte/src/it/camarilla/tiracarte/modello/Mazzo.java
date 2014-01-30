package it.camarilla.tiracarte.modello;

import it.camarilla.tiracarte.Costanti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Mazzo {

	private String nome;
	private List<Carta> listaCarte = new ArrayList<Carta>();
	private Log logger = LogFactory.getLog(this.getClass());
	
	public Mazzo(int tipo) {
		popolaMazzo(tipo);
	}
	
	public void popolaMazzo(int tipo){
		switch (tipo) {
		case Costanti.ARCANI_MAGGIORI:
			
			// TODO popola mazzo 52 carte francesi
			break;
		
		case Costanti.ARCANI_MINORI:
			
			// TODO popola mazzo tarocchi
			break;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Carta getCarta(int n) {

		return listaCarte.get(n);
	}

	public int numeroCarte() {
		return listaCarte.size();
	}

	public void addCarta(Carta carta) {
		this.listaCarte.add(carta);
	}

	public void mischiaMazzo() {
		logger.info("Mischio il mazzo");
		Collections.shuffle(listaCarte);
	}

	public List<Carta> tiraNCarte(int n) {
		List<Carta> temp = new ArrayList<Carta>(); 
		for (int i = 0; i < n; i++) {
			Carta card = listaCarte.get(i);
			temp.add(card);
			listaCarte.remove(i);
		}
		return temp;
	}

	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append("Questo e' il Mazzo");
		build.append(this.nome);
		build.append("/n");
		for (Carta carta : listaCarte) {
			build.append("---------");
			build.append(carta.toString());
			build.append("/n");
		}
		return build.toString();
	}
}
