package S36_KeyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class S36_TwoWindowSelenium4 {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com");
		driver.switchTo().newWindow(WindowType.TAB);//open new tab
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
}
}
