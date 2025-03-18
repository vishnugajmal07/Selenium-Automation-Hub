package iFrrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframe
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
			driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
			
			driver.switchTo().frame(0);
			Thread.sleep(4000);
			
		WebElement iframe1 = driver.findElement(By.cssSelector(".w-full.h-96"));
		Thread.sleep(2000);
		driver.switchTo().frame(iframe1);
		}
}
