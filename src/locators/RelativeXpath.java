package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath 
{
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.navigate().to("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		 
		 Thread.sleep(3000);
		 driver.close();
	}
}
