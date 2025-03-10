package popUpHandel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EasyMyTrip 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);

		Thread.sleep(5000);
		Robot rbt=new Robot();
		
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
			
		
		rbt.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
