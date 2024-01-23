package test.epam.DesPatternTask01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MultithreadingDemo extends Thread {
	
	private static final Logger log = LogManager.getLogger(MultithreadingDemo.class);
	
	public void run() {
		try {
			// Displaying the thread that is running
//			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
			log.info("Thread ID: " + Thread.currentThread().getId() + ", Instance: "
					+ CandyMaker.getInstance().hashCode());
			
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Main Class
public class Multithread {
	public static void main(String[] args) {
		int n = 1; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
	}
}