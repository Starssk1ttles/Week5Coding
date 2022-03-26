package week5assignment;

public class SpacedLogger implements Logger {



	@Override
	public void error(String error) {
		error = "Error:";
		error = String.join(" ", error.split(""));
		System.out.println(error);
		
	}


	@Override
	public void log(String Log) {
		Log = "Hello";
		Log = String.join(" ", Log.split(""));
		System.out.println(Log);
	}


	@Override
	public void error1(String error1) {

		
		
	}
}
