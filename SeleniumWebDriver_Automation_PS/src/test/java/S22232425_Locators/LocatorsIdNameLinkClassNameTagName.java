package S22232425_Locators;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIdNameLinkClassNameTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		boolean displaylogo = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(displaylogo);
		
		driver.findElement(By.linkText("Tablets")).click();
		
		driver.findElement(By.partialLinkText("PDAs")).click();
		
		List<WebElement> headerlinks = driver.findElements(By.className("list-inline"));
		
		System.out.println("All header links: "+headerlinks.size());	
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links: "+links.size());	
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total no of images: "+images.size());	
		}

}
