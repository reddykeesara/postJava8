/**
 * 
 */
package versions;

/**
 * @author Ananya
 *
 */
public class Java13 {

	/**
	 * 
	 */
	public Java13() {
		Object status;
		/*
		 * Switch expressions can now return a value. And you can use a lambda-style syntax
		 * for your expressions, without the fail-through/break issues.
		 */
		/*boolean result = switch(status) {
		case SUB -> true;
		case FRE -> false;
		defalut -> throw new IllegalArgumentException("something is wrong");
		}; */
		
		//you can do this in java 13
		String htmlWithJava13 = """
				<html>
					<body>
						<p>Hello, World </p>
					</body>
				</html>
				""";
		System.out.println(htmlWithJava13);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Java13();

	}

}
