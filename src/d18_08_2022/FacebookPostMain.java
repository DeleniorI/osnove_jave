package d18_08_2022;

public class FacebookPostMain {

	public static void main(String[] args) {
		FacebookPost post = new FacebookPost();
		post.imePrezimePrvi = "Ilija Nestorovic";
		post.imePrezimeDrugi = "Nikola Nikolic";
		post.tekst = "Unesi neki tekst jer meni ne pada nista na pamet";
		post.brojLajkova = 0;
		post.brojDeljenja = 0;
		
		
		post.like();
		post.like();
		post.like();
		post.like();
		post.dislike();
		post.dislike();
		post.dislike();
		post.dislike();
		post.dislike();
		post.share();
		post.share();
		post.share();
		post.print();
	

	}

}
