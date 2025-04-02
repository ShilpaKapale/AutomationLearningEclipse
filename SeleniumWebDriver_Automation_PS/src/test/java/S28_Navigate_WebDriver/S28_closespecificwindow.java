package S28_Navigate_WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S28_closespecificwindow {
	public static void main(String[] args) {
		

	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("a[normalize-space()='OrangeHRM, Inc']")).click();
	Set<String> whs= driver.getWindowHandles();
	
	
		for(String wid:whs)
	{
		String title = driver.switchTo().window(wid).getTitle();
		System.out.println(driver.getTitle());
		if(title.equals("OrangeHRM") || title.equals("Gmail") ) 
		{
		driver.close();
		break;
		}
	}
	
	
	

}

}
