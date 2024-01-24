package test.epam.dptask02_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver implements MyBrowserInterface {

	@Override
	public WebDriver getMyChromeDriver() {
		return new ChromeDriver();
	}

}
