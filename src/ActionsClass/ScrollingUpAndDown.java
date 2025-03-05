package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUpAndDown
{
	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver=new EdgeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			
			Actions act=new Actions(driver);
			act.keyDown(Keys.PAGE_DOWN).perform();
			Thread.sleep(1000);
			act.keyDown(Keys.PAGE_UP).perform();
			
			Thread.sleep(2000);
			driver.quit();
	}
}
