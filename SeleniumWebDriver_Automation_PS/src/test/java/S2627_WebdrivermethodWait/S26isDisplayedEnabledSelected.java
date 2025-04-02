package S2627_WebdrivermethodWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S26isDisplayedEnabledSelected {
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/register");
			
			driver.manage().window().maximize();
			
			WebElement e =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			System.out.println(e.isDisplayed());
			
			boolean b =driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
			System.out.println(b);
			
			
			WebElement male=driver.findElement(By.xpath("//input[@id='gender-male' and @type='radio']"));
			
			male.click();
			
			System.out.println(male.isSelected());
			
			
			
			
			
			
			
			
			
		}
}
