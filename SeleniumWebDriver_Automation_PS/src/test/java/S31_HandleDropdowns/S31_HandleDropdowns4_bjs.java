package S31_HandleDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S31_HandleDropdowns4_bjs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++)
		{
			System.out.println(ele.get(i).getText());
			if(ele.get(i).getText().equals("selenium dev"));
			{
				ele.get(i).click();
				break;
			}
		}
		
		
	}

}
