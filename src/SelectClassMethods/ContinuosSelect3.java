package SelectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContinuosSelect3
{
	public static void main(String[] args) throws InterruptedException 
	{
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			
			WebElement Single_select = driver.findElement(By.id("products-orderby"));
			
			Select sel=new Select(Single_select);
			
			List<WebElement> options = sel.getOptions();
			
			int i=0;
			for(WebElement web:options)
			{
				Single_select = driver.findElement(By.id("products-orderby"));
				sel=new Select(Single_select);
				
				sel.selectByIndex(i++);
				Thread.sleep(1000);
			}
			
			Thread.sleep(2000);
			driver.close();
			
	}
}
