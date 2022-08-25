package d23_08_2022;
// Kreirati klasu ElektricniSporet koja ima:
// marku storeta (npr: Beko, Bosh)
// garanciju kao broj godina
// maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
// 4 ringle 
// gore levo
// gore desno
// dole levo
// dole desno
// konstruktor koji postavlja sve atribute
// gettere za sve atribut
// ne postoje setteri
// metodu pojacaj kojoj se prosledjuje pozicija ringle
// pozicija 1 je ringla gore levo
// pozicija 2 je ringla gore desno
// pozicija 3 je ringla dole levo
// pozicija 4 je ringla dole desno
// Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu funkije 



public class ElektricniSporet {
	private String markaSporeta;
	private int garancija;
	private int maxUkljuceneRingle;
	private Ringla goreLevo;
	private Ringla goreDesno;
	private Ringla doleLevo;
	private Ringla doleDesno;

	public ElektricniSporet(String markaSporeta, int garancija, int maxUkljuceneRingle, Ringla goreLevo,
			Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
		this.markaSporeta = markaSporeta;
		this.garancija = garancija;
		this.maxUkljuceneRingle = maxUkljuceneRingle;
		this.goreLevo = goreLevo;
		this.goreDesno = goreDesno;
		this.doleLevo = doleLevo;
		this.doleDesno = doleDesno;
	}

	public String getMarkaSporeta() {
		return markaSporeta;
	}

	public int getGarancija() {
		return garancija;
	}

	public int getMaxUkljuceneRingle() {
		return maxUkljuceneRingle;
	}

	public Ringla getGoreLevo() {
		return goreLevo;
	}

	public Ringla getGoreDesno() {
		return goreDesno;
	}

	public Ringla getDoleLevo() {
		return doleLevo;
	}

	public Ringla getDoleDesno() {
		return doleDesno;
	}

	// Nesto sam zabo sa ovom metodom, ne mogu da skontam ovo 
   //  Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu funkije 
	
	public void pojacaj(int pozicija) {
		int brojacUkljucenih = 0;
		

		if (pozicija == 1) {
			this.goreLevo.pojacajRinglu();
			brojacUkljucenih++;
		} else if (pozicija == 2) {
			this.goreDesno.pojacajRinglu();
			brojacUkljucenih++;
		} else if (pozicija == 3) {
			this.doleLevo.pojacajRinglu();
			brojacUkljucenih++;
		} else if (pozicija == 4) {
			this.doleDesno.pojacajRinglu();
			brojacUkljucenih++;
		}
		
		
	}

	public void iskljuciRinglu(int pozicija) {
		if (pozicija == 1) {
			this.goreLevo.iskljuciRinglu();
		} else if (pozicija == 2) {
			this.goreDesno.iskljuciRinglu();
		} else if (pozicija == 3) {
			this.doleLevo.iskljuciRinglu();
		} else if (pozicija == 4) {
			this.doleDesno.iskljuciRinglu();
		}

	}

	public double potrosnjaSporeta(int vremeRadaRingli) {
		return this.goreLevo.potrosnjaStruje(vremeRadaRingli) + this.goreDesno.potrosnjaStruje(vremeRadaRingli)
				+ this.doleLevo.potrosnjaStruje(vremeRadaRingli) + this.doleDesno.potrosnjaStruje(vremeRadaRingli);
	}

	public void print() {
		System.out.println(this.markaSporeta + " - " + this.garancija);
		System.out.println("Ringle: ");
		System.out.println("Gore levo: ");
		this.goreLevo.print();
		System.out.println("Gore desno: ");
		this.goreDesno.print();
		System.out.println("Dole levo: ");
		this.doleLevo.print();
		System.out.println("Dole desno: ");
		this.doleDesno.print();
	}

}
