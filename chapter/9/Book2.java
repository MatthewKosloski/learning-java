//********************************************************************
// Book2.java
//
// Represents a book. Used as the parent of a derived class to
// demonstrate inheritance and the use of the super reference.
//********************************************************************

public class Book2 {

	protected int pages;

	// Constructor: sets up the book with the specified number of pages
	public Book2(int numPages) {
		pages = numPages;
	}

	public void setPages(int numPages) {
		pages = numPages;
	}

	public int getPages() {
		return pages;
	}

}