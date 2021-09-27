package resources;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver initializeWebDriver() throws IOException {

		// execute in chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// To maximize browser
		driver.manage().window().maximize();
		
		// To navigate to the website
		driver.get("https://moments.pastbook.com/");
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}
}
