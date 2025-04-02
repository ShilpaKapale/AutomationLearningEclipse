package S31_HandleDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S31_HandleDropdowns3_google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bjs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'What')]")).sendKeys("tide");
		Thread.sleep(5000);
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='StyledCategorySearchSuggestionstyle__StyledCategorySearchSuggestion-sc-10i2nc1-0 cVSmGZ']//a[@auto-data='searchBar_searchRedirectedPage']"));
		System.out.println(ele.size());
//		for(int i=0;i<ele.size();i++)
//		{
//			System.out.println(ele.get(i).getText());
//			if(ele.get(i).getText().equals("tide"));
//			{
//				ele.get(i).click();
//				break;
//			}
//		}
		
		
	}

}
