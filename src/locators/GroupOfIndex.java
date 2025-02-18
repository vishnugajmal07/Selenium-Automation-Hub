package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOfIndex 
{
		public static void main(String[] args) throws InterruptedException 
		{
			 ChromeDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 Thread.sleep(1000);
			 
			 driver.get("https://demowebshop.tricentis.com/");
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Vishnu");
			 
			 Thread.sleep(4000);
			 
			 
			 driver.close();
		}
}
