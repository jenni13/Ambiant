package SMA;

public class CAPTEUR extends Agent{

		
	private String type;
	private int donnee;



	public CAPTEUR (String t, int d) {
		this.type = t;
		this.donnee = d;
		
	}

	public  void capter(int dd) {
		this.donnee= dd;
	}
	public int envoyer() {
		return this.donnee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDonnee() {
		return donnee;
	}

	public void setDonnee(int donnee) {
		this.donnee = donnee;
	}
	
	}


