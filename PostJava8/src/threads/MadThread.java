package threads;

/* When we invoke the join() method on a thread, the calling thread goes into a waiting state. 
 * It remains in a waiting state until the referenced thread terminates. 
 * The join() method may also return if the referenced thread was interrupted.
 *  In this case, the method throws an InterruptedException
*/
public class MadThread extends Thread {

	public MadThread() {

	}

//	public void start() {
//		System.out.println("inside start ");
//	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {

			try {
				sleep(500);
				System.out.println(i);

			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {

		MadThread mt = new MadThread();
		mt.start(); // start runs a new thread //start() method will be called if no start().. run()
					// method is called
		// mt.run(); // run starts main thread
	}

}

class MadThread2   {

//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//		for (int i = 0; i < 10; i++) {
//
//			try {
//				Thread.sleep(500);
//				System.out.println(i);
//
//			} catch (Exception e) {
//
//				System.out.println(e.getMessage());
//			}
//		}
//	}

	public static void main(String[] args) {
		//MadThread2 mt2 = new MadThread2();
		Thread t2 = new Thread(()->{
			System.out.println(Thread.currentThread().getName());
			try {
				System.out.println("inside thread..");
			Thread.sleep(100);
			}catch(Exception ex) {
				
			}
			
		});
		t2.start();

	}

}