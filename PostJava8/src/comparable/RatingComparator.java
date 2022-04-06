/**
 * 
 */
package comparable;

import java.util.Comparator;

/**
 * @author Ananya
 *
 */
public class RatingComparator implements Comparator<Movie>{

	/**
	 * 
	 */
	public RatingComparator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getRating() < o2.getRating()) return -1;
		if(o1.getRating() > o2.getRating()) return 1;
		else
		return 0;
	}

}
