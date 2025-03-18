package iFrrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1Dream11
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/");
		
//		by using index
//		driver.switchTo().frame(0);
		
//		by using String --id || name Value
//		driver.switchTo().frame("send-sms-iframe");
		
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
//		Using webelement
		driver.switchTo().frame(iFrame);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='txtField']/input")).sendKeys("1234567");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//div[@id='hamburger']")).click();
		
		
	}

}
