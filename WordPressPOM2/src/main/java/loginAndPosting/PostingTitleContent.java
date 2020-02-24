package loginAndPosting;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.AfterMethod;

public class PostingTitleContent {
	WebDriver driver;

	public PostingTitleContent(WebDriver driver) {
		this.driver = driver;
	}
	// Elements Library

	@FindBy(how = How.ID, using = ("title"))
	WebElement QUICK_DRAFT_TITLE;
	@FindBy(how = How.ID, using = ("content"))
	WebElement QUICK_DRAFT_CONTENT;
	@FindBy(how = How.ID, using = ("save-post"))
	WebElement SAVE_DRAFT_BUTTON;
	@FindBy(how = How.XPATH, using = ("//h2[contains(text(), 'Your Recent Drafts')]"))
	WebElement RECENT_DRAFTS;

	Random rnd = new Random();
	int num = rnd.nextInt(1000);

	public void postTitleAndContent() throws InterruptedException {
		QUICK_DRAFT_TITLE.sendKeys("Title" + num);
		QUICK_DRAFT_CONTENT.sendKeys("Content" + num);
		SAVE_DRAFT_BUTTON.click();
		Thread.sleep(5000);
	}

	public void validatePost() {
		boolean isDisplayed = RECENT_DRAFTS.isDisplayed();
		if (isDisplayed) {
			System.out.println("Draft Saved!");
		} 
		else {
			System.out.println("Not Saved!");
		}
	}

	@AfterMethod
	public void closeDriver() {

		driver.close();
		driver.quit();
	}
}
