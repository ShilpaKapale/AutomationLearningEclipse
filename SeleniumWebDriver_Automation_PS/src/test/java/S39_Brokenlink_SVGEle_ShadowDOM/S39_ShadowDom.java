package S39_Brokenlink_SVGEle_ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S39_ShadowDom {
//ShadowDom can't be handled by xpath hence use selector hub for css selector
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.deadlinkcity.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#input")).sendKeys("Welcome");//No such element exception
		
		//This Element is inside single shadow DOM.

		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");

	}

}
