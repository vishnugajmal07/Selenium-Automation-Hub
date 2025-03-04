package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold 
{
	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			
			Actions act=new Actions(driver);
			
			WebElement source = driver.findElement(By.id("box6"));
			WebElement target = driver.findElement(By.id("box106"));
			
			
			act.clickAndHold(source).perform();
			Thread.sleep(2000);
			act.release(target).perform();
	}
}
