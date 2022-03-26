package week5assignment;

import java.util.Arrays;

public class AsteriskLogger implements Logger {
	public void error1(String error1) {
		char[] buf = new char[17];
		Arrays.fill(buf, '*');
		for (int i = 0; i < 1; i++)
		    System.out.println(buf);
	}
	
	@Override
	public void log(String log) {
	String asterisk = new String();
	System.out.println(asterisk.toString() +  log);
	}

	@Override
	public void error(String error) {
		char[] buf = new char[17];
		Arrays.fill(buf, '*');
		for (int i = 0; i < 1; i++)
		    System.out.println(buf);
		System.out.println();

	}
		
	}


