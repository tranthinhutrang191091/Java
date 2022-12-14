package classmydate;
import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		if (day >= 1 && day <= 31)
			this.day = day;
		else
			this.day = 1;
		if (month >= 1 && month <= 12)
			this.month = month;
		else
			this.month = 1;
		if (year >= 0)
			this.year = year;
		else
			this.year = 1;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		switch (this.month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			if (day >= 1 && day <= 31)
				this.day = day;
			else
				this.day = 1;
			break;
		}
		case 2: {
			if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
				if (day >= 1 && day <= 29)
					this.day = day;
				else
					this.day = 1;
			} else {
				if (day >= 1 && day <= 28)
					this.day = day;
				else
					this.day = 1;
			}

			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			if (day >= 1 && day <= 30)
				this.day = day;
			else
				this.day = 1;
			break;
		}
		}
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12)
			this.month = month;
		else
			this.month = 1;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		if (year > 0)
			this.year = year;
		else
			this.year = 1;
	}

	public void printDay() {
		System.out.println("Day: " + this.day);
	}

	public void printMonth() {
		System.out.println("Month: " + this.month);
	}

	public void printYear() {
		System.out.println("Year: " + this.year);
	}

	public void printDate() {
		System.out.println("Date : " + this.day + " Month : " + this.month + " Year : " + this.year);
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return this.day == other.day && this.month == other.month && this.year == other.year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.day;
		result = prime * result + this.month;
		result = prime * result + this.year;
		return result;
	}
}
