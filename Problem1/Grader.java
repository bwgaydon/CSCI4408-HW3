//Brian Gaydon

import java.util.*;

public class Grader {
	public LinkedList queue = new LinkedList();
	public ProcessQueue processQFactory() {
		ProcessQueue returnQ = new ProcessQueue(queue);
		return returnQ;
	}
}
