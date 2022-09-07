package d05_09_2022;

public class Magacioner extends Radnik {

	private double prosecnaPlata() {
		double sumaPlata = 0;
		for (int i = 0; i < this.getNizSektora().size(); i++) {
			sumaPlata += this.getNizSektora().get(i).getPlata();

		}
		sumaPlata = sumaPlata / this.getNizSektora().size() * 0.5;
		return sumaPlata;
	}

	@Override
	public double plataRadnika() {
		return prosecnaPlata() * (this.getNizSektora().size());
	}

}
