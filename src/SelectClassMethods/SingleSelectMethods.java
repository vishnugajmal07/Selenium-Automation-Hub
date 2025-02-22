package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectMethods 
{
		public static void main(String[] args) throws InterruptedException 
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("file:///C:/Users/Dell/Downloads/demo%20(1).html");
				Thread.sleep(2000);
				
				WebElement singleSelect = driver.findElement(By.id("standard_cars"));
				
				Select sel=new Select(singleSelect);
				
				sel.selectByVisibleText("Mercedes");
				Thread.sleep(1000);
				
				sel.selectByValue("jgr");
				
				sel.selectByIndex(6);  //Here index start from 0
				Thread.sleep(2000);
				
				driver.close();
				
		}
}
