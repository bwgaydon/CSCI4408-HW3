//Brian Gaydon

import java.util.*;

public class ProcessQueue {
	
	//singleton queue and ProcessQueue object
	private static ProcessQueue PQ;
	private static LinkedList queue;
	
	private ProcessQueue() {
		queue = new LinkedList();
	}
	
	public static ProcessQueue getQueue() {
		if(queue == null) {
			PQ = new ProcessQueue();
			System.out.println("Singleton Queue created");
		}
		return PQ;
	}
	
	public void add(Submission s) {
		queue.addFirst(s);
		System.out.println("Added " + queue.getFirst());
		System.out.println(queue.size() + " Submission(s) in the queue");
	}
	
	public void process() {
		//This is where actual processing code would go
		
		if (!queue.isEmpty()) {
			System.out.println("Processed item: " + queue.getLast());
			queue.removeLast();
			System.out.println("There are " + queue.size() + " Submission(s) in the queue.");
		}
		else System.out.println("There are no more Submissions in the queue.");
	}
}
