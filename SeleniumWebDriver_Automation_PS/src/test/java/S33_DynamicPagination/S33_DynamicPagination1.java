package S33_DynamicPagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S33_DynamicPagination1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int col = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[1]//td")).size();
		int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		String Customername =driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[3]//td[2]")).getText();
		driver.findElement(By.xpath("//ul[@class='pagination']//*[text()='3']")).click();
	}

}
