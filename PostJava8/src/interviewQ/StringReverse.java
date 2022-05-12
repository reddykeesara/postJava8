package interviewQ;

public class StringReverse {

	public static void main(String[] args) {

		//first way
		/*		String str = "employee";
				int len = str.length();
				for (int i = len - 1; i >= 0; i--) {
					System.out.print(str.charAt(i));
				}*/
		
		
		//second way
			String str = "employee";
			char c[] = str.toCharArray();
			String strrev = "";
			int len = str.length();
			//System.out.println(len);
			for (int i = len - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
		
	}
}