package comparable;

public class Movie implements Comparable<Movie>{
	
	private int year;
	private String name;
	private double rating;
	
	public Movie(int yer,String nme,double rat) {
		this.year = yer;
		this.name = nme;
		this.rating = rat;
	}
	

	public int getYear() {
		return year;
	}


	public String getName() {
		return name;
	}


	public double getRating() {
		return rating;
	}


	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}

	public static void main(String[] args) {
		
	}
}
