package inheritance_Book;

public class Book {
	private String title;
	private String type;
	private String author;
	private double price;
	
	public String getTitle() {
		return title;
	}
	
	public String getType() {
		return type;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
