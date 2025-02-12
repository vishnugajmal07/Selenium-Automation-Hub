package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name 
{
		public static void main(String[] args) throws InterruptedException
		{
			 ChromeDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 
			 driver.get("https://demowebshop.tricentis.com/");
			 Thread.sleep(2000);
			 
			 driver.findElement(By.name("q")).sendKeys("Laptop");
			 
			 Thread.sleep(2000);
			 
			 driver.close();
			 
		}
	

}
