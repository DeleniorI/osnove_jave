package d23_08_2022;

//Zadatak (Za vezbanje)
//Kreirati klasu Ringla koja ima:
//tip ringle (obicna ili ekspres)
//jacinu 
//za obicnu ringu jacina je u opsegu od 0 do 3
//za ekspres ringlu jacina je u opsegu od 0 do 12
//jacinu grejaca u kW (npr: 0.8, 1, 1.5, �)
//konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//getter za jacinu
//setteri ne postoje!!
//privatnu metodu koja vraca maksimalan broj pojacavanja
//za obicnu je 3, za ekspres je 12
//metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
//metodu iskljuci ringlu - metoda postavlja jacinu na 0
//metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
//metodu koja vraca potrosnju elektricne energije prema formuli 
//100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi 
//metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//metodu koja stampa podatke u formatu:
//	Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW


public class Ringla {
	private String tipRingle;
	private int jacina;
	private double jacinaGrejaca;

	public Ringla(String tipRingle, double jacinaGrejaca) {
		this.jacina = 0;
		this.tipRingle = tipRingle;
		this.jacinaGrejaca = jacinaGrejaca;
	}

	public int getJacina() {
		return jacina;
	}

	private int maksimalanBrojPojacavanja() {
		if (this.tipRingle.equals("obicna")) {
			return 3;
		} else if (this.tipRingle.equals("ekspres")) {
			return 12;
		} else {
			return 0;
		}
	}

	public void pojacajRinglu() {
		this.jacina += 1;
		if (this.jacina > 12) {
			this.jacina = 12;
		}
	}

	public void iskljuciRinglu() {
		this.jacina = 0;
	}

	public String ukljucena() {
		if (this.jacina > 0) {
			return "ukljucena";
		} else {
			return "iskljucena";
		}
	}

	public double potrosnjaStruje(int brojSati) {
		return 100 / maksimalanBrojPojacavanja() * this.jacina * this.jacinaGrejaca * brojSati;
	}
	
	public void print() {
		
		System.out.println(ukljucena());
		System.out.println("Tip ringle: " + this.tipRingle);
		System.out.println("Jacina: " + this.jacina);
		System.out.println("Grejac: " + this.jacinaGrejaca);
		
	}
}
