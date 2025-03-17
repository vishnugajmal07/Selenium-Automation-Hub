package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DwsBaseClass 
{
	static String expected_Url="https://demowebshop.tricentis.com/";
	
	static WebDriver driver=null;
	
	public static void precondition(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("forefox"))
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
	
	public static void verifyPage()
	{
		String actual_Url = driver.getCurrentUrl();
		
		if(expected_Url.equals(actual_Url))
		{
			System.out.println("We are in the DemoWebShop Page");
		}
		else
		{
			System.out.println("We are not in a DemoWebShop Page");
		}
		
	}
	
	public static void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	public static void postCondition() 
	{
		driver.quit();
	}
	
	
	
//	Gift Card option add to cart details
	
	public static void virtualGiftCard1_2() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Viraj");
		driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("viru@gmail.com");
		driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("Congrats");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	}
	
	public static void virtualGiftCart3_4() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Viraj");
		driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("Congrats");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	}
	
	public static double maxPriceElementInShoppingCart(List<WebElement> pricesList)
	{
		// Convert the list of price elements (WebElement) into a double array 
		 double[] priceArray=new double[pricesList.size()];
		 int i=0;
		 for (WebElement web : pricesList)
		 {
			 	priceArray[i]=Double.parseDouble(web.getText());
			 	i++;
		 }
		 
		 
		 //Finding max element
		 double max = Double.MIN_VALUE;
		 for (int j = 0; j < priceArray.length; j++) 
		 {
			 	if(max<priceArray[j])
			 	{
			 		max=priceArray[j];	
			 	}
		 }
		 
		 return max;
	}
	
	
}


