package threads;

class Hi2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println("Hi");
		}
	}

}

class Hello2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println("Hello");
		}
	}

}

public class ThreadImplRunnable {

	public ThreadImplRunnable() {

	}

	public static void main(String[] args) {
		Runnable r1 = new Hi2();
		Runnable r2 = new Hello2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();	
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();
	}

}
