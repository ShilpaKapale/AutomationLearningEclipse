package S34_HandleDate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S34_HandleDate {

	static void selectfdatemonthyear(WebDriver driver,String month,String year,String date)
	{
		while(true)
		{
			
			String cmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String cyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(cmonth + cyear);
				if(cmonth.equals(month)&&cyear.equals(year))

				{
					break;
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));	
		
		for(WebElement cdate:alldates)
		{
			if(cdate.getText().equals(date))
			{
				cdate.click();
				break;
			}
		}
	}
	
	static void selectpdatemonthyear(WebDriver driver,String month,String year,String date)
	{
		while(true)
		{
			
			String cmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String cyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(cmonth + cyear);
				if(cmonth.equals(month)&&cyear.equals(year))
				{
					break;
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				}
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));	
		
		for(WebElement cdate:alldates)
		{
			if(cdate.getText().equals(date))
			{
				cdate.click();
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/25/2025");
		
		String month = "November";
		String year = "2023";
		String date = "2";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
	selectpdatemonthyear(driver,month,year,date);
	
		
		
	}

}
