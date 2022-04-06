package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

//Queue Interface extends Collection
//add, offer, remove, poll, element, peek are some of the method
//Deque is a double ended Queue sopports addfirst removefirst addlast removelast
//offerfirst offerlast pollfirst last getfirst last,peekfirst, peeklast are some methods

//BlockingQueue interface extends Queue
//it supports operations that wait for the queue to become nonempty when
//retrievig an element
//add, offer, put, offer with wait, take, poll remaintingCapacity, remove, contains
//
//PriorityQueue implements Queue -sorted -natural order
//ArrayQueue implements Deque -
//ArrayBlockingQueue implements BlockingQueue -  user array-optionally bounded
//LinkedBlocingQueue implements BlockingQueue - uses linkedlist -optionally bounded
//							linked queues typically have higher throughput than
//                     arraybased ques
//less predictable performance in most concurrnt applications
public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		pq.offer(24);
		pq.offer(15);
		pq.offer(9);
		pq.offer(45);
		pq.offer(33);
		pq.offer(22);
		pq.offer(4);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		Comparator<Integer> revComp = new  Comparator<>() {
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		};

		PriorityQueue <Integer> revpq = new PriorityQueue<>(20, revComp);
		revpq.offer(24);
		revpq.offer(15);
		revpq.offer(9);
		revpq.offer(45);
		revpq.offer(33);
		revpq.offer(22);
		revpq.offer(4);
		System.out.println(revpq);
		

	}
}
