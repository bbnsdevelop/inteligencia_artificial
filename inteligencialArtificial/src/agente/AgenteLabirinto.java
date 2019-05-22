package agente;

import ambiente.Labirinto;
import geral.PosicaoXY;

public class AgenteLabirinto {
	// movimentar para 4 direções (cima, baixo, esquerda, direita)
	// referencia do labirinto

	private Labirinto labirinto;
	private MovimentosAgenteLabirinto movimento;
	private PosicaoXY posiXY;
	
	private int pilhaMovimentos;

	public AgenteLabirinto(Labirinto labirinto) {
		this.labirinto = labirinto;
		this.labirinto.setAgente(this);
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
	
	public void movimentar() {
		if(this.pilhaMovimentos >= this.labirinto.getTamanho()) {
			return;
		}
		PosicaoXY proximoMovimento = retornarMovimento();
		
		String valor = this.labirinto.retornarValorPosicaoLabirinto(proximoMovimento);
		if(valor.equals("L") || valor.equals("A")) {
			this.proximoMovimento();
			movimentar();
			aumentarPilha();
		}else {
			this.labirinto.limpar();
			this.posiXY = proximoMovimento;
		}
	}

	private void aumentarPilha() {
		this.pilhaMovimentos ++;		
	}

	private void proximoMovimento() {
		switch(this.movimento) {
			case CIMA:
				this.movimento = MovimentosAgenteLabirinto.BAIXO;
				break;
			case BAIXO:
				this.movimento = MovimentosAgenteLabirinto.ESQUERDA;
				break;
			case ESQUERDA:
				this.movimento = MovimentosAgenteLabirinto.DIREITA;
				break;
			case DIREITA:
				this.movimento = MovimentosAgenteLabirinto.CIMA;
				break;
		}
	}

	public PosicaoXY getPosicao() {		
		return this.posiXY;
	}

}
