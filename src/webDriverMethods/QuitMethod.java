package webDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expected_Url = "https://demowebshop.tricentis.com/news/rss/1";
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"column follow-us\"]/ul/li/a"));
		
		for (WebElement web: elements) 
		{
			web.click();
			Thread.sleep(1000);
			
			String actual_Url = driver.getCurrentUrl();
			
			if(expected_Url.equals(actual_Url))
			{
				driver.navigate().back();
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
