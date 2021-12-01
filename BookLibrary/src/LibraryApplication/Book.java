package LibraryApplication;

import java.time.LocalDate;


public class Book {
	
	private int bookId;
	private String title;
	private String author;
	private double price;
	private Category category;
	private int quantity;
	private LocalDate publishDate;
	
	public Book()
	{
		
	}
	
	
	public Book(int bookId,String title, String author, double price, Category category, int quantity, LocalDate publishDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.publishDate = publishDate;
	}
	
	
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public LocalDate getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}


	@Override
	public String toString() {
		return "Book [bookId = " + bookId + ", title = " + title + ", author = " + author + ", price = " + price + ", category = "
				+ category + ", quantity = " + quantity + ", publishDate = " + publishDate + "]";
	}


	
	
	
	
}
