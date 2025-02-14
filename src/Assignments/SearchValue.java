package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchValue 
{
		public static void main(String[] args) throws InterruptedException 
		{
				String expected_Url="https://demowebshop.tricentis.com/";
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.get("https://demowebshop.tricentis.com/");
				
				String actual_Url=driver.getCurrentUrl();
				
				if(expected_Url.equals(actual_Url))
				{
					System.out.println("We are in dws page");
					
					driver.findElement(By.xpath("html/body/div[4]/div/div/div[3]/form/input[1]")).sendKeys("Mac");
					Thread.sleep(2000);
					driver.findElement(By.xpath("html/body/div[4]/div/div/div[3]/form/input[2]")).click();
					
					Thread.sleep(2000);
					driver.close();
					
				}
				else
				{
					System.out.println("We are not in dws page");
				}
		}
}
