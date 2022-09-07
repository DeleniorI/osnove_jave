package d06_09_2022;

public class Planina {
	private String imePlanine;
	private String nazivDrzave;
	private double visina;

	public Planina(String imePlanine, String nazivDrzave, double visina) {

		this.imePlanine = imePlanine;
		this.nazivDrzave = nazivDrzave;
		this.visina = visina;
	}

	public String getImePlanine() {
		return imePlanine;
	}

	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}

	public String getNazivDrzave() {
		return nazivDrzave;
	}

	public void setNazivDrzave(String nazivDrzave) {
		this.nazivDrzave = nazivDrzave;
	}

	public double getVisina() {
		return visina;
	}

	public void setVisina(double visina) {
		this.visina = visina;
	}
	
	

}
