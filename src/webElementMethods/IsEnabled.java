package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled
{
		public static void main(String[] args)
		{
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
			
			if (register.isEnabled()) 
			{
					register.click();
			}
			else
			{
				System.out.println("NosuchElement");
			}
		}
}
