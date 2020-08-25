package Que1;

public class Book {
	int bookid;
	String author;
	float price;
	Book( int bookid , String author , float price)
	{
		this.bookid=bookid;
		this.author=author;
		this.price=price;
	}
	public String toString()
	{
		return "Book_id : "+bookid +
				"\n author : "+author+
				"\n price : "+price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + bookid;
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookid != other.bookid)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
	
}
