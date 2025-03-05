package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenInNewMultipleTabs 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		Actions act=new Actions(driver);
		for (WebElement web : elements) 
		{
			act.keyDown(Keys.SHIFT).click(web).perform();
			Thread.sleep(2000);
		}
		
		driver.quit();
		
		
	}
}
