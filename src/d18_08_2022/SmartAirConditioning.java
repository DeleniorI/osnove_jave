package d18_08_2022;

public class SmartAirConditioning {
	String marka;
	int potrosnjaHladi;
	int potrosnjaGreje;
	int temperatura; // min 16, max 35;
	String mod; // hladi ili greje

	public void stampaj() {
		System.out.println(marka + " " + mod + " " + temperatura);
	}
	
	public int mesecnaPotrosnja() {
		if (this.mod.equals("hladi")) {
			return 30 * 15 * this.potrosnjaHladi;
		} else {
			return 30 * 15 * this.potrosnjaGreje;
		}
	}
	
	public int potrosnjaNovca() {
		if (mesecnaPotrosnja() <= 350) {
			return mesecnaPotrosnja() * 6;
		} else {
			return mesecnaPotrosnja() * 9;
		}
	}
	
}


