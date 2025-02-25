package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContinuousSelect
{
		public static void main(String[] args) throws InterruptedException 
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
				
				WebElement single_Select = driver.findElement(By.id("products-orderby"));
				
				Select sel=new Select(single_Select);
				
				List<WebElement> options = sel.getOptions();
				
				int i=0;
				for (WebElement webElement : options) 
				{
					single_Select = driver.findElement(By.id("products-orderby"));
					sel=new Select(single_Select);
					sel.selectByIndex(i++);
					Thread.sleep(1000);
					
					
				}
				
				 i=0;
				WebElement single_Select1 = driver.findElement(By.id("products-pagesize"));
				Select sel1=new Select(single_Select1);
				List<WebElement> option = sel1.getOptions();
				for (WebElement web : option) 
				{
					single_Select1 = driver.findElement(By.id("products-pagesize"));
					sel1=new Select(single_Select1);
					
					sel1.selectByIndex(i++);
					Thread.sleep(1000);
				}
				
				
				i=0;
				WebElement single_select2 = driver.findElement(By.id("products-viewmode"));
				Select sel3=new Select(single_select2);
				List<WebElement> option3 = sel3.getOptions();
				
				for (WebElement webElement : option3) 
				{
					single_select2 = driver.findElement(By.id("products-viewmode"));
					sel3=new Select(single_select2);
					
					sel3.selectByIndex(i++);
					Thread.sleep(1000);
				}
				
				Thread.sleep(2000);
				driver.close();
				
		}
}
