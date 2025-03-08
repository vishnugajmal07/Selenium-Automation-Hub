package popUpHandel;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToTwitter 
{
		public static void main(String[] args) throws InterruptedException
		{
			String youTube_url = "https://www.youtube.com/user/nopCommerce";
			String fb_url = "https://www.facebook.com/nopCommerce";
			String twitter_Url = "https://x.com/nopCommerce";
			String rss_Url = "https://demowebshop.tricentis.com/news/rss/1";
			String google_url = "https://workspaceupdates.googleblog.com/";
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			
			Actions act=new Actions(driver);
			act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			
			List<WebElement> ecommerce = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			
			for (WebElement web : ecommerce)
			{
				String actual_Url=driver.getCurrentUrl();
				
				if(rss_Url.equals(actual_Url))
				{
					driver.navigate().back();
				}
				Thread.sleep(1000);
				web.click();
				Thread.sleep(1000);
			}
			
			
			Set<String> child = driver.getWindowHandles();
			for (String str : child)
			{
				driver.switchTo().window(str);
				String actual_Url = driver.getCurrentUrl();
				
				if(twitter_Url.equals(actual_Url))
				{
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[text()='Create account']")).click();
				}
				else if(fb_url.equals(actual_Url))
				{
					Thread.sleep(2000);
					 driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				}
				else if (youTube_url.equals(actual_Url)) 
				{
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Chaava Songs");
				}
				else if(google_url.equals(actual_Url))
				{
					Thread.sleep(1000);
					driver.findElement(By.xpath("mce-EMAIL")).sendKeys("hello");
				}
				
				
			}
			
			
		}
}
