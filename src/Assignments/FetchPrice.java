package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPrice 
{
		public static void main(String[] args) throws InterruptedException 
		{
			 String expected_Url="https://demowebshop.tricentis.com/";
			 
			 ChromeDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://demowebshop.tricentis.com/");
			 Thread.sleep(2000);
			 
			 String actual_URL=driver.getCurrentUrl();
			 
			 if(expected_Url.equals(actual_URL))
			 {
				 System.out.println("We are in DWS page");
				 
				 driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
				 
				 System.out.println("Prices of Products");
				 
				 String albumPrice = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span")).getText();
				 System.out.println("3rd Album Price:"+albumPrice);
				 
				 String MusicPrice=driver.findElement(By.xpath("//a[text()='Music 2']/../following-sibling::div[3]/div/span")).getText();
				 System.out.println("Music 2: "+MusicPrice);
				 
				 String Music2Price=driver.findElement(By.xpath("//a[text()='Music 2']/../../../../../div[3]/div/div[2]/div[3]/div/span")).getText();
				 System.out.println("Music 2: "+Music2Price);
				 
				 Thread.sleep(2000);
				 driver.close();
				 
			 }
			 else
			 {
				 System.out.println("We are not in dws page");
			 }
			 
			 
		}
}
