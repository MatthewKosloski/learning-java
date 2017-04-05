//********************************************************************
// Book.java
//
// Represents a book. Used as the parent of a derived class to
// demonstrate inheritance.
//********************************************************************

public class Book {

	// With protected, a child class can reference it.
	protected int pages = 1500;

	public void setPages(int numPages) {
		pages = numPages;
	}

	public int getPages() {
		return pages;
	}

}