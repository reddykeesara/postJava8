package versions;

import java.util.Arrays;
import java.util.List;

public class Java8 {

	public Java8() {
		//lambda();
	}
	
	public static void main(String[] args) {
		Java8 j8 = new Java8();
		j8.lambda();
	}

	
	private void lambda() {
		List<String> list = Arrays.asList("a","b","c","d");
		list.stream().filter(name -> name.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
		
	}

}
