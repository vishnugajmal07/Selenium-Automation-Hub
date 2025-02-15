package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod
{
		public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 
			 driver.get("https://demowebshop.tricentis.com/");
			 Thread.sleep(2000);
			 
			WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
			
			register.click();
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			String text=register.getText();
			Thread.sleep(2000);
		
			System.out.println(text);
			
		}
}
