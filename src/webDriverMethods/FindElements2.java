package webDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 
{
		public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://demowebshop.tricentis.com/");
			 
			 //By using Common Parent Element 
			 List<WebElement> communityPoll = driver.findElements(By.xpath("//ul[@class='poll-options']/li/input"));
			 
			 for(WebElement web:communityPoll)
			 {
				 web.click();
				 Thread.sleep(1000);
			 }
		}
}
