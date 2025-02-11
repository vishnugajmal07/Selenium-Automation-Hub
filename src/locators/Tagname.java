package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tagname 
{
		public static void main(String[] args) throws InterruptedException 
		{
			String expected_Url="https://demowebshop.tricentis.com/";
			
				//Open the Browser 
				ChromeDriver driver=new ChromeDriver();
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Waiting time
				Thread.sleep(2000);
				
				//Enter into Url
				driver.get("https://demowebshop.tricentis.com/");
				
				//get Current Url
				String actual_Url=driver.getCurrentUrl();
				
				
				if(expected_Url.equals(actual_Url))
				{
					System.out.println("We are in DWS page");
					
					//Find Element By using tagName 
					WebElement search_field=driver.findElement(By.tagName("input"));
					System.out.println(search_field);
					
					Thread.sleep(2000);
					search_field.sendKeys("Tablet");
				}
				else
				{
					System.out.println("We are not in dws page");
				}
				
				Thread.sleep(2000);
				driver.close();
		}
}
