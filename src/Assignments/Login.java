//Log in with the help of cssSelector()

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
		public static void main(String[] args) throws InterruptedException
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(2000);
				
				driver.findElement(By.cssSelector(".ico-login")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector(".email")).sendKeys("vgpatil@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#Password")).sendKeys("vg@123");
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("#RememberMe")).click();
				Thread.sleep(1000);
				 driver.findElement(By.cssSelector(".button-1.login-button")).click();
				 Thread.sleep(1000);
		}
}
