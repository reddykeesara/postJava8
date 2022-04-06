package threads;

/*class Hi3 implements Runnable {

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

class Hello3 implements Runnable {

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

}*/

public class ThreadLambda {

	public ThreadLambda() {

	}

	public static void main(String[] args) {
		// Runnable r1 = new Hi();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				System.out.println("Hi");
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				System.out.println("Hello");
			}
		});
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			
		}
		t2.start();
	}
}
