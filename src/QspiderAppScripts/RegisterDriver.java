package QspiderAppScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterDriver  extends Register
{
	public static void main(String[] args) throws InterruptedException 
	{
			precondition();
			Thread.sleep(1000);
			
			List<WebElement> actions = driver.findElements(By.xpath("//p[text()='Actions']/../ul/li"));
			 
			for (WebElement web : actions)
			{
				web.click();
				
				Thread.sleep(2000);
				try
				{
					register();
				}
				catch(Exception e)
				{
					System.out.println("The elements of "+ web.getText() +" option are disabled" );
					break;
				}
				
			}
			
			Thread.sleep(2000);
			postCondition();
	}
}
