package S34_HandleDate;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S34_HandleDate1_YearisdropdownuseSelectclass {

	static Month convermonth(String month) {
		HashMap<String, Month> monthmap = new HashMap<String, Month>();
		monthmap.put("January", Month.JANUARY);
		monthmap.put("February", Month.FEBRUARY);
		monthmap.put("March", Month.MARCH);
		monthmap.put("April", Month.APRIL);
		monthmap.put("May", Month.MAY);
		monthmap.put("June", Month.JUNE);
		monthmap.put("July", Month.JULY);
		monthmap.put("August", Month.AUGUST);
		monthmap.put("September", Month.SEPTEMBER);
		monthmap.put("October", Month.OCTOBER);
		monthmap.put("November", Month.NOVEMBER);
		monthmap.put("December", Month.DECEMBER);
		
		Month vmonth = monthmap.get(month);
		if(vmonth == null)
		{
			System.out.println("Invalid Month");
		}
		
		return vmonth;
		
	}
	
	static void selectDate(WebDriver driver, String year, String month, String date)
	{

		WebElement yeardropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sltyear = new Select(yeardropdown);
		sltyear.selectByVisibleText(year);
		
		while(true)
		{
			String displaymonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			Month expectedmonth = convermonth(month);
			Month currentmonth = convermonth(displaymonth);
			
			int result = expectedmonth.compareTo(currentmonth);
			
			if(result<0)
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			else if(result>0)
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			else
			{
				break;
			}
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
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String month = "November";
		String year = "2023";
		String date = "2";
		
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		selectDate(driver,year,month,date);
	}
}

//Other website for date filed to handle
//https://dummy-tickets.com/buyticket
