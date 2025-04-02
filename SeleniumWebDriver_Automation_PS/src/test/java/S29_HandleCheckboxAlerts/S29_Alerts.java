package S29_HandleCheckboxAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S29_Alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://testautomationpractice.blogspot.com/");
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		//Normal alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		//Confirmation alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert calert = driver.switchTo().alert();
		//calert.accept();
		calert.dismiss();
		//Prompt alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert palert=driver.switchTo().alert();
		palert.sendKeys("Selenium");
		palert.accept();
	}

}
