package S31_HandleDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S31_HandleDropdowns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
	List<WebElement> Alloptions	= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		for(WebElement op:Alloptions)
		{
			String Toption = op.getText();
			System.out.println(Toption);
			if(!op.isSelected())
				//Or
		//	if(op.getText().equals("C#")||op.getText().equals("Python")||op.getText().equals("MySQL"))
			{
				op.click();
			}
		}
	}

}
