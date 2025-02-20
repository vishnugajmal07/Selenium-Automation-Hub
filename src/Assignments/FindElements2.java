package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 
{
		public static void main(String[] args) throws InterruptedException 
		{
				String expected_title = "Demo Web Shop. Digital downloads";
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				WebElement digital_download = driver.findElement(By.xpath("//a[contains(text(),'Digital download')]"));
				digital_download.click();
				
				String actual_Title = driver.getTitle();
				
				if(expected_title.equals(actual_Title))
				{
					System.out.println("We are in Digital download page");
					
//					List<WebElement> columnFollow_us = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
//					
//					for(WebElement web:columnFollow_us)
//					{
//						
//						String	title=driver.getTitle();
//					
//						if(expected_title.equals(title))
//						{
//							web.click();
//							System.out.println(web);
//							Thread.sleep(2000);
//						}
//						else
//						{
//							driver.navigate().back();
//							Thread.sleep(4000);
//							
//						}
//						
					
					//By Using Common attribute
					
						List<WebElement> columnFollow_us = driver.findElements(By.xpath("//a[@target='_blank']"));
						for(WebElement web:columnFollow_us)
						{
							web.click();
							Thread.sleep(2000);
							
						}
						
					}
					
				else
				{
					System.out.println("we are not in Digital Download Page");
				}
				
//				driver.close();
				
				
				
				
		}
}
