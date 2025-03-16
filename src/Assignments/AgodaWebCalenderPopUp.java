package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgodaWebCalenderPopUp 
{
		public static void main(String[] args) throws InterruptedException 
		{
			String expexted_url = "https://www.agoda.com/";
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.agoda.com/");
			Thread.sleep(2000);
			
			String actual_url = driver.getCurrentUrl();
			if(actual_url.contains(expexted_url))
			{
				System.out.println("I am in agoda page");
				driver.findElement(By.xpath("//div[@id='check-in-box']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[@data-selenium-date='2025-03-26']")).click();
				Thread.sleep(3000);
				
				
				for(;;)
				{
					try 
					{
						driver.findElement(By.xpath("//span[@data-selenium-date='2025-07-17']")).click();
						break;
					} catch (Exception e)
					{
						driver.findElement(By.xpath("//button[@data-selenium='calendar-next-month-button']")).click();
					}
				}
				
			}
			else
			{
				System.out.println("I am not in agoda page");
			}
			
			driver.close();
			
		}
}
