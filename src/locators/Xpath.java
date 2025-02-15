

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{
		public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://demowebshop.tricentis.com/");
			 Thread.sleep(2000);
			 
			 //click on the register btn
//			 driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/ul/li[1]/a")).click();
//			 Thread.sleep(2000);
			 
			 //Click on the Shopping cart btn
			 driver.findElement(By.xpath("html/body/div[4]/div/div/div/div/ul/li[3]/a/span")).click();
			 
			 Thread.sleep(2000);
			 
			 driver.close();
			 
		}
}
