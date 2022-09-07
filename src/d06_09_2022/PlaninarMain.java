package d06_09_2022;

public class PlaninarMain {

	public static void main(String[] args) {

		PlaninarskiDom jastreb = new PlaninarskiDom("Jastreb", 1989);

		Planina kopaonik = new Planina("Kopaonik", "Srbija", 2017);

		Planinar ilija = new RekreativniPlaninar(22124, "Ilija Nestorovic", 20, "Toplicki okrug", 3000);

		Planinar stefan = new Alpinista(12312, "Stefan Stefanovic", 10);

		jastreb.uclaniPlaninara(ilija);
		jastreb.uclaniPlaninara(stefan);

		jastreb.clanarinaSvih();
		System.out.println(jastreb.brojPlaninaraUspesno(kopaonik));
//		jastreb.printODomu();
		jastreb.izbaciPlaninara(22124);
		jastreb.printODomu();
	}

}
