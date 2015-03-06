interface Logging
{
<<<<<<< HEAD
	public enum LOG_TYPE {TXT, XML, HTML};
=======
>>>>>>> 0cb198646f848534e2f33d4b2f8e4b686d9eab57
	public void log(String msg);
}

class LogText implements Logging
{
	public LogText()
	{
		System.out.println("Logging: text format");
	}
	public void log(String msg)
	{	
		System.out.println("Logging text to file: " + msg);
	}
}
class LogXML implements Logging
{
	public LogXML()
	{
		System.out.println("Logging: <type>XML Format</type>");
	}
	public void log(String msg)
	{	
		System.out.println("Logging text to file: log.xml" );
		System.out.println("<xml><msg>"+msg+"</msg></xml>");
	}
}
class LogHTML implements Logging
{
	public LogHTML()
	{
		System.out.println("Logging: HTML format");
	}
	public void log(String msg)
	{	
		System.out.println("Logging HTML to file: log.html" );
		System.out.println("<html><body>"+msg+"</body></html>");
	}
}

<<<<<<< HEAD
=======
class LoggingFactory
{

	public static Logging createLogging(String type){
		if (type.equalsIgnoreCase("text"))
			return new LogText();
		else if (type.equalsIgnoreCase("xml"))
			return new LogXML();
		else if (type.equalsIgnoreCase("html"))
			return new LogHTML();
		else
			return new LogText();
	}

}

>>>>>>> 0cb198646f848534e2f33d4b2f8e4b686d9eab57
class Analysis
{
	public static void main(String[] args)
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java Analysis type");
			System.exit(-1);
		}
		String type = args[0];
<<<<<<< HEAD
		Logging logfile;
		if (type.equalsIgnoreCase("text"))
			logfile = new LogText();
		else if (type.equalsIgnoreCase("xml"))
			logfile = new LogXML();
		else if (type.equalsIgnoreCase("html"))
			logfile = new LogHTML();
		else
			logfile = new LogText();
		logfile.log("Starting application...");

		System.out.println("... read in data file to analyze ...");
		// code...
		System.out.println("... Clustering data for analysis ...");
		// code...
		System.out.println("... Printing analysis results ...");
=======
		Logging logfile = LoggingFactory.createLogging(type);
		logfile.log("Starting application...");
		logfile.log("... read in data file to analyze ...");
		// code...
		logfile.log("... Clustering data for analysis ...");
		// code...
		logfile.log("... Printing analysis results ...");
>>>>>>> 0cb198646f848534e2f33d4b2f8e4b686d9eab57
		// code...
	}
}
