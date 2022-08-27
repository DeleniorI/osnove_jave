package d25_08_2022;

public class IspitMain {

	public static void main(String[] args) {
		Student s1 = new Student("244/22", "Ilija Nestorovic", "osnovne");
		Student s2= new Student("158/22", "Marko Markovic", "master");
		Student s3 = new Student("21/22", "Nikola Nikolic", "doktorske");
		
		
		Ispit i1 = new Ispit("Matematika", 8, "Stevan Stevovic");
		Ispit i2 = new Ispit("Informatika", 6, "Mustafa Mustafic");
	
		s1.dodajIspit(i1);
		s1.dodajIspit(i2);
		s2.dodajIspit(i1);
		s2.dodajIspit(i2);
		s3.dodajIspit(i1);
		s3.dodajIspit(i2);
		s3.dodajIspit(i1);
		s1.print();
		s2.print();
		s3.print();
	}

}
