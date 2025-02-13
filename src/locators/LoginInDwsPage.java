package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInDwsPage 
{
		public static void main(String[] args) throws InterruptedException 
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.findElement(By.linkText("Log in")).click();
				
				driver.findElement(By.id("Email")).sendKeys("vgpatil@gmail.com");
				
				driver.findElement(By.id("Password")).sendKeys("vg@123");
				
				driver.findElement(By.id("RememberMe")).click();
				
//				driver.findElement(By.cssSelector("input[value='Log in']")).click();
				
				driver.findElement(By.cssSelector(".button-1.login-button")).click();
				
				
		}
}
