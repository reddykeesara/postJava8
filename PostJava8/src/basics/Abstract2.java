package basics;



class Printer {
	public void show(Number i) {
		System.out.println(i);
	}
}

public class Abstract2 {

	public Abstract2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Printer p = new Printer();
		p.show(5.5);
	}

}
