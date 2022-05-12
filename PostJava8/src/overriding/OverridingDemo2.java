package overriding;

class AA{
	public AA() {
		System.out.println("in AA");
	}
	public AA(int i) {
		System.out.println("in AA int");
	}
}

class BB extends AA{
	public BB() {
		System.out.println("in BB");
	}
	public BB(int i) {
		System.out.println("in BB int");
	}
}

public class OverridingDemo2 {
	public static void main(String[] args) {
		BB bb = new BB(1);
		
	}
}
