package SelectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContinuosSelect2 
{
		public static void main(String[] args) throws InterruptedException
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
				Thread.sleep(2000);
				
				WebElement multSel = driver.findElement(By.id("multiple_cars"));
				
				Select sel=new Select(multSel);
				List<WebElement> options = sel.getOptions();
				
				int i=0;
				
				for (WebElement web : options) 
				{
					sel.selectByIndex(i++);
					Thread.sleep(1000);
				}
				Thread.sleep(2000);
				driver.close();
		}
}
