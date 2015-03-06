public class ReportTimeouts{
	private int timeouts = 0;
	
	public void increaseTimeouts(){
		timeouts++;
	}
	
	public void getResults(){
		increaseTimeouts();
		//should print once per submission, but this demonstrates more clearly that the code is working
		print();
	}
	
	public void print(){
		System.out.println("Timeouts: " + timeouts);
	}
}
