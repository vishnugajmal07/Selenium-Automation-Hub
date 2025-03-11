package popUpHandel;

import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.MoreObjects.ToStringHelper;

public class ChildBrowserPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Dell/Downloads/MultipleWindow%20(1).html");
		Thread.sleep(1000);
		String pHandel = driver.getWindowHandle();
		System.out.println(pHandel);
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click(); 
		Thread.sleep(1000);
		
		Set<String> childHandels = driver.getWindowHandles();
		
		childHandels.remove(pHandel);
		
		for (String str : childHandels) 
		{
			driver.switchTo().window(str);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
		
		driver.switchTo().window(pHandel);
		
		driver.close();
		
		
	}
}
