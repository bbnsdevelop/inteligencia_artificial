package inteligencialArtificial_Buscas.buscas;

import java.util.Stack;

import inteligencialArtificial_Buscas.nos.No;

public class BuscaEmProfundidade {

	private Stack<No> pilhaNos;
	private int valorBusca;
		
	public BuscaEmProfundidade (int valorBusca) {
		this.valorBusca = valorBusca;
		this.pilhaNos = new Stack<>();
	}
	public boolean isResultadoBusca(No no) {
		return no.getValor() == this.valorBusca;
	}
	public void buscar(No no) {
		this.pilhaNos.add(no);
		if(isResultadoBusca(no)) {
			
		}else {
			if(no.getNoEsquerda() != null) {
				this.buscar(no.getNoEsquerda());
			}else if(no.getNoDireita() != null) {
				this.buscar(no.getNoDireita());
			}			
		}
		this.pilhaNos.pop();
	}
	
	public void exibirResultado(No no) {
		// aula 18
	}
}
