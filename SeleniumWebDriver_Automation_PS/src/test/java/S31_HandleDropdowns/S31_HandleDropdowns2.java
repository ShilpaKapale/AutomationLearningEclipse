package S31_HandleDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S31_HandleDropdowns2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-contact']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orange-hrm-full-width-grid']/div[6]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[normalize-space()='Finacial Analyst']")).click();
	List<WebElement> ele=driver.findElements(By.xpath("//div[@role='listbox'//span]"));
	for(WebElement op:ele)
	{
		System.out.println(op.getText());
	}
	}

}
