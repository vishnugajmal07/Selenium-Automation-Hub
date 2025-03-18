package iFrrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultIframes 
{
	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//section[text()='Frames']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//section[text()='iframes']")).click();
			driver.findElement(By.xpath("//a[text()='Default']")).click();
			
			driver.switchTo().frame(0);
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("vishu12");
			driver.findElement(By.id("password")).sendKeys("vg@123");
			
			driver.findElement(By.id("submitButton")).sendKeys("vg@123");
			
	}
}
