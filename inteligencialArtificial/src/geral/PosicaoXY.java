package geral;

public class PosicaoXY {
	
	private int posiX;
	private int posiY;
	
	
	
	public PosicaoXY() {
		this.posiX = 0;
		this.posiY = 0;
	}
	public PosicaoXY(int posiX, int posiY) {
		this.posiX = posiX;
		this.posiY = posiY;
	}
	public int getPosiX() {
		return posiX;
	}
	public void setPosiX(int posiX) {
		this.posiX = posiX;
	}
	public int getPosiY() {
		return posiY;
	}
	public void setPosiY(int posiY) {
		this.posiY = posiY;
	}
	
}
