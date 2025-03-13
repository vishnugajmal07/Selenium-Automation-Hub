package popUpHandel;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(2000);
		
		WebElement wordPDF = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(1000);
		wordPDF.sendKeys("C:\\Users\\Dell\\Desktop\\sql\\xpath.txt");
	}
}
