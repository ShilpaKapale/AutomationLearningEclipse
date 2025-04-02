package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Basicprogram {
	public static void main(String args[])
	{
		System.out.println("WelCome");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
	}

}
