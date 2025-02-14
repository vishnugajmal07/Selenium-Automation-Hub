//Register the form By using xPath() locator

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm3 
{
		public static void main(String[] args) throws InterruptedException 
		{
			
				String expected_Url="Demo Web Shop";
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.get("https://demowebshop.tricentis.com/");
				
				String actual_Url=driver.getTitle();
				
				if(expected_Url.equals(actual_Url))
				{
					System.out.println("We are in the DWS Page");
					
					driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/ul/li[1]/a")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div/div/div[2]/div/div/input")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div/div/div[2]/div[2]/input")).sendKeys("Vishnu");
					Thread.sleep(1000);
					driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div/div/div[2]/div[3]/input")).sendKeys("Gajmal");
					Thread.sleep(1000);
					driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div/div/div[2]/div[4]/input")).sendKeys("admin123@gmail.com");
					Thread.sleep(1000);
					driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("admin@123");
					Thread.sleep(1000);
					driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("admin@123");
					Thread.sleep(1000);
					driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
					Thread.sleep(3000);
					
					driver.close();
					
			
				}
				else
				{
					System.out.println("We are not in DWS page");
				}
				
				
		}
}
