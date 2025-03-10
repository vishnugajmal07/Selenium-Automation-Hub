package Assignments.Qspiders;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;

import QspiderAppScripts.*;

public class AuthenticationPopUp extends QspidersUtilityClass
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		preCondition("edge");
		Thread.sleep(2000);
		String pHandel = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='Explore more']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("AuthLink")).click();
		Thread.sleep(2000);
		
		Set<String> handels = driver.getWindowHandles();
		handels.remove(pHandel);
		
		for (String str : handels) 
		{
				driver.switchTo().window(str);
		}
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
