package webDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{
		public static void main(String[] args) throws InterruptedException 
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				//By using common attribute
				List<WebElement> communityPoll = driver.findElements(By.xpath("//input[@name='pollanswers-1']"));
			
			for(WebElement web:communityPoll)
			{
				web.click();
				Thread.sleep(2000);
			}
			
			
			driver.close();
		}
}
