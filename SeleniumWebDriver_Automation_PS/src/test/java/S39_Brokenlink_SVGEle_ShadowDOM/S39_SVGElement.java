package S39_Brokenlink_SVGEle_ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S39_SVGElement {
//ShadowDom can't be handled by xpath hence use selector hub for css selector
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		//Using relative xpath using span tag
		//driver.findElement(By.xpath("//button[normalize-space()='Time']")).sendKeys("Admin");
		//Using svg element from selector hub
		driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']")).click();
	
	}

}
