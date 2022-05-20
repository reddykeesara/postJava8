package threads;

//InterThread communicataion
//synchronized .. wait and notify
//main threa
class CountThread extends Thread {

	int count = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				count = count + 100;
			}
			notify();

		}
	}
}

//Main thread acquires lock on t1 using sync and then releases lock calling wait
//Thread t1 now acquires lock using syn(this) in run method and executes the code 
//then releases lock by calling notify() method
public class MovieBookApp {
	public static void main(String[] args) throws InterruptedException{
		CountThread t1 = new CountThread();
		t1.start();
		synchronized (t1) {
			t1.wait();
		}
		System.out.println("total count "+t1.count);
	}

}
