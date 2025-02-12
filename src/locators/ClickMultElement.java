package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMultElement
{
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 driver.findElement(By.className("ico-register")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.className("ico-login")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.className("cart-label")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.className("ico-wishlist")).click();
		 Thread.sleep(2000);
		 
		 driver.close();
	}
}
