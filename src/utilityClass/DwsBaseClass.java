package utilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DwsBaseClass
{
	static WebDriver driver=null;
	
	public static void preCondition(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		
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
		driver.quit();
	}
}
