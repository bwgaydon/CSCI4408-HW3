//Brian Gaydon

import java.util.*;

public class ProcessQueue {
	private static LinkedList queue;
	
	public ProcessQueue(LinkedList q) {
		queue = q;
	}
	
	public void add(Submission s) {
		queue.addFirst(s);
		System.out.println("Added " + queue.getFirst());
		System.out.println(queue.size() + " elements in the queue");
	}
	
	public void process() {
		//This is where actual processing code would go
		
		if (!queue.isEmpty()) {
			System.out.println("Processed item: " + queue.getLast());
			System.out.println("There are " + queue.size() + " Submission(s) in the queue.");
			queue.removeLast();
		}
		else System.out.println("There are no more Submissions in the queue.");
	}
}
