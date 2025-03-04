package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99PopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expected_Url="https://demo.guru99.com/test/simple_context_menu.html";
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		String actual_Url = driver.getCurrentUrl();
		
		if (expected_Url.equals(actual_Url))
		{
			System.out.println("we are in the guru99 page");
			Actions act=new Actions(driver);
			
			WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
			act.doubleClick(doubleClick).perform();
			Thread.sleep(2000);
			try 
			{
				doubleClick.click();
				System.out.println("PopUp is not there in Web Page");
			} 
			catch (Exception e) 
			{
				System.out.println("Pop Up is There in a web Page");
			}
		} 
		else 
		{
				System.out.println("We are not in a guru99 web page");
		}
		
		Thread.sleep(2000);
		driver.close();
	}
}
