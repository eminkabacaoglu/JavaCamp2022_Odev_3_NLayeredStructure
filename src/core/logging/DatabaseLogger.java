package core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String logMessage) {
		System.out.println("Logged to Database: "+ logMessage);
		
	}

}
