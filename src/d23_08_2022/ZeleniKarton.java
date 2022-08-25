package d23_08_2022;
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
//	
//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita


public class ZeleniKarton {
	private String imePrezimeStudent;
	private String brojIndeksa;
	private String nazivPredmeta;
	private String imePrezimeProfesor;
	private int ocena;
	public ZeleniKarton(String imePrezimeStudent, String brojIndeksa, String nazivPredmeta, String imePrezimeProfesor, int ocena) {
		
		this.imePrezimeStudent = imePrezimeStudent;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imePrezimeProfesor = imePrezimeProfesor;
		this.ocena = ocena;
	}
	public String getImePrezimeStudent() {
		return imePrezimeStudent;
	}
	public void setImePrezimeStudent(String imePrezimeStudent) {
		this.imePrezimeStudent = imePrezimeStudent;
	}
	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public String getImePrezimeProfesor() {
		return imePrezimeProfesor;
	}
	public void setImePrezimeProfesor(String imePrezimeProfesor) {
		this.imePrezimeProfesor = imePrezimeProfesor;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	
	public boolean jePolozen() {
		if(this.ocena > 5) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public void print() {
		System.out.println(this.nazivPredmeta + " - " + "Ocena: " + this.ocena);
		System.out.println("Student: " + this.imePrezimeStudent + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imePrezimeProfesor);
	}
	
	
	

}
