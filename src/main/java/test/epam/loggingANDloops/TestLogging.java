package test.epam.loggingANDloops;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogging {

	private static final Logger log = LogManager.getLogger(TestLogging.class);

	public static void loggingDemo() {

		System.out.println("Logging starts");
		log.info("This is logging in info");
		log.error("This is logging in error");
		log.warn("This is logging in warn");

	}
}
