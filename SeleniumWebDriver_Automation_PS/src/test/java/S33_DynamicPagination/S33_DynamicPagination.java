package S33_DynamicPagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S33_DynamicPagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement pass= driver.findElement(By.xpath("//input[@id='input-password']"));
		pass.clear();
		pass.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed());
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int totalpages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
			
		for(int p=1;p<=5;p++)
		{
			if(p>1)
			{
				WebElement pages=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				pages.click();
				Thread.sleep(3000);
			}

		int rows =driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		
		for(int i=1;i<=rows;i++)
		{
			String customername = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[2]")).getText();
			String customeremail = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[3]")).getText();
			System.out.println(customername+"\t"+customeremail);
		}
	}
	
	}

}
