package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public StreamTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Stream.of("bbb","aa","dd","cc")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		System.out.println(IntStream.range(1, 5).sum());
		
		IntStream.range(1, 10).forEach(System.out::println);
		
		IntStream.range(1,10).skip(5).forEach(x->System.out.println(x));
		
	}
}
