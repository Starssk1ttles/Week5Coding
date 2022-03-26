package week5assignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		logger.error1(null);
		logger.log("***Error:Hello***");
		logger.error(null);
		
		Logger logger1 = new SpacedLogger();
		logger1.error("Error:");
		logger1.log("Hello");
	
		
		
	}

}
