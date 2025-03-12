package Assignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		List<WebElement> Alertbtns = driver.findElements(By.xpath("//div[@class='tab-content']/../div/ul/li"));
		
		for (WebElement web : Alertbtns) 
		{
			web.click();
			Thread.sleep(2000);
			String text = web.getText();
			driver.findElement(By.xpath("//button[contains(text(),'click the button')]")).click();
			
			if(text.equalsIgnoreCase("Alert with OK"))
			{
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
			}
			else if (text.equalsIgnoreCase("Alert with OK & Cancel"))
			{
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
			}
			else if(text.equalsIgnoreCase("Alert with Textbox"))
			{
				Alert alt = driver.switchTo().alert();
				Thread.sleep(1000);
				System.out.println(alt.getText());
				alt.sendKeys("Vishnu");
				alt.accept();
			}
		}
		WebElement ele = driver.findElement(By.xpath("//p[@id='demo1']"));
		
		if (ele.isDisplayed()) 
		{
			System.out.println("Element is displayed");
		} 
		else 
		{
			System.out.println("Element is not displayed");
		}
		
	}
	
}
