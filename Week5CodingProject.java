package week5CodingProject;

import java.util.stream.Stream;

public class Week5CodingProject {

	//1. Create an interface named Logger
	public interface Logger {
	    // 2a. void method to logger interface named log
	    void log(String message);
	    
	    //2b. void method to logger interface named error
	    void error(String message);
	}

	// 3a. Create class that implement to Logger interface named AsteriskLogger
	public class AsteriskLogger implements Logger {
	    
	    //4a. Overrides the log method to display the message surrounded by asterisks
	    @Override
	    public void log(String message) {
	        System.out.println("***" + message + "***");
	    }
	    
	    //4b. Overrides the error method to display the error message surrounded by asterisks
	    @Override
	    public void error(String message) {
	        String border = "****************"; // border for the error box
	        System.out.println(border);
	        System.out.println("***Error: " + message + "***");
	        System.out.println(border);
	    }
	}

	//3b. Create class that implements to Logger interface named SpacedLogger
	public class SpacedLogger implements Logger {
	    
	    //5a. Overrides the log method to display the message with spaces between characters
	    @Override
	    public void log(String message) {
	        System.out.println(spacedOut(message));
	    }
	    
	    //5b. Overrides the error method to display the error message with spaces between characters
	    @Override
	    public void error(String message) {
	        System.out.println("ERROR: " + spacedOut(message));
	    }
	    
	    // Utility method to add spaces between each character in the message
	    private Stream<Object> spacedOut(String message) {
	        return message.chars()
	                      .mapToObj(c -> String.valueOf((char) c) + " "); // Convert each character to its spaced version
	                      
	    }

	// 6. App class which contains the main method to test our loggers
	public class App {
	    public static void main(String[] args) {
	        //6a.  Instantiate an AsteriskLogger and test
	        Logger asteriskLogger = new AsteriskLogger();
	        asteriskLogger.log("Week 5");
	        asteriskLogger.error("Error Week 5");
	    	//6b. Instantiate SpacedLogger and test
	    	Logger spacedLogger = new SpacedLogger();
	    	spacedLogger.log("Soooo tired");
	    	spacedLogger.error("I need sleep");
	}
	}
}
}
