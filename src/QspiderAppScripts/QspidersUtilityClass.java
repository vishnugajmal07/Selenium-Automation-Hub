package QspiderAppScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QspidersUtilityClass 
{
		protected static WebDriver driver=null;
		
		public static void preCondition(String browser) throws InterruptedException
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
			}
			 else if (browser.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
			} 
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else
			{
				driver=new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://demoapps.qspiders.com/");
			Thread.sleep(1000);
		}
		
		public static void registerWithPlaceholder() throws InterruptedException
		{
			driver.findElement(By.xpath("//li[text()='With placeholder']")).click();
			driver.findElement(By.id("name")).sendKeys("Vishnu");
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys("vishu12@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vishnu@123");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
}
