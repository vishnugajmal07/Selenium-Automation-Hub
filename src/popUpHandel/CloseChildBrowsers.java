package popUpHandel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CloseChildBrowsers
{
	public static void main(String[] args) throws InterruptedException 
	{
		String oliveUrl = "https://www.olivegarden.com/home";
		EdgeOptions options=new EdgeOptions();
		options.addArguments("disable-notifications");
		
		WebDriver driver=new EdgeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Dell/Downloads/MultipleWindow%20(1).html");
		Thread.sleep(1000);
		String pHandel = driver.getWindowHandle();
		System.out.println(pHandel);
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click(); 
		Thread.sleep(3000);
		
		Set<String> childHandels = driver.getWindowHandles();
		Thread.sleep(2000);
		childHandels.remove(pHandel);
		Thread.sleep(3000);
		
		System.out.println(childHandels);
		
		for (String str : childHandels) 
		{
			  driver.switchTo().window(str);
			  Thread.sleep(3000);
			  String actualUrl = driver.getCurrentUrl();
			 
			 if(oliveUrl.equals(actualUrl))
			 {
				 
				 driver.manage().window().maximize();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//button[text()='Reject']")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.xpath("//li[@id='header-login-link']")).click();
				 
				 Thread.sleep(10000);
				 driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("vishnu@gmail.com");
				 Thread.sleep(1000);
				 driver.findElement(By.id("password")).sendKeys("vishu@123");
				 
			 
			 }
			 else 
			 {
				 driver.close();
			}
			 
		}
		Thread.sleep(5000);
		
		driver.switchTo().window(pHandel);
		driver.close();
		
	}

}
