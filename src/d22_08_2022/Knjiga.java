package d22_08_2022;

public class Knjiga {
	String isbn;
	String naziv;
	int godinaIzdanja;
	Autor autor;
	
	public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autor) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}
	
	public void print() {
		System.out.println(this.isbn + "\n" + this.naziv + " - " + this.godinaIzdanja + "\n" + "Autor: " + this.autor.getIme() + " " + this.autor.getPrezime());
	}
}
