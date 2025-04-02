package S22232425_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpath {
			public static void main(String[] args) {
				
			WebDriver driver = new ChromeDriver();//cltrl+shift+o
			driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();
			
			//xpath single attribute
			driver.findElement(By.xpath("//input[@id='toc_filter_input']")).sendKeys("installation");
			
			//xpath with multiple attribute without AND
			driver.findElement(By.xpath("//input[@id='toc_filter_input'][@placeholder='Enter here to filter...']")).sendKeys("installation");
			
			//xpath with multiple attribute with AND
			driver.findElement(By.xpath("//input[@id='toc_filter_input' and @placeholder='Enter here to filter...']")).sendKeys("installation");
			
			//xpath with multiple attribute with OR
			driver.findElement(By.xpath("//input[@id='toc_filter_input' or @placeholder='Enter here to search...']")).sendKeys("installation");
			
			//xpath with inner text i.e. text() method
			driver.findElement(By.xpath("//a[text()='Improve this Doc']")).click();
			
			//xpath with inner text for text filed in page
			String textvalue = driver.findElement(By.xpath("//h1[text()='nopCommerce Documentation']")).getText();
			System.out.println(textvalue);
			
			//xpath with contains() - here we can give any chara from the attribute
			driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Cloud");
			
			//xpath with start-with()
			driver.findElement(By.xpath("//input[start-with(@placeholder,'Sea')]")).sendKeys("Cloud");
			
			//xpath for handling dynamic attribute i.e. id="start" , id="stop"
			//input[@id='start' and @id='stop'];
			//input[contains(@id,'st')];
			//input[start-with(@id,'st')];
			
			//chained xpath
			boolean x = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
			System.out.println(x);
			
			//example
			//<div></div>
			//xpath is : //div[contains(text(),'')]
		//xpath also can be : //div[contains(.,'')]
			
			
			
			}
}
