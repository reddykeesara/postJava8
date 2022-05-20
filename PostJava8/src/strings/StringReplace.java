package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplace {

//internal implementation
//	public String replace(CharSequence target, CharSequence replacement)  
//	{         
//	    return Pattern.compile(target.toString(), Pattern.LITERAL).matcher(this).replaceAll(Matcher.quoteReplacement(replacement.toString()));  
//	    Pattern.compile(regex).matcher(this).replaceAll(replacement);
//	}  

	// internal implementation
//	public String replaceAll(String regex, String replacement) {
//		return Pattern.compile(regex).matcher(this).replaceAll(replacement);
//	}

	public static void main(String args[]) {
		String s1 = "javatpoint is a very good website ";
		System.out.println(s1.repeat(3));
		System.out.println(s1.hashCode());
		System.out.println(s1.trim());
		String replaceString = s1.replace('a', 'e');// replaces all occurrences of 'a' to 'e'
		System.out.println(replaceString);

		String s2 = "my name is khan my name is java";
		String replaceString2 = s2.replaceAll("is", "was");// replaces all occurrences of "is" to "was"
		System.out.println(replaceString2);

		String s3 = "java string split method by javatpoint";
		String[] words = s3.split("\\s");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}
	}
}
