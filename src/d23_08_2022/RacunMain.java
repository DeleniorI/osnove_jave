package d23_08_2022;

public class RacunMain {

	public static void main(String[] args) {
		
		Racun posiljalac = new Racun();
		posiljalac.setBrojRacuna("270-251235-24");
		posiljalac.setIme("Ilija");
		posiljalac.setPrezime("Nestorovic");
		posiljalac.promeniStanje(3000);
		
		Racun primalac = new Racun();
		primalac.setBrojRacuna("325-9500800004155-97");
		primalac.setIme("Nikola");
		primalac.setPrezime("Nikolic");
		primalac.promeniStanje(4000);
		
		Transakcija t = new Transakcija();
		t.setIdTransakcije("123gg4");
		t.setPosiljalac(posiljalac);
		t.setPrimalac(primalac);
		
		t.izvrsiTransakciju(2955);
		t.stampajTransakciju();
		
		
		
		
		
	}

}
