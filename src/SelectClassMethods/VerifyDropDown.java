package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDown 
{
		public static void main(String[] args) throws InterruptedException
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
				
				WebElement	web=driver.findElement(By.id("multiple_cars"));
				
			
				Select sel=new Select(web);
			
				sel.selectByVisibleText("BMW");
				Thread.sleep(2000);
				
				if(sel.isMultiple())
				{
					sel.deselectByVisibleText("BMW");
					Thread.sleep(2000);
				}
				else
				{
					System.out.println("It is a single select drop down Menu");
				}
				
				driver.close();
		}
}
