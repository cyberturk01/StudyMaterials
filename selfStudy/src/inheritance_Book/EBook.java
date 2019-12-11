package inheritance_Book;

public class EBook extends Book {
	private int size;
	private int pages;
	
	public void setSize(int size) {
		this.size = size;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void readBook() {
		System.out.println("The book is been read!");
	}
	public int getSize() {
		return size;
	}
	public int getPages() {
		return pages;
	}
}
