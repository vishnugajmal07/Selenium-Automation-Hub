package popUpHandel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowser 
{
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://demowebshop.tricentis.com/");
			
			String parentHandel = driver.getWindowHandle();
			System.out.println(parentHandel);
			
			Actions act=new Actions(driver);
			act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[text()='Facebook']")).click();
			Set<String> childHandel = driver.getWindowHandles();
			 childHandel.remove(parentHandel);
			 System.out.println(childHandel);
			 for (String str : childHandel)
			 {
				 driver.switchTo().window(str);
			}
			 driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		}
}
