package inheritance_Book;

public class AudioBook extends Book{
	private int length;
	private String narrator;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}

	public String getNarrator() {
		return narrator;
	}

	public void listen() {
		System.out.println("The AudioBook is been listened");
	}
}
