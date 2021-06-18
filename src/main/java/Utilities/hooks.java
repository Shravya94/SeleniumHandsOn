package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	public static WebDriver driver;
	public static Actions action;

	@Before
	public void beforeScenario() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\SDET-Shravya\\SDET\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ShravyaRai\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		System.out.println("This will run before Scenario");
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		action = new Actions(driver);

	}

	@After
	public void afterScenario() {
		System.out.println("This will run after Scenario");
		driver.quit();
	}

}
