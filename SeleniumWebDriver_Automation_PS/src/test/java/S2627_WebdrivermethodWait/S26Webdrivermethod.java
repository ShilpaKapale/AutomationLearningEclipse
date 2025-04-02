package S2627_WebdrivermethodWait;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S26Webdrivermethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		Set<String> whs = driver.getWindowHandles();
		System.out.println(whs);
		
		
		
	}

}
