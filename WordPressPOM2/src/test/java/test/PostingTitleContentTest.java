package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import loginAndPosting.LoginPage;
import loginAndPosting.PostingTitleContent;
import util.BrowserFactory;

public class PostingTitleContentTest {
	WebDriver driver;

	@Test

	public void userShoulBeAbleToPost() throws InterruptedException {
		WebDriver driver = BrowserFactory.startBrowser();
		LoginPage loginToTheSite = PageFactory.initElements(driver, LoginPage.class);
		loginToTheSite.login();
		Thread.sleep(5000);
		PostingTitleContent postTitleContent = PageFactory.initElements(driver, PostingTitleContent.class);
		postTitleContent.postTitleAndContent();
		Thread.sleep(3000);
		postTitleContent.validatePost();
		postTitleContent.closeDriver();
	}

}
