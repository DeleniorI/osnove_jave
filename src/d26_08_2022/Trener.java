package d26_08_2022;

public class Trener extends Osoba{
	private int godineIskustva;
	public String tipTrenera;
	
	public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imePrezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Godine iskustva: " + this.godineIskustva + " Tip trenera: " + this.tipTrenera);
	}
}
