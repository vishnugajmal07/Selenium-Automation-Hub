package Assignments;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demo1 extends DwsBaseClass
{
		public static void main(String[] args) throws AWTException, InterruptedException 
		{
			precondition("chrome");
			Thread.sleep(2000);
				
		 
			Actions act = new Actions(driver);
			Thread.sleep(1000);
			WebElement elem = driver.findElement(By.className("ico-register"));
			System.out.println(elem.getText());
			act.moveToElement(elem).perform();;
			act.click().perform();;
		}
}
