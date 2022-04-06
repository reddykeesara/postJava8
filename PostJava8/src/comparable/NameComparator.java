package comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Movie>{

	public NameComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
