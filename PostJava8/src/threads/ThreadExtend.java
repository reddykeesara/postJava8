package threads;

class Hi extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try{Thread.sleep(1000);}catch(Exception e) {}
			System.out.println("Hi");
		}
	}
}

class Hello extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try{Thread.sleep(1000);}catch(Exception e) {}
			System.out.println("Hello");
		}
	}
}

public class ThreadExtend {

	public ThreadExtend() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Thread t1 = new Hi();
		Thread t2 = new Hello();
		t1.start();
		t2.start();
		

	}

}
