package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Actions act=new Actions(driver);
		
		WebElement webE = driver.findElement(By.xpath("//a[text()='Men']"));
		
		act.moveToElement(webE).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		
		Thread.sleep(1000);
		driver.quit();
		
	}
}
