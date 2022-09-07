package d06_09_2022;

import java.util.ArrayList;

public class PlaninarskiDom {
	private String nazivDoma;
	private int godinaOsnivanja;
	ArrayList<Planinar> clanoviDoma = new ArrayList<>();

	public PlaninarskiDom() {

	}

	public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
		super();
		this.nazivDoma = nazivDoma;
		this.godinaOsnivanja = godinaOsnivanja;
		
	}

	public String getNazivDoma() {
		return nazivDoma;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public ArrayList<Planinar> getClanoviDoma() {
		return clanoviDoma;
	}

	public void uclaniPlaninara(Planinar planinar) {
		this.clanoviDoma.add(planinar);
	}

	public int brojPlaninaraUspesno(Planina planina) {
		int brojPlaninara = 0;
		for (int i = 0; i < this.clanoviDoma.size(); i++) {
			if (this.clanoviDoma.get(i).usepsanUspon(planina)) {
				brojPlaninara++;
			}

		}
		return brojPlaninara;
	}

	public void izbaciPlaninara(int id) {
		for (int i = this.clanoviDoma.size() - 1; i >= 0; i--) {
			if (this.clanoviDoma.get(i).getId() == id) {
				this.clanoviDoma.remove(i);
			}
		}
	}
	
	public void printODomu() {
		System.out.println("Dom: " + this.nazivDoma);
		System.out.println("Godina osnivanja: " + this.godinaOsnivanja);
		for(int i = 0; i < this.clanoviDoma.size(); i++) {
			this.clanoviDoma.get(i).print();
		}
	}
	
	public double clanarinaSvih() {
		double clanarina = 0;
		
		for(int i = 0; i < this.clanoviDoma.size(); i++) {
			clanarina += this.clanoviDoma.get(i).clanarina();
		}
		return clanarina;
	}

}
