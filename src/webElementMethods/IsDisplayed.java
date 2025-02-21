package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
{
		public static void main(String[] args)
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				WebElement dws_logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
				
				if (dws_logo.isDisplayed()) 
				{
						System.out.println("DWS logo is displayed");
				}
				else
				{
					System.out.println("DWS logo is not displayed");
				}
		}
}
