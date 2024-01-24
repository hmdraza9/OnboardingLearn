package test.epam.dptask02_02;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriverWithCapabilities implements MyBrowserInterface {

	public WebDriver getMyChromeDriver() {

		ChromeOptions co = new ChromeOptions();
		co.addExtensions(new File("/path/to/extension.crx"));
		co.setBinary(new File("/path/to/chrome"));

		return new ChromeDriver(co);

	}

}
