package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	WebDriver driver;

	public static WebDriver startBrowser () {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		
	return driver;
		
	
	}
	
	
}
