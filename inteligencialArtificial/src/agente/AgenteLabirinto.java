package agente;

import ambiente.Labirinto;
import geral.PosicaoXY;

public class AgenteLabirinto {
	// movimentar para 4 direções (cima, baixo, esquerda, direita)
	// referencia do labirinto

	private Labirinto labirinto;
	private MovimentosAgenteLabirinto movimento;
	private PosicaoXY posiXY;

	public AgenteLabirinto(Labirinto labirinto) {
		this.labirinto = labirinto;
		this.posiXY = new PosicaoXY();
		this.movimento = MovimentosAgenteLabirinto.CIMA;
	}

	public PosicaoXY retornarMovimento() {
		int retornoPosX = this.posiXY.getPosiX();
		int retornoPosY = this.posiXY.getPosiY();
		switch (movimento) {
		case CIMA:
			if (retornoPosX > 0) {
				retornoPosX -= 1;
			}
			break;
		case BAIXO:
			if (retornoPosX < this.labirinto.getTamanho() - 1) {
				retornoPosX += 1;
			}
			break;
		case ESQUERDA:
			if (retornoPosY > 0) {
				retornoPosY -= 1;
			}
			break;
		case DIREITA:
			if (retornoPosY < this.labirinto.getTamanho() - 1) {
				retornoPosY += 1;
			}
			break;
		}
		return new PosicaoXY(retornoPosX, retornoPosY);
	}

}
