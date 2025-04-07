package S39_Brokenlink_SVGEle_ShadowDOM;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S39_BrokenLink {

	public static void main(String[] args) throws IOException {
			
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.deadlinkcity.com");
			driver.manage().window().maximize();
			
			List<WebElement> link = driver.findElements(By.tagName("a"));
			System.out.println(link.size());
			int noblinks=0;
			for(WebElement blink:link)
			{
				String hlink = blink.getAttribute("href");
				if(hlink==null || hlink.isEmpty())
				{
					System.out.println("No broken link");
				}
				try
				{
				URL linkurl = new URL(hlink);
				HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();
				conn.connect();
				
				if(conn.getResponseCode()>=400)
				{
					System.out.println(hlink + "Broken link");
					noblinks++;
				}
				else
				{ 
					System.out.println(hlink + "Not a broken link");
				}
			}
			catch(Exception e) 
			{
			System.out.println(e);
			}
		}
			System.out.println("No of broken links: " + noblinks);	
	
			}
}
