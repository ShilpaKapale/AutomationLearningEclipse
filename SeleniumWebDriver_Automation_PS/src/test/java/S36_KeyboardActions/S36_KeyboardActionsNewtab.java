package S36_KeyboardActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S36_KeyboardActionsNewtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(e).keyUp(Keys.CONTROL).perform();

		Set<String> ids = driver.getWindowHandles();
		List<String> idl = new ArrayList(ids);
		
		driver.switchTo().window(idl.get(1));//switch to second tab
		driver.switchTo().window(idl.get(0));//switch to first tab
		
		
	}

}
