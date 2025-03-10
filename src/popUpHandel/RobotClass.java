package popUpHandel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_H);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_U);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_H);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_U);
		Thread.sleep(1000);
	}
}
