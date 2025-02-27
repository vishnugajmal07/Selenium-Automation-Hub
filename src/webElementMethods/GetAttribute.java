package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute 
{
		public static void main(String[] args) throws InterruptedException 
		{
				String expected_Attribute = "jewelry";
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				WebElement searchField = driver.findElement(By.id("small-searchterms"));
				searchField.sendKeys(expected_Attribute);
				String actual_Attribute = searchField.getAttribute("value");
				
				if(expected_Attribute.equals(actual_Attribute))
				{
					driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
				}
				else
				{
					System.out.println("The Passed data is different");
				}
				Thread.sleep(2000);
				driver.close();
		}
}
