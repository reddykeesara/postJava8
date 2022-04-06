package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream01 {

	public Stream01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> id = Arrays.asList("Classes","Methods","Members");
		List<String> output = id.stream().filter(s -> s.startsWith("M")).collect(Collectors.toList());
		System.out.println(output);
		
		
		List<String> list = Arrays.asList("a","b","c","d");
		list.stream().filter(name -> name.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
	
		String exampleString = "This is a sample string";
		long totalChars = exampleString.chars().filter(ch -> ch == 's').count();
		System.out.println(totalChars);
		
		
		
	}

}
