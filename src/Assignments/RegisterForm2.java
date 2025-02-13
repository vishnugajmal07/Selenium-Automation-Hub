//Register the page by using cssSelector

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm2
{
		public static void main(String[] args) throws InterruptedException
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.findElement(By.cssSelector(".ico-register")).click();
				
				driver.findElement(By.cssSelector("#gender-male")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#FirstName")).sendKeys("Vishnu");
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#LastName")).sendKeys("Gajmal");
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#Email")).sendKeys("vgpatil@gmail.com");
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("#Password")).sendKeys("vg@123");
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("vg@123");
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector(".button-1.register-next-step-button")).click();
				
				
				Thread.sleep(3000);
				driver.close();
				
				
				
				
		}
}
