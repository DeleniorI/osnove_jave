package d23_08_2022;

public class SporetMain {

	public static void main(String[] args) {
		
		Ringla doleLevo = new Ringla("ekspres", 2);
		Ringla doleDesno = new Ringla("obicna", 1);
		Ringla goreLevo = new Ringla("obicna", 0.8);
		Ringla goreDesno = new Ringla("ekspres", 1.5);
		
		
		
		ElektricniSporet el = new ElektricniSporet("Beko", 4, 4, goreLevo, goreDesno, doleLevo, doleDesno);
		
		el.pojacaj(1);
		el.pojacaj(2);
		el.potrosnjaSporeta(6);
		
		
		
		
		el.print();
		
		System.out.println(el.potrosnjaSporeta(6));
		
	}

}
