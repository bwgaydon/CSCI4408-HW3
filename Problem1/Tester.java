import java.util.*;
import java.io.*;

public class Tester{
    public static void main(String[] args){
    	
    	ProcessQueue PQ = ProcessQueue.getQueue();
    	
    	Submission s1 = new Submission();
    	Submission s2 = new Submission();
    	Submission s3 = new Submission();
    	Submission s4 = new Submission();
    	Submission s5 = new Submission();
    	
    	PQ.add(s1);
    	PQ.add(s2);
    	PQ.add(s3);
    	PQ.process();
    	PQ.add(s4);
    	PQ.add(s5);
    	PQ.process();
    	PQ.process();
    	PQ.process();
    	PQ.process();
    	PQ.process();
    	
    }
}