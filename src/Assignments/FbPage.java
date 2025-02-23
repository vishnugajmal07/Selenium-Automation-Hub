package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbPage
{
		public static void main(String[] args) throws InterruptedException
		{
				String expected_Url="https://www.facebook.com/";
				
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
				String actual_Url=driver.getCurrentUrl();
				
				if(actual_Url.equals(expected_Url))
				{
					System.out.println("We are in the fb log in page");
					
					driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123456789");
					
					driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vg123");
					
					
					
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[contains(text(),'Log in']'])")).click();
				
					driver.close();
					
				}
				
				
		}
}
