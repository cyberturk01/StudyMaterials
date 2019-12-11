package inheritance_Book;

public class BookTest {
	public static void main(String[] args) {
		AudioBook book1= new AudioBook();
		Book b1= new Book();
		book1.setTitle("orcunlar");
		System.out.println(book1.getTitle());
		book1.listen();
		
		System.out.println(b1.getTitle());
	}
	
}
