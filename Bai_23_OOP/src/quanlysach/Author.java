package quanlysach;
import classmydate.MyDate;

public class Author {
	private String nameAuthor;
	private MyDate birthday;

	public Author(String nameAuthor, MyDate birthday) {
		this.nameAuthor = nameAuthor;
		this.birthday = birthday;
	}

	public String getNameAuthor() {
		return this.nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public MyDate getBirthday() {
		return this.birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return this.nameAuthor;
	}
}
