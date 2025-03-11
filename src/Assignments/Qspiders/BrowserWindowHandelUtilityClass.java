package Assignments.Qspiders;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 class BrowserWindowHandelUtilityClass
{
	 public static WebDriver driver=null;
	 
	//preconditions
	public static void preCondition(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		 else if (browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		} 
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
	}
	
//	login for single window and single tab
	public static void logIn() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vishu@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vishnu@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Vishnu@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
//	Handle multiple login tabs and windows
	public static void multipleHandel() throws InterruptedException
	{
		String signUpPageUrl = "https://demoapps.qspiders.com/ui/browser/SignUpPage";
		String login = "https://demoapps.qspiders.com/ui/browser/Login";
		String signUpUrl = "https://demoapps.qspiders.com/ui/browser/SignUp";
		String pHandel = driver.getWindowHandle();
		
		Set<String> cHandel = driver.getWindowHandles();
		cHandel.remove(pHandel);
		Thread.sleep(4000);
		
		for (String str : cHandel)
		{
			driver.switchTo().window(str);
			Thread.sleep(2000);
			
			String actUrl = driver.getCurrentUrl();
			
			if (signUpPageUrl.equals(actUrl))
			{
				Thread.sleep(1000);
				logIn();
			} 
			else if (signUpUrl.equals(actUrl))
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vishu@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vishnu@123");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else if (login.equals(actUrl))
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vishu@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vishnu@123");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
	}
	
	
	
}
