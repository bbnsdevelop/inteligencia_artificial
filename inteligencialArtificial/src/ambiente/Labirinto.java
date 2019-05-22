package ambiente;

import agente.AgenteLabirinto;
import geral.PosicaoXY;

public class Labirinto {
	private int tamanholabirinto;
	private String[][] labirinto;
	private AgenteLabirinto agente;
	
	
	/* valores
	 * S - sujo
	 * L - limpo
	 * A - agente
	 */
	
	public Labirinto(int tamanholabirinto) {
		this.tamanholabirinto = tamanholabirinto;
		this.construirlabirinto();
	}
	
	
	private void construirlabirinto() {
		this.labirinto = new String[this.tamanholabirinto][this.tamanholabirinto];
		for (int i = 0; i < this.tamanholabirinto; i++) {
			for (int j = 0; j < this.tamanholabirinto; j++) {
				this.labirinto[i][j] = "S";				
			}			
		}		
	}

	public void exibirLabirinto() {
		for (int i = 0; i < this.tamanholabirinto; i++) {
			for (int j = 0; j < this.tamanholabirinto; j++) {
				System.out.print("| " +this.labirinto[i][j]+ " |");				
			}
			System.out.println("");
		}		
	}


	public int getTamanho() {		
		return this.tamanholabirinto;
	}


	public String retornarValorPosicaoLabirinto(PosicaoXY posicao) {		
		return this.labirinto[posicao.getPosiX()][posicao.getPosiY()];
	}


	public void setAgente(AgenteLabirinto agente) {
		this.agente = agente;
		
	}


	public void limpar() {		
		PosicaoXY posicao = this.agente.getPosicao();
		this.labirinto[posicao.getPosiX()][posicao.getPosiY()] = "L";
	}
	
}
