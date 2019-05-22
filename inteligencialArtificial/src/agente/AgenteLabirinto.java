package agente;

import ambiente.Labirinto;

public class AgenteLabirinto {
	
	private Labirinto labirinto;
	private MovimentosAgenteLabirinto movimento;

	// movimentar para 4 direções (cima, baixo, esquerda, direita)
	// referencia do labirinto
	
	public AgenteLabirinto(Labirinto labirinto) {
		this.labirinto = labirinto;
		this.movimento = MovimentosAgenteLabirinto.CIMA;
	}
	
}
