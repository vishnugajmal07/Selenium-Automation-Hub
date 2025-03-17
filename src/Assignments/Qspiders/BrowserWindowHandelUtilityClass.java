package Assignments.Qspiders;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

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
	 public static void button() throws InterruptedException
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//section[text()='Button']")).click();
			Thread.sleep(2000);
			
			List<WebElement> actions = driver.findElements(By.xpath("//p[text()='Actions']/../ul/li/a"));
			
			for (WebElement web : actions) 
			{
				web.click();
				Thread.sleep(1000);
				String text = web.getText();
				if (text.equals("Default Click"))
				{
					driver.findElement(By.id("btn")).click();
					driver.findElement(By.id("btn3")).click();
					
					List<WebElement> rate = driver.findElements(By.xpath("//p[text()='3. Rate us on the scale of 1 to 5']/following-sibling::button"));
					for (WebElement webE : rate) 
					{
						webE.click();
						Thread.sleep(1000);
					}
				}
				else if (text.equals("Right Click"))
				{
					Actions act=new Actions(driver);
					Thread.sleep(1000);
					WebElement rClick = driver.findElement(By.id("btn30"));
					Thread.sleep(2000);
					act.contextClick(rClick).perform();
					WebElement yes = driver.findElement(By.xpath("//div[text()='Yes']"));
					act.click(yes).perform();
					
					rClick = driver.findElement(By.id("btn31"));
					Thread.sleep(2000);
					act.contextClick(rClick).perform();
					yes = driver.findElement(By.xpath("//div[text()='Yes']"));
					act.click(yes).perform();
					
					rClick = driver.findElement(By.id("btn32"));
					Thread.sleep(2000);
					act.contextClick(rClick).perform();
					yes = driver.findElement(By.xpath("//div[text()='2']"));
					act.click(yes).perform();
					
				}
				else if (text.equalsIgnoreCase("Double Click")) 
				{
					Actions act=new Actions(driver);
					Thread.sleep(1000);
					WebElement rClick = driver.findElement(By.id("btn20"));
					Thread.sleep(2000);
					act.doubleClick(rClick).perform();
					
					rClick = driver.findElement(By.id("btn23"));
					Thread.sleep(2000);
					act.doubleClick(rClick).perform();
					
					rClick = driver.findElement(By.id("btn24"));
					Thread.sleep(2000);
					act.doubleClick(rClick).perform();
				}
				else if(text.equals("Submit Click"))
				{
					driver.findElement(By.id("sat1")).click();
					driver.findElement(By.id("btn40")).click();
					driver.findElement(By.id("prob2")).click();
					driver.findElement(By.id("btn41")).click();
					driver.findElement(By.id("r4")).click();
					driver.findElement(By.id("btn42")).click();
					Thread.sleep(2000);
				}
				else if(text.equals("Disabled"))
				{
					WebElement btn1 = driver.findElement(By.id("btn10"));
					WebElement btn2 = driver.findElement(By.id("btn12"));
					WebElement btn3 = driver.findElement(By.id("btn18"));
					
					if(btn1.isEnabled())
					{
						btn1.click();
					}
					else
					{
						System.out.println("btn 1 is not clicable");
					}
					 if (btn2.isEnabled())
					{
							btn2.click();
					}
					else
					{
						System.out.println("btn 1 is not clicable");
					}	
					 if (btn3.isEnabled())
					{
						 btn3.click();
					}
					else
					{
						System.out.println("btn 1 is not clicable");
					}
					 
					 driver.findElement(By.id("submit")).click();
					 Thread.sleep(2000);
					 driver.findElement(By.id("submitButton")).click();
					 Thread.sleep(2000);
				}
				
				Thread.sleep(2000);
				
			}
		}
	
	
	
}
