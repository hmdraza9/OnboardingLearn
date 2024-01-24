package test.epam.dptask02_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver {

	public static WebDriver getMyFirefoxDriver() {

		System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");

		return new FirefoxDriver();
	}

}
