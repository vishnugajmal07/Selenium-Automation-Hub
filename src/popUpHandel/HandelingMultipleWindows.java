package popUpHandel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandelingMultipleWindows 
{
		public static void main(String[] args) throws InterruptedException 
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("disable-notifications");
			
			String barbequeUrl = "https://www.barbequenation.com/";
			String oliveUrl = "https://www.olivegarden.com/home";
			String gialloUrl = "https://www.giallozafferano.com/";
			
			WebDriver driver=new ChromeDriver(options);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("file:///C:/Users/Dell/Downloads/MultipleWindow%20(1).html");
			Thread.sleep(2000);
			String pHandel = driver.getWindowHandle();
			driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
			
			Thread.sleep(7000);
			
			Set<String> childHandels = driver.getWindowHandles();
			childHandels.remove(pHandel);
			for (String str : childHandels) 
			{
				driver.switchTo().window(str);
				Thread.sleep(2000);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				String actualUrl = driver.getCurrentUrl();
				
				if(barbequeUrl.equals(actualUrl))
				{
					System.out.println("we are in BarbeQue");
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//button[@id='hapiness-cart-btn'])[2]/following-sibling::button")).click();
					Thread.sleep(2000);
					driver.close();
					
				}
				else if(oliveUrl.equals(actualUrl))
				{
					System.out.println("We are in olive web page");
					 Thread.sleep(2000);
					 driver.findElement(By.xpath("//button[text()='Reject']")).click();
					 Thread.sleep(3000);
					 driver.findElement(By.xpath("//a[text()='Order Now']")).click();
					 Thread.sleep(2000);
					 driver.close();
				}
				else if (gialloUrl.equals(actualUrl)) 
				{
					System.out.println("we are in giallo");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[text()='I Accept']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Baked pasta");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@name='submit']")).click();
					Thread.sleep(2000);
					driver.close();
				}
				else
				{
					System.out.println("Something went wrong");
				}
			}
			
			
		}
}
