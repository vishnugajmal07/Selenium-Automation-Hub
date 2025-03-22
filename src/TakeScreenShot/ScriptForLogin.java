package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScriptForLogin 
{
	public static void main(String[] args) throws IOException 
	{
		String expectedUrl = "https://demowebshop.tricentis.com/";
		String userName="vishugajmal12@gmail.com";
		String password="admin123";
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl))
		{
			System.out.println("We are Login Successfully...");
		}
		else
		{
			System.out.println("We are not login suceessfully");
			File from = ts.getScreenshotAs(OutputType.FILE);
			File to=new File("D:\\Java\\login.jpg");
			
			FileHandler.copy(from, to);
		}
	}
}
