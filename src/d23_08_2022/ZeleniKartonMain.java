package d23_08_2022;

import java.util.ArrayList;

public class ZeleniKartonMain {

	public static void main(String[] args) {
		ArrayList<ZeleniKarton> zeleniKarton = new ArrayList<>();
		zeleniKarton.add(new ZeleniKarton("Ilija Nestorovic", "274/22", "Matematika 1", "Marko Markovic", 10));
		zeleniKarton.add(new ZeleniKarton("Nikola Nikolic", "275/22", "Matematika 1", "Marko Markovic", 9));
		zeleniKarton.add(new ZeleniKarton("Filip Filipovic", "276/22", "Matematika 2", "Marko Markovic", 8));
		zeleniKarton.add(new ZeleniKarton("Tester Testerovic", "277/22", "Matematika 2", "Marko Markovic", 7));
		zeleniKarton.add(new ZeleniKarton("Developer Developeric", "278/22", "Matematika 1", "Marko Markovic", 6));
		zeleniKarton.add(new ZeleniKarton("Mustafa Mustafic", "279/22", "Matematika 2", "Marko Markovic", 5));
		zeleniKarton.add(new ZeleniKarton("Nikola Nikolic", "280/22", "Matematika 1", "Marko Markovic", 6));
		zeleniKarton.add(new ZeleniKarton("Ilija Ilijic", "281/22", "Matematika 1", "Marko Markovic", 7));
		zeleniKarton.add(new ZeleniKarton("Stevan Stevanovic", "282/22", "Matematika 1", "Marko Markovic", 8));
		zeleniKarton.add(new ZeleniKarton("Nemanja Nemanjic", "283/22", "Matematika 1", "Marko Markovic", 9));
		double prosecnaOcena = 0;
		double prosecnaOcenaPolozen = 0;
		int brojac = 0;
		for (int i = 0; i < zeleniKarton.size(); i++) {
			zeleniKarton.get(i).print();
			prosecnaOcena = prosecnaOcena + zeleniKarton.get(i).getOcena();
			if (zeleniKarton.get(i).jePolozen()) {
				prosecnaOcenaPolozen = prosecnaOcenaPolozen + zeleniKarton.get(i).getOcena();
				brojac++;
			}
		}

		prosecnaOcena /= zeleniKarton.size();
		prosecnaOcenaPolozen /= brojac;
		System.out.println("Prosecna ocena je: " + prosecnaOcena);
		System.out.println("Prosecna ocena polozenih ispita je: " + prosecnaOcenaPolozen);
	}

}
