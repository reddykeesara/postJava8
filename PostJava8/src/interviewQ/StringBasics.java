package interviewQ;

public class StringBasics {

	public static void main(String[] args) {
		String s1 =  "abcd";
		String s2 = s1;
		String s3 = "abcd";
		String s4 = "a"+"bcd";
		String s5 = "a";
		String s6 = "bcd";
		String s7 = s5+s6;
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s3==s7);
		System.out.println(s3.equals(s7));
		
		System.out.println("------------------");
		
		String S1 =  new String("abcd");
		String S2 = s1;
		String S3 = new String("abcd");
		String S4 = new String("a"+"bcd");
		String S5 = new String("a");
		String S6 = new String("bcd");
		String S7 = s5+s6;
		System.out.println(S2==S3);
		System.out.println(S3==S4);
		System.out.println(S3==S7);
	}
}
