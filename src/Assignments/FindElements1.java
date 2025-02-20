package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1
{
		public static void main(String[] args) throws InterruptedException 
		{
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			
			List<WebElement> header_links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
			
			for(WebElement web:header_links)
			{
				web.click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				
			}
			
			driver.close();
		}
}
