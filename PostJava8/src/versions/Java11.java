/**
 * 
 */
package versions;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Ananya
 *
 */
public class Java11 {

	/**
	 * 
	 */
	public Java11() {
		"Marco".isBlank();
		Stream<String> s = "Mar\nco".lines();
		//s.
		List<String> li = s.toList();
		//li.iterator()li
		Iterator<String> itr =  li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Marco ".strip());
		
		//
		try {
			Path path = Files.writeString(Files.createTempFile("helloworld",".txt"),"Hih ");
			String ss = Files.readString(path);
			System.out.println(ss);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Java11();

	}

}
