package signInProject;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.TestData;
import pageObjects.HomePage;
import pageObjects.SignInPage;
import pageObjects.WelcomePage;
import resources.TestBase;

public class SignInWithFacebookTest extends TestBase {

	@Test
	public void signInWithFacebook() throws IOException {
		driver = initializeWebDriver();

		HomePage homePage = new HomePage(driver);
		SignInPage signInPage = new SignInPage(driver);
		WelcomePage welcomePage = new WelcomePage(driver);
		TestData testData = new TestData(driver);

		homePage.clickSideMenu();
		homePage.clickSignInLink();

		// Get handles of the windows
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				signInPage.clickSignInWithFacebookLink();
				signInPage.enterFacebookEmail(testData.email);
				signInPage.enterFacebookPassword(testData.password);
				signInPage.clickFacebookLoginButton();
				driver.switchTo().window(mainWindowHandle);
				Assert.assertTrue(welcomePage.isOpenBookYourBookButtonDisplayed());
				welcomePage.clickWelcomePageSideMenu();
				welcomePage.clickSignOutLink();
				driver.quit();
			}
		}
	}
}