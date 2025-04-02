package S28_Navigate_WebDriver;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S28_Closewindowspecificbysearch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement>  e = driver.findElements(By.xpath("//a[@target='_blank' and normalize-space()='Selenium']"));
		//List<WebElement>  e = driver.findElements(By.partialLinkText("Selenium"));
		System.out.println(e.size());
		
		//driver.findElement(By.xpath("a[normalize-space()='OrangeHRM, Inc']")).click();
		//Set<String> whs= driver.getWindowHandles();
	}

}
