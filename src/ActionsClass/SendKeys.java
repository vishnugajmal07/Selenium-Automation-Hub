package ActionsClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
//		for(int i=0;i<6;i++)
//		{
//			act.keyDown(Keys.TAB).perform();
//		}
//		act.sendKeys("mac").perform();
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		act.sendKeys(search, "Laptop").perform();
		
		Thread.sleep(20000);
		driver.quit();
		
	}
}
