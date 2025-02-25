package SelectClassMethods;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContinuousSelect 
{
		public static void main(String[] args) throws InterruptedException
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
				Thread.sleep(2000);
				
				WebElement web = driver.findElement(By.id("standard_cars"));
				
				Select sel=new Select(web);
				
				List<WebElement> options = sel.getOptions();
				int i=0;
				for(WebElement webE:options)
				{
					sel.selectByIndex(i++);
					Thread.sleep(1000);
				}
				
				driver.close();
		}
}
