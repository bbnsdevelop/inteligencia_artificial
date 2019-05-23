package inteligencialArtificial_Buscas.principal;

import java.util.Stack;

import inteligencialArtificial_Buscas.buscas.BuscaEmProfundidade;
import inteligencialArtificial_Buscas.nos.No;

public class Buscas {
	
	public static void main(String args[]) {
		
		No noZero = new No(0);
		No no1 = new No(1);
		No no2 = new No(2);
		No no3 = new No(3);
		No no4 = new No(4);
		No no5 = new No(5);
		No no6 = new No(6);
		
		noZero.setNoEsquerda(no1);
		noZero.setNoDireita(no2);
		no1.setNoEsquerda(no3);
		no1.setNoDireita(no4);
		no2.setNoEsquerda(no5);
		no2.setNoDireita(no6);
		
		/*
		Queue<Integer> fila = new LinkedList<>();
		fila.add(1);
		fila.add(2);
		fila.add(3);
		
		Integer numero = fila.remove();*/
		/*
		Stack<Integer> pilha = new Stack<>();
		pilha.add(1);
		pilha.add(2);
		pilha.add(3);
		
		System.out.println(pilha.pop());*/
		
		BuscaEmProfundidade bep = new BuscaEmProfundidade(6);
		bep.buscar(noZero);
	}
}
