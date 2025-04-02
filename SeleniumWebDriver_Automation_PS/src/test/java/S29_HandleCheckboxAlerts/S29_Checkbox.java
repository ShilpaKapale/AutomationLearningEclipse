package S29_HandleCheckboxAlerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S29_Checkbox {
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	//driver.get("https://testautomationpractice.blogspot.com/");
	driver.navigate().to("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='sunday']")).click();
	
	List<WebElement> e = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//	for(int i=0;i<e.size();i++)
//	{
//		e.get(i).click();
//	}
	
		for(WebElement chkbx:e)
			{
				chkbx.click();
			}
	//select last 3 box
	for(int i=4;i<e.size();i++)
		{
			e.get(i).click();
		}
	//select first 3 box 
	for(int i=0;i<3;i++)
	{
		e.get(i).click();
	}
	//For unselecting
	for(int i=0;i<e.size();i++)
	{
		if(e.get(i).isSelected());
		{
			e.get(i).click();
		}
		
	}
	
	
	
}
}
