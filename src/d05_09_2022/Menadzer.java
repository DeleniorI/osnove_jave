package d05_09_2022;

public class Menadzer extends Radnik {

	@Override
	public double plataRadnika() {
		double ukupnaPlata = 0;
		for(int i = 0; i < this.getNizSektora().size(); i++) {
			ukupnaPlata += this.getNizSektora().get(i).getPlata();
		}
		return ukupnaPlata;
	}

}
