package test.epam.dptask02_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver {

	public WebDriver getMyFirefoxDriver() {

		System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");

		return new FirefoxDriver();
	}

}
