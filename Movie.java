
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie implements Comparable<Movie> {
	
	private double rating;
    private String name;
    private int year;
    
   	public Movie() {
	}

	public Movie(double rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	
	
	
	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Used to sort movies by year
    public int compareTo(Movie m)
    {
       //return this.year - m.year;
    	if(this.year==m.getYear()) {
    		return 0;
    	} else if(this.year > m.getYear()) {
    		return 1;
    	}else {
    		return -1;
    	}
    	
    }
    
    public static void main(String[] args) {
		
    List<Movie> movieList =  new ArrayList<Movie>();	
    Movie m1 = new Movie(9.24, "KGF1", 2019);
    Movie m3 = new Movie(1.2, "Lagaan", 2001);
    Movie m2 = new Movie(3.4, "Batman", 1996);    
    Movie m4 = new Movie(10.0, "Kantara", 2022);
    Movie m5 = new Movie(1.2, "Gangajaal", 2001);
    movieList.add(m1);
    movieList.add(m2);
    movieList.add(m3);
    movieList.add(m4);
    movieList.add(m5);
    //Collections.sort(movieList);
    //Collections.sort(movieList,new NameComaparator());
    Collections.sort(movieList,new IdComparator());
    System.out.println(movieList);
    
	}
    

}
