package ActionsClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		WebElement rigtClick = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
		//act.contextClick().perform();
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		act.contextClick(rigtClick).click(copy).perform();
//		act.click(copy).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
