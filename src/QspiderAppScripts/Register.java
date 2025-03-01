package QspiderAppScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register 
{
		static ChromeDriver driver=null;
		
		public static void precondition() throws InterruptedException 
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[text()='Explore more'])[1]")).click();
		}
		
		public static void register() throws InterruptedException 
		{
			driver.findElement(By.id("name")).sendKeys("Vishnu");
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys("vgpatil@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("vg@123");
			Thread.sleep(1000);					
		}
		
		public static void postCondition()
		{
				driver.close();
		}
}
