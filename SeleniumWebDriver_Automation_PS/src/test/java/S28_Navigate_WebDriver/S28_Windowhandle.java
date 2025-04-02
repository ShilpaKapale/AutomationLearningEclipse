package S28_Navigate_WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S28_Windowhandle {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> Swhs= driver.getWindowHandles();
		
		List<String> Lwhs=new ArrayList(Swhs);
		
		String parentid=Lwhs.get(0);
		String childid=Lwhs.get(1);
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		for(String wid:Lwhs)
		{
			String title = driver.switchTo().window(wid).getTitle();
			if(title.equals("OrangeHRM")) 
			{
			System.out.println(driver.getCurrentUrl());
			}
		}
		
		
		

	}

}
