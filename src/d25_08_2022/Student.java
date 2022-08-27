package d25_08_2022;

import java.util.ArrayList;

public class Student {
	private String brojIndeksa;
	private String imePrezime;
	private String tipStudija;
	private ArrayList<Ispit> nizIspita = new ArrayList<>();
	
	public Student(String brojIndeksa, String imePrezime, String tipStudija) {
		this.brojIndeksa = brojIndeksa;
		this.imePrezime = imePrezime;
		this.tipStudija = tipStudija;
	}
	
	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public String getTipStudija() {
		return tipStudija;
	}
	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	public ArrayList<Ispit> getNizIspita() {
		return nizIspita;
	}
	
	public void dodajIspit(Ispit ispit) {
		this.nizIspita.add(ispit);
	}
	
	public double prosekNaStudijama() {
		double prosecnaOcena = 0;
		for(int i = 0; i < nizIspita.size(); i++) {
			if(this.nizIspita.get(i).isPolozen()) {
				prosecnaOcena = prosecnaOcena + this.nizIspita.get(i).getOcena();
			}
			
		}
		return prosecnaOcena / this.nizIspita.size();
		
		
	}
	
	public void print() {
		System.out.println("Predmeti: ");
		for(int i = 0; i < this.nizIspita.size(); i++) {
			this.nizIspita.get(i).printIspit();
		}
		
		
		System.out.println(prosekNaStudijama());
	}
	
	
	
	
}
