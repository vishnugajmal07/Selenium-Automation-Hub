package iFrrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeQspiders
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		
		WebElement mainFrame = driver.findElement(By.xpath("//div[contains(@class,'px-8 pt-8')]/iframe"));
		
		driver.switchTo().frame(mainFrame);
		Thread.sleep(4000);
		
		WebElement nIframe = driver.findElement(By.xpath("(//div[@class='form_container'])[2]/iframe"));
		Thread.sleep(3000);
		driver.switchTo().frame(nIframe);
		System.out.println("We are in the another frame");
			
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.findElement(By.id("confirm-password")).sendKeys("vishu12");
		Thread.sleep(1000);
		
		driver.findElement(By.id("submitButton")).click();
		
		
	}
}
