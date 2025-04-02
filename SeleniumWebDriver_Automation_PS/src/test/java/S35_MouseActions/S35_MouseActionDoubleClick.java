package S35_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S35_MouseActionDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(e).build().perform();
	}

}
