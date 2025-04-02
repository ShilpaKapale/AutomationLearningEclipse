package S35_MouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S35_MouseActionRightClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement e =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(e).build().perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		driver.switchTo().alert().accept();
		//myalert.accept();
	}

}
