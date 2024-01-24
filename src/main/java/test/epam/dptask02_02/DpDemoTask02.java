package test.epam.dptask02_02;

import org.openqa.selenium.WebDriver;

public class DpDemoTask02 {

	private static WebDriver driver;

	public static void main(String[] args) {

		DpDemoTask02.initiateBrowser("chrome");

	}

	private static WebDriver initiateBrowser(String browserName) {
		switch (browserName) {

		case "chrome":
			driver = new MyChromeDriver().getMyChromeDriver();
			break;
		case "firefox":
			driver = new MyFirefoxDriver().getMyFirefoxDriver();
			break;
		case "chromeOPT":
			driver = new MyChromeDriverWithCapabilities().getMyChromeDriver();
			break;

		}
		return driver;
	}

}
