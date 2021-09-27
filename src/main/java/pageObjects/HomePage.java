package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;

	By sideMenu = By.xpath("//span[@class='icon-hamburger-animated']");
	By signInLink = By.linkText("Sign in");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSideMenu() {

		driver.findElement(sideMenu).click();
	}

	public void clickSignInLink() {

		driver.findElement(signInLink).click();
	}
}
