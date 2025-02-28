package utilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
		static ChromeDriver driver=null;
		
		public static void precondition() throws InterruptedException 
		{
			driver=new ChromeDriver();
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");			
		}
		
		public static void login() 
		{
				driver.findElement(By.className("ico-login")).click();
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vgpatil@gmail.com");
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vg@123");
				driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
				
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		
		public static void logout()
		{
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
		}
		
		public static void postCondition() 
		{
			driver.close();
		}
}
