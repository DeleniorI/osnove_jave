package d25_08_2022;

public class Ispit {
	private String nazivPredmeta;
	private int ocena;
	private String imePrezimeProfe;

	public Ispit(String nazivPredmeta, int ocena, String imePrezimeProfe) {

		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.imePrezimeProfe = imePrezimeProfe;
	}
	
	

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}



	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}



	public int getOcena() {
		return ocena;
	}



	public void setOcena(int ocena) {
		this.ocena = ocena;
	}



	public String getImePrezimeProfe() {
		return imePrezimeProfe;
	}



	public void setImePrezimeProfe(String imePrezimeProfe) {
		this.imePrezimeProfe = imePrezimeProfe;
	}



	public boolean isPolozen() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printIspit() {
		
		System.out.println(this.nazivPredmeta + " - " + this.imePrezimeProfe + " - " + this.ocena);
	}

}
