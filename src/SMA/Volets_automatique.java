package SMA;

public class Volets_automatique extends Agent {
	private int V;
	
	
	public  void ouverture(int VV) {
		this.setV(VV);
	}

	public  void fermer(int F) {
		this.setV(F);
	}
	
	
	
	public int getV() {
		return V;
	}


	public void setV(int v) {
		V = v;
	}

	
}
