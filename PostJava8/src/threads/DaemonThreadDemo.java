package threads;

class TestThread extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon())
		System.out.println("daemon thread ");
	}
}

public class DaemonThreadDemo {

	public static void main(String[] args) {
		System.out.println("main Thread "); // if we comment this line.. sysout of daemon also will not run
		TestThread th = new TestThread();
		th.setDaemon(true); // if we place this line after start. it wiil throw IllegalThreadStateException
		th.start();
		
		//Daemon thread life depends on life of parent thread
		//it inherits  the nature/properties from parent thrad
		
		
		//Thread.currentThread().setDaemon(true);  //throws IllegalThreadStateException
	}

}
