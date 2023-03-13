package it.polito.tdp.IndovinaNumero.model;

public class Gioco {
	
	private final int TMax = 8;
	private final int NMax = 100;
	private int NTentativiFatti;
	private int numeroSegreto;
	
	
	
	public int getTMax() {
		return TMax;
	}
	public int getNMax() {
		return NMax;
	}
	public int getNTentativiFatti() {
		return NTentativiFatti;
	}
	public int getNumeroSegreto() {
		return numeroSegreto;
	}
	
	public void iniziaGioco() {
		
		this.NTentativiFatti = 0;
    	this.numeroSegreto = (int)(Math.random()*this.NMax) + 1;
    	
	}
	/**
	 * funzione che esegue un tentativo del gioco 
	 * restituisce zero se abbiamo vinto 
	 * uno se abbiamo perso
	 * due se il numero è troppo alto
	 * tre se è troppo basso
	 */
	
	public int faiTentativo(int tentativo) {
		
		this.NTentativiFatti++;
		
		if (tentativo == this.numeroSegreto) {
    		return 0;
    	}
    	
    	if (this.NTentativiFatti == this.TMax) {
    		return 1;
    	}
    	
    	if(tentativo>this.numeroSegreto) {
    		return 2;    	
    	}else  {
    		return 3;
    	}
	}
	
}
