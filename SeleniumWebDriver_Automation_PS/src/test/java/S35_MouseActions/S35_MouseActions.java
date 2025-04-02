package S35_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S35_MouseActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com");
		driver.manage().window().maximize();
		
	WebElement e =driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement e1 =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
	Actions  act = new Actions(driver);
	act.moveToElement(e).moveToElement(e1).click().build().perform();
	}

}
