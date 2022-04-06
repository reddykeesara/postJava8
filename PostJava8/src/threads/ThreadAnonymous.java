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

public class ThreadAnonymous {

	public ThreadAnonymous() {

	}

	public static void main(String[] args) {
		// Runnable r1 = new Hi();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("error");
					}
				}
				
			}
		});
		
		// Runnable r2 = new Hello();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("error");
					}
				}
				
			}
		});
		
		t1.start();
		t2.start();
	}

}
