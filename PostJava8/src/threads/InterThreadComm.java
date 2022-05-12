package threads;

import java.util.concurrent.ThreadLocalRandom;

class Data {

	private String packet;
	private boolean transfer = true;

	public synchronized String receive() {
		while (transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		transfer = true;
		String returnPacket = packet;
		notify();
		return returnPacket;
	}

	synchronized public void send(String packet) {
		while (!transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		transfer = false;
		this.packet = packet;
		notify();

	}

}

class Sender implements Runnable {

	private Data data;

	public Sender(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		String packets[] = { "1st packet", "2nd packet", "3rd packet", "4th packet", "5th packet", "6th packet",
				"7th packet", "8th packet", "9th packet", "10th packet", "11th packet", "12th packet", "13th packet",
				"14th packet", "15th packet", "16th packet", "17th packet", "18th packet", "19th packet", "20th packet",
				"21th packet"

		};
		for (String packet : packets) {
			data.send(packet);
			System.out.println("packet sent " + packet);
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				// Log.error("Thread interrupted", e);
			}
		}
	}
}

class Receiver implements Runnable {
	private Data load;

	public Receiver(Data data) {
		this.load = data;

	}

	@Override
	public void run() {
		for (String receivedMessage = load.receive(); !"End".equals(receivedMessage); receivedMessage = load
				.receive()) {
			System.out.println("Packet received " + receivedMessage);
			System.out.println();
		}

	}
}

public class InterThreadComm {

	public static void main(String[] args) {
		Data data = new Data();
		Thread thread1 = new Thread(new Sender(data));
		Thread thread2 = new Thread(new Receiver(data));
		thread1.start();
		thread2.start();
	}
}
