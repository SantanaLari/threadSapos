package controller;

import java.util.Random;

public class threadCorridaDeSapos extends Thread {

	Random puloAleatorio = new Random();
	
	private int distanciaCorrida = 10;
	
	public threadCorridaDeSapos() {
		super();
	}
	
	public void run() {
		primeiroSapo();
		segundoSapo();
		terceiroSapo();
		quartoSapo();
		quintoSapo();
	}
	
	public void primeiroSapo() {
		String nome = "Sapo1";
		movimentacaoDosSapos(nome);
		
	}
	
	public void segundoSapo() {
		String nome = "Sapo2";
		movimentacaoDosSapos(nome);
		
	}
	
	public void terceiroSapo() {
		String nome = "Sapo3";
		movimentacaoDosSapos(nome);
	
	}
	
	public void quartoSapo() {
		String nome = "Sapo4";
		movimentacaoDosSapos(nome);
	
	}
	
	public void quintoSapo() {
		String nome = "Sapo5";
		movimentacaoDosSapos(nome);
		
	}
	
	public void movimentacaoDosSapos(String x) {
		int percursoSapo = 0;
		
		do {
			int tamanhoDoPulo = puloAleatorio.nextInt(3); //0 a 2 metros
			percursoSapo  += tamanhoDoPulo;
			
			if(percursoSapo < distanciaCorrida) {
				System.out.println("O " + x + " deu um pulo de " + tamanhoDoPulo + " metros e percorreu " + percursoSapo + " metros.");
			}else {
				System.out.println("O " + x + " deu um pulo de " + tamanhoDoPulo + " metros e percorreu finalizou a corrida");
			}
			
			
		}while(distanciaCorrida > percursoSapo);
		
		
	}

	
}
