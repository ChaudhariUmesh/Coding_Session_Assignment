package Que7;

public class Movie  {
	int movieid;
	 String movieName;
	  int rating;
	public Movie(int movieid, String movieName, int rating) {
	
		this.movieid = movieid;
		this.movieName = movieName;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", movieName=" + movieName + ", rating=" + rating + "]";
	}
	
	  
}
