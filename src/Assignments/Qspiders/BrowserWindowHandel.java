package Assignments.Qspiders;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandel extends BrowserWindowHandelUtilityClass
{
		public static void main(String[] args) throws InterruptedException 
		{
			String newWindowUrl = "https://demoapps.qspiders.com/ui/browser?sublist=0";
			String tabUrl = "https://demoapps.qspiders.com/ui/browser/newTab?sublist=1";
			String multiWindowUrl = "https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2";
			String multiTabsUrl = "https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3";
			
			preCondition("edge");
			Thread.sleep(2000);
			
			String pHandel = driver.getWindowHandle();
			
			driver.findElement(By.xpath("//div[text()='Explore more']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Popups']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
			Thread.sleep(2000);
			
			List<WebElement> actions = driver.findElements(By.xpath("//p[text()='Actions']/../ul/li/a"));
			
			Thread.sleep(2000);
			
			for (WebElement web : actions) 
			{
				
				web.click();
				Thread.sleep(3000);
				String actualUrl = driver.getCurrentUrl();
				Thread.sleep(3000);
				
				if(newWindowUrl.equals(actualUrl))
				{
					Thread.sleep(2000);
					driver.findElement(By.id("browserLink1")).click();
					Set<String> cHandel = driver.getWindowHandles();
					
					cHandel.remove(pHandel);
					Thread.sleep(4000);
					
					for (String str : cHandel)
					{
						driver.switchTo().window(str);
					}
					Thread.sleep(2000);
					logIn();
					Thread.sleep(2000);
					
					
				}
				else if (tabUrl.equals(actualUrl)) 
				{
					Thread.sleep(2000);
					driver.findElement(By.id("browserButton4")).click();
					Thread.sleep(2000);
					Set<String> cHandel = driver.getWindowHandles();
					
					cHandel.remove(pHandel);
					Thread.sleep(4000);
					
					for (String str : cHandel)
					{
						driver.switchTo().window(str);
					}
					logIn();
					Thread.sleep(2000);
					
				}
				else if (multiTabsUrl.equals(actualUrl))
				{
					Thread.sleep(2000);
					driver.findElement(By.id("browserButton2")).click();
					Thread.sleep(2000);
					multipleHandel();
					
				}
				
				else if (multiWindowUrl.equals(actualUrl))
				{
					
					Thread.sleep(2000);
					driver.findElement(By.id("browserButton3")).click();
					Thread.sleep(2000);
					multipleHandel();	
				}
				else
				{
					System.out.println("Something Went Wrong");
				}
				
				driver.switchTo().window(pHandel);
				
			}
			driver.navigate().refresh();
			button();
			driver.close();
		}
}
