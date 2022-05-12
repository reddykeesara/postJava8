package interviewQ;

import java.util.Iterator;

public class DuplicatesInString {

	public static void main(String[] args) {
		String str = "hello java hello java8";
		String[] st = str.split(" ");
		for(String s:st) {
			System.out.println(s);
		}
	}
}
