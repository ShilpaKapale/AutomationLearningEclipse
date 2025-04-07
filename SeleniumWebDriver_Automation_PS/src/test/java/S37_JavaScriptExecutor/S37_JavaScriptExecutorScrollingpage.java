package S37_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S37_JavaScriptExecutorScrollingpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
		
		Thread.sleep(3000);
		js.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		
		//Scroll down page by pixel number
		js.executeScript("window.scrollBy(0,1500)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//Scroll down page till news  is visible
		
		WebElement e = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();","e");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	
		//Scroll at end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	
		//Scroll at initial of page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}

}
