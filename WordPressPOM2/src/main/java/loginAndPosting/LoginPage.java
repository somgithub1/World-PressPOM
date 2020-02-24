package loginAndPosting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterMethod;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

//Elements Library
	@FindBy(how = How.XPATH, using = ("//input[@id='user_login']"))
	WebElement USER_NAME;
	@FindBy(how = How.XPATH, using = ("//input[@id='user_pass']"))
	WebElement PASSWORD;
	@FindBy(how = How.XPATH, using = ("//input[@id='wp-submit']"))
	WebElement LOGIN_BUTTON;
	@FindBy(how = How.XPATH, using = "//h1[contains(text(), 'Dashboard')]")
	WebElement DASHBOARD;

	public void login() throws InterruptedException {
		USER_NAME.sendKeys("opensourcecms");
		PASSWORD.sendKeys("opensourcecms");
		LOGIN_BUTTON.click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void validateLogin() {

		boolean isDisplayed = DASHBOARD.isDisplayed();
		{
			if (isDisplayed) {
				System.out.println("successful");
			} else {
				System.out.println("not Good");
			}
			driver.close();
			driver.quit();

		}
	}
}