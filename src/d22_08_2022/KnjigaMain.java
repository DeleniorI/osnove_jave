package d22_08_2022;

public class KnjigaMain {

	public static void main(String[] args) {
		Autor autor = new Autor("Fjodor", "Dostojevski");
		Knjiga knjiga = new Knjiga("231-2135-213-2134", "Zlocin i kazna", 1866, autor);
		
		knjiga.print();
	}

}
