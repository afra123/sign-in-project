package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

	public WebDriver driver;

	By openYourBookButton = By.xpath("//button[contains(text(),'Open your book')]");
	By welcomePageSideMenu = By.xpath("//a[@data-sidemenu-toggle]");
	By signOutLink = By.linkText("Sign out");

	public WelcomePage(WebDriver driver) {

		this.driver = driver;
	}

	public boolean isOpenBookYourBookButtonDisplayed() {

		return driver.findElement(openYourBookButton).isDisplayed();
	}

	public void clickWelcomePageSideMenu() {

		driver.findElement(welcomePageSideMenu).click();
	}

	public void clickSignOutLink() {

		driver.findElement(signOutLink).click();
	}
}
