package S22232425_Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Css :Its a cascading style sheets so normally this is used for designing 
//webpage more attractive way
//developers apply color, size, style, font, alignment by using CSS.
//So by using CSS selector locator method we can locate css elements
//in combination of attributes like tag and class.
//CSS selector locators are used for complex webapplication having the attributes
//tag#id
//tag.classname
//tag[attribute='value']
//tag.classname[attribute="value"]

public class LocatorsCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.nopcommerce.com/en/index.html");
		driver.manage().window().maximize();
		//tag#id
		driver.findElement(By.cssSelector("input#search-query")).sendKeys("Installation");
		//tag.classname
		boolean logodisplay = driver.findElement(By.cssSelector("div.header-logo")).isDisplayed();
		System.out.println(logodisplay);
		//tag[attribute='value']
		WebDriver driver1 = new FirefoxDriver();
		driver.get("https://www.nopcommerce.com/en/web-api");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value='Add to cart']"));
		//tag.classname[attribute="value"]
		driver.findElement(By.cssSelector("input.textbox[name='product_attribute_31']")).sendKeys("http://google.com");
		//Two attribute using add is possible by xpath locator
		driver.findElement(By.xpath("//input[@name='product_attribute_31' and @class='textbox']"));
		
	}

}
