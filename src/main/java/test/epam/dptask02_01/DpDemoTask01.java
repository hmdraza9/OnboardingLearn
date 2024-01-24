package test.epam.dptask02_01;

import org.openqa.selenium.WebDriver;

public class DpDemoTask01 {

	private static WebDriver driver;

	public static void main(String[] args) {

		DpDemoTask01.initiateBrowser("chrome");

	}

	private static WebDriver initiateBrowser(String browserName) {
		switch (browserName) {

		case "chrome":
			driver = MyChromeDriver.getMyChromeDriver();
			break;
		case "firefox":
			driver = MyFirefoxDriver.getMyFirefoxDriver();
			break;

		}
		return driver;
	}

}
