package d06_09_2022;

public class RekreativniPlaninar extends Planinar {

	private int tezinaOpreme;
	private String nazivOkruga;
	private int maksimalniUspon;

	public RekreativniPlaninar(int id, String imePrezime, int tezinaOpreme, String nazivOkruga, int maksimalniUspon) {
		super(id, imePrezime);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maksimalniUspon = maksimalniUspon;
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public int getMaksimalniUspon() {
		return maksimalniUspon;
	}

	@Override
	public double clanarina() {
		return 1000;
	}

	@Override
	public boolean usepsanUspon(Planina planina) {
		int maksOprema = this.maksimalniUspon + this.tezinaOpreme * 50;

		if (maksOprema < planina.getVisina()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void print() {
		System.out.println("Rekreativac, " + "id: " + this.id);
		System.out.println("Ime: " + this.imePrezime);
		System.out.println("Okrug: " + this.nazivOkruga);
	}
	
	

}
