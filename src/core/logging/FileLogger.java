package core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String logMessage) {
		System.out.println("Logged to File: "+ logMessage);
		
	}
	

}
