package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilityClass.*; 

public class RegisterUsingActionClassMethods extends DwsBaseClass
{
		public static void main(String[] args) 
		{
			precondition("edge");
			
			Actions act=new Actions(driver);
			WebElement register = driver.findElement(By.className("ico-register"));
			if (register.isEnabled()) 
			{
				System.out.println("Register btn is Enabled");
				act.click(register).perform();
				
				WebElement gender = driver.findElement(By.id("gender-male"));
				WebElement fname = driver.findElement(By.id("FirstName"));
				WebElement lname = driver.findElement(By.id("LastName"));
				WebElement email = driver.findElement(By.id("Email"));
				
				WebElement pass = driver.findElement(By.id("Password"));
				WebElement conformPass = driver.findElement(By.id("ConfirmPassword"));
				
				WebElement registerBtn = driver.findElement(By.id("register-button"));
				
				act.click(gender).sendKeys(fname, "Vishnu").sendKeys(lname, "Gajmal").sendKeys(email, "vgpatil123@gmail.com").sendKeys(pass, "vgpatil12").sendKeys(conformPass, "vgpatil12").click(registerBtn).perform();

			} 
			else 
			{
				System.out.println("Register is Disabled");
			}
			
			driver.quit();
			
		}
}
