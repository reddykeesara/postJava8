package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainComparator {

	public MainComparator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Movie> al = new ArrayList<>();
		al.add(new Movie(1878,"abc ",2.5));
		al.add(new Movie(1979,"xyz ",2.8));
		al.add(new Movie(1976,"sdf ",3.5));
		al.add(new Movie(2000,"pqr ",3.0));
		
		for(Movie m:al) {
		    System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
		
		NameComparator nc = new NameComparator();
		System.out.println("Name Sort ");
		Collections.sort(al, nc);
		
		printList(al);

		System.out.println("year sort");
		//year comparator
		Collections.sort(al, new Comparator<Movie>() {
			public int compare(Movie a, Movie b) {
				return a.getYear() > b.getYear() ? 1 : -1;
			}
		});
		printList(al);
		
		System.out.println("rating sort");
		
		
//		Collections.sort(al,(a, b)->{
//			return a.getRating()>b.getRating()?1:-1;
//		});
		
		
		//replacement of above code
		Collections.sort(al,(a, b)-> a.getRating()>b.getRating()?1:-1		);
		printList(al);
				
	}
	static void  printList(ArrayList<Movie> al) {
		for(Movie m:al) {
		    System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
		}
	}
}
