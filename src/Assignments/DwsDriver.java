package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DwsDriver extends DwsBaseClass
{
	public static void main(String[] args) throws InterruptedException
	{
		precondition("chrome");
		verifyPage();
		login();
		
		List<WebElement> answers = driver.findElements(By.xpath("//ul[@class='poll-options']/li/input"));
		for (WebElement web : answers) 
		{
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		postCondition();
		
	}
}
