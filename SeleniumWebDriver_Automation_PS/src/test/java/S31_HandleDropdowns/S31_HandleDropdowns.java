package S31_HandleDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S31_HandleDropdowns {
//Dropdown has select tag below code is usefull
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropelm = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropselect= new Select(dropelm);
		
		dropselect.selectByVisibleText("France");
		dropselect.selectByValue("japan");
		dropselect.selectByIndex(3);
		List<WebElement> dropOptions =dropselect.getOptions();
		
		int Osize = dropOptions.size();
		
		for(int i=0;i<Osize;i++)
		{
			System.out.println(dropOptions.get(i).getText());
		}
		
//		for(WebElement e:dropOptions)
//		{
//			String Optionstext = e.getText();
//			System.out.println(Optionstext);
//		}

	}

}
