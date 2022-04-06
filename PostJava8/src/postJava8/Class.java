package postJava8;

public class Class {

	public Class() {
		// TODO Auto-generated constructor stub

	}

	
	public String toString() {
		return "RagClass";
	}	 
	
	
	  public Object clone() throws CloneNotSupportedException {
	  
		  return "o";
	  }
	 
	
	public boolean equals(Object O) {
		return true;
	}

	public static void main(String[] args) {
		Class cls = new Class();
		System.out.println(cls.toString());
		/*
		 * cls.getClass();
		 * 
		 * try { cls.wait(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */

	}
}
