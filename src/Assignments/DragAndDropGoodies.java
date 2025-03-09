package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropGoodies 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		List<WebElement> capitals = driver.findElements(By.xpath("//div[@id=\"dropContent\"]/div"));
		 List<WebElement> countries = driver.findElements(By.id("//div[@id='countries']/div"));
		
		Actions act=new Actions(driver);
		
		for (int i = 0; i < capitals.size(); i++)
		{
			if(capitals.get(i).isDisplayed())
			{
				System.out.println(capitals.get(i));
			}
			else
			{
				
			}
		}
	}
}

