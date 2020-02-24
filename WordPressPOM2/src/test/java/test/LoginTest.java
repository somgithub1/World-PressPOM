package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import loginAndPosting.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test

	public void validUserShouldBeAbleToLogin() throws InterruptedException {

		WebDriver driver = BrowserFactory.startBrowser();
		LoginPage loginToTheSite = PageFactory.initElements(driver, LoginPage.class);
		loginToTheSite.login();
		
		loginToTheSite.validateLogin();
		
		
	}

}
