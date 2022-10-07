package core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String logMessage) {
		System.out.println("Log is send as Mail: "+ logMessage);
		
	}

}
