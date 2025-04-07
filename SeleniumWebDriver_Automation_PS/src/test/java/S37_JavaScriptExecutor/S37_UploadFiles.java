package S37_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S37_UploadFiles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("E:\\TestingAcademy\\Untitled.txt");
//				
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Untitled.txt"))
//		{
//			System.out.println("Done");
//		
//		}
//		else
//		{
//			System.out.println("Not done");
//		}
		
		String file1= "E:\\TestingAcademy\\Untitled.txt";
		String file2="E:\\TestingAcademy\\Testcheck.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int number = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(number==2)
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("not donw");
		}
	if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Untitled.txt") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Testcheck.txt"))
	{
		System.out.println("File matching");
	}
	else
	{
		System.out.println("Not matching");
	}
	
	
	}

}
