package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{
		public static void main(String[] args)
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				
				WebElement exelent = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
				
				//exelent.click();
				
				if (exelent.isSelected()) 
				{
					System.out.println("yes selected");
				}
				else
				{
					System.out.println("Not selected");
				}
				
				driver.close();
		}
}
