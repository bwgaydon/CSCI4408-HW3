import java.util.*;
import java.io.*;

public class Tester{
    public static void main(String[] args){
    	//Grader object provides queue for modification by ProcessQueue
    	Grader grader = new Grader();
    	
    	//ProcessQueues to modify objects in queue
    	ProcessQueue pq1 = grader.processQFactory();
    	ProcessQueue pq2 = grader.processQFactory();
    	ProcessQueue pq3 = grader.processQFactory();
    	ProcessQueue pq4 = grader.processQFactory();
    	ProcessQueue pq5 = grader.processQFactory();
    	
    	//three submission objects added
    	Submission s1 = new Submission();
    	Submission s2 = new Submission();
    	Submission s3 = new Submission();
    	
    	//test add/remove
    	pq1.add(s1);
    	pq2.add(s2);
    	pq3.add(s3);
    	pq4.process();
    	pq5.process();
    	pq1.process();
    }
}