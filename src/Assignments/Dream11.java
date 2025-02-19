package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11
{
		public static void main(String[] args) throws InterruptedException
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.dream11.com/");
				
				Thread.sleep(2000);
				
				driver.switchTo().frame(0); // Switch to the first iframe
				driver.findElement(By.xpath("//div[@class='txtField']/input")).sendKeys("1234567");
				driver.switchTo().defaultContent();	
				
		}
}
