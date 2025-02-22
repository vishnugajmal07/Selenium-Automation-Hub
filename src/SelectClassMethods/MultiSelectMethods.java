package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectMethods 
{
		public static void main(String[] args) throws InterruptedException 
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
				
				WebElement multiSelect = driver.findElement(By.id("multiple_cars"));
				
				Select sel=new Select(multiSelect);
				
				sel.deselectByIndex(2);
				Thread.sleep(2000);
				sel.selectByValue("jgr");
				Thread.sleep(2000);
				sel.selectByVisibleText("Honda");
				Thread.sleep(2000);
				
				sel.deselectByIndex(2);
				Thread.sleep(2000);
				sel.deselectByValue("jgr");
				Thread.sleep(2000);
				sel.deselectByVisibleText("Honda");
				
				
		}
}
