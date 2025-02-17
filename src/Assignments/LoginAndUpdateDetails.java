package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndUpdateDetails 
{
		public static void main(String[] args) throws InterruptedException 
		{
				//Open the Browser
				ChromeDriver driver=new ChromeDriver();
				
				//Maximize the Browser
				driver.manage().window().maximize();
				
				//Enter into DWS page
				driver.get("https://demowebshop.tricentis.com/");
				
				//Login into DemoWebShop Web page
				driver.findElement(By.xpath("//a[@class=\'ico-login\']")).click();
				driver.findElement(By.xpath("//input[@id=\'Email\']")).sendKeys("vgpatil@gmail.com");
				driver.findElement(By.xpath("//input[@id=\'Password\']")).sendKeys("vg@123");
				driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				
				//Update Details 
				driver.findElement(By.xpath("//a[@class='account']")).click();
				driver.findElement(By.xpath("//input[@id='gender-male']")).click();
				
				WebElement fName = driver.findElement(By.xpath("//input[@id='FirstName']"));
				fName.clear();
				fName.sendKeys("Vishu");
				
				WebElement lName = driver.findElement(By.xpath("//input[@id='LastName']"));
				lName.clear();
				lName.sendKeys("Gajmal");
				
				WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
				email.clear();
				email.sendKeys("vgpatil@gmail.com");

				driver.findElement(By.xpath("//input[@value='Save']")).click();
				
				//Log out
				driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
				
				//Waiting Condition
				Thread.sleep(2000);
				
				//Close the Browser
				driver.close();
				
				
		}
}
