package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm
{
		public static void main(String[] args) throws InterruptedException 
		{
			 String expected_Url="https://demowebshop.tricentis.com/";
			 ChromeDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 
			 driver.get("https://demowebshop.tricentis.com/");
			 
			String actual_Url=driver.getCurrentUrl();
			
			if(expected_Url.equals(actual_Url))
			{
				System.out.println("We are in DWS page");
				
				driver.findElement(By.className("ico-register")).click();
				driver.findElement(By.id("gender-male")).click();
				driver.findElement(By.id("FirstName")).sendKeys("Vishnu");
				driver.findElement(By.id("LastName")).sendKeys("Gajmal");
				driver.findElement(By.id("Email")).sendKeys("vgpatil@gmail.com");
				
				driver.findElement(By.id("Password")).sendKeys("vg@123");
				driver.findElement(By.id("ConfirmPassword")).sendKeys("vg@123");
				
				driver.findElement(By.id("register-button")).click();
				
			}
			else
			{
				System.out.println("We are not in dws page");
			}
			
			Thread.sleep(10000);
			
			driver.close();
		}
}
