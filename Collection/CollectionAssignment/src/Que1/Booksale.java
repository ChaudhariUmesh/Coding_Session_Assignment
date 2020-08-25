package Que1;

public class Booksale {
	Book b;
	int copiesSold;
Booksale(Book b , int copiesSold)
{
	this.b=b;
	this.copiesSold=copiesSold;
}
public String tostring()
{
	return "Book id :"+b.bookid+
			"\n CopiesSold :"+copiesSold;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((b == null) ? 0 : b.hashCode());
	result = prime * result + copiesSold;
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
	Booksale other = (Booksale) obj;
	if (b == null) {
		if (other.b != null)
			return false;
	} else if (!b.equals(other.b))
		return false;
	if (copiesSold != other.copiesSold)
		return false;
	return true;
}

}

