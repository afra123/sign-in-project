package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

	public WebDriver driver;

	By emailLink = By.linkText("or use email »");
	By facebookLink = By.linkText("Connect with Facebook");
	By facebookEmailField = By.id("email");
	By facebookPasswordField = By.id("pass");
	By facebookLoginButton = By.id("loginbutton");
	By emailTextField = By.name("email");
	By submitButton = By.xpath("//button[@type='submit']");
	By passwordTextField = By.name("password");

	public SignInPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickSignInWithEmailLink() {

		driver.findElement(emailLink).click();
	}

	public void clickSignInWithFacebookLink() {

		driver.findElement(facebookLink).click();
	}

	public void enterFacebookEmail(String email) {

		driver.findElement(facebookEmailField).sendKeys(email);
	}

	public void enterFacebookPassword(String password) {

		driver.findElement(facebookPasswordField).sendKeys(password);
	}

	public void clickFacebookLoginButton() {

		driver.findElement(facebookLoginButton).click();
	}

	public void enterEmailTextField(String email) {

		driver.findElement(emailTextField).sendKeys(email);
	}

	public void enterPasswordTextField(String password) {
		driver.findElement(passwordTextField).sendKeys(password);
	}

	public void clckSubmitButton() {
		driver.findElement(submitButton).click();
	}
}
