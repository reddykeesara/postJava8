package strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is khan", " ");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println(st.nextElement());
		}
	}
}