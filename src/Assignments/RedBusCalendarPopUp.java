package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusCalendarPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expected_Url = "https://www.redbus.in/";
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		String actual_Url = driver.getCurrentUrl();
		if (expected_Url.equals(actual_Url)) 
		{
			driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Sailu");
			Thread.sleep(2000);
			
			WebElement date = driver.findElement(By.xpath("//div[@id='onwardCal']"));
			date.click();
			Thread.sleep(3000);
			
			
			for(;;)
			{
				try
				{
					driver.findElement(By.cssSelector(".DayTiles__CalendarDaysSpan-sc-1xum02u-1.dkWAbH")).click();
					break;
				} 
				catch (Exception e)
				{
					driver.findElement(By.xpath("//div[@class='sc-jzJRlG hrJoeL']/div/div/div/div[3]")).click();
				}
			}
			String text = driver.findElement(By.cssSelector(".sc-kAzzGY.cCrHkP")).getText();
			System.out.println(text);
		}
		else
		{
			System.out.println("We are not in redbus page");
		}
		
		
		
		
	}
}
