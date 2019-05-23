package principal;

import agente.AgenteLabirinto;
import ambiente.Labirinto;
import geral.PosicaoXY;

public class InteligenciaArtificial {

	public static void main(String[] args) {
		
		Labirinto labirinto = new Labirinto(6);
		labirinto.exibirLabirinto();
		AgenteLabirinto agente = new AgenteLabirinto(labirinto);
		agente.setPosicao(new PosicaoXY(0,0));
		while (agente.isAindaLimpando()) {
			agente.zerarPilha();
			agente.movimentar();
			labirinto.exibirLabirinto();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		return;
	}

}
