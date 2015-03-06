public class ReportTestCases{
    private int passes = 0;
    private int total = 0;
    ReportTimeouts rep = new ReportTimeouts();
	
    public void increasePasses(){
	passes++;
    }
    public void increaseTotal(){
	total++;
    }
    public void getResults(boolean pass, boolean timeout){
	increaseTotal();
	if(pass){
	    increasePasses();
	}
	if(!pass && timeout){
	    rep.getResults();
	}
	//it would be more practical to only print once per submission,
	//but this demonstrates more clearly that the code is working
	print();
    }
    
    public void print(){
	System.out.println("Passes: " + passes + "/" + total);
    }
}
