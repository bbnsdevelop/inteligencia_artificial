package ambiente;

public class Labirinto {
	private int tamanholabirinto;
	private String[][] labirinto;
	
	
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
	
}
