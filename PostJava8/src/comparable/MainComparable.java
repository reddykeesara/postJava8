/**
 * 
 */
package comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Ananya
 *
 */
public class MainComparable {

	/**
	 * 
	 */
	public MainComparable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Movie> al = new ArrayList<Movie>();
		al.add(new Movie(1878,"abc ",2.5));
		al.add(new Movie(1979,"xyz ",2.8));
		al.add(new Movie(1976,"sdf ",3.5));
		al.add(new Movie(2000,"pqr ",3.0));
		
		for(Movie m:al) {
		    System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
		
		Collections.sort(al);
		
		System.out.println("After Sorting");
		for(Movie m:al) {
		    System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
	}

}
