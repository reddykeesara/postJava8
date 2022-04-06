package basics;

public class StaticBlock {
	static {
		System.out.println("inside static block");
	}

	public StaticBlock() {
		System.out.println("inside constructor ");
	}
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		
	}

}
