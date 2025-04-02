package S32_AutoSuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S32_StaticWebtabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		System.out.println(cols);
		
		WebElement v = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]"));
		System.out.println(v.getText());
		
		for(int r =2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		for(int r =2;r<=rows;r++)
		{
			String author =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
				if(author.equals("Mukesh"))
				{
					String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();	
					System.out.println(book +"\t"+ author);
				}
		}
		int total=0;
		for(int r =2;r<=rows;r++)
		{
			String price =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
				total=total+Integer.parseInt(price);
		}
		System.out.println(total);
	}
}
