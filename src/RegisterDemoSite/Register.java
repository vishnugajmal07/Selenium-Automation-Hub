package RegisterDemoSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register 
{
		static 	WebDriver driver=null;
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
			driver.get("https://demo.automationtesting.in/Register.html");
		}
		
		public static void register() throws InterruptedException
		{
			driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Vishnu");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Gajmal");
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Datta Nagar Katraj");
			driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("vg@gmail.com");
			driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9134567890");
			driver.findElement(By.xpath("//input[@value='Male']")).click();
			
			List<WebElement> hobbies = driver.findElements(By.xpath("//input[@type='checkbox']"));
			for (WebElement web : hobbies) 
			{
				web.click();
				Thread.sleep(1000);
			}
			
			
			//Language
			 WebElement language = driver.findElement(By.id("msdd"));
			 language.click();
			 WebElement lang = driver.findElement(By.xpath("//li[@class='ng-scope'][8]"));
			 lang.click();
			 
			
//			Select class
			WebElement skills = driver.findElement(By.id("Skills"));
			Select sel=new Select(skills);
			sel.selectByVisibleText("Adobe Photoshop");
			
			WebElement countries = driver.findElement(By.id("countries"));
			sel=new Select(countries);
			sel.selectByIndex(0);
			
			driver.findElement(By.xpath("//span[@role='presentation']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//li[@role='treeitem'])[6]")).click();
			
//			DOB
			//year
			WebElement year = driver.findElement(By.id("yearbox"));
			sel=new Select(year);
			sel.selectByVisibleText("2003");
			
			
			//Month
			WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
			sel=new Select(month);
			sel.selectByVisibleText("March");
			
			//Day
			WebElement day = driver.findElement(By.id("daybox"));
			sel=new Select(day);
			sel.selectByVisibleText("11");
			
			driver.findElement(By.id("firstpassword")).sendKeys("vg@123");
			driver.findElement(By.id("secondpassword")).sendKeys("vg@123");
	
			driver.findElement(By.id("submitbtn")).click();
		}
}
