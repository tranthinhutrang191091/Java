package quanlysach;

public class Book {
	private String nameBook;
	private double price;
	private Author nameAuthor;
	private int publishingYear;

	public Book(String nameBook, double price, Author nameAuthor, int publishingYear) {

		this.nameBook = nameBook;
		if (price >= 0)
			this.price = price;
		else
			this.price = 0;
		this.nameAuthor = nameAuthor;
		if (publishingYear > this.nameAuthor.getBirthday().getYear())
			this.publishingYear = publishingYear;
		else
			this.publishingYear = 1;
	}

	public String getNameBook() {
		return this.nameBook;
	}

	public void setNameBook(String nameBook) {

		this.nameBook = nameBook;
	}

	public double getPrice() {

		return this.price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			this.price = 0;
	}

	public int getPublishingYear() {
		return this.publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		if (this.publishingYear > this.nameAuthor.getBirthday().getYear() && this.publishingYear > 0)
			this.publishingYear = publishingYear;
		else
			this.publishingYear = 1;
	}

	public Author getNameAuthor() {
		return this.nameAuthor;
	}

	public void setNameAuthor(Author nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public void printNameBook() {
		System.out.println(this.nameBook);
	}

	public boolean checkSameYear(Book book) {
		return (this.publishingYear == book.publishingYear) ? true : false;
	}

	public double priceAfterDiscount(double x) {
		return this.price - (this.price * x / 100);
	}

	@Override
	public String toString() {
		return "|" + this.nameBook + "|" + this.price + "VND|" + this.publishingYear + "|" + this.nameAuthor;
	}
}
