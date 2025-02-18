package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsFunction
{
		public static void main(String[] args) throws InterruptedException 
		{
			 ChromeDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://demowebshop.tricentis.com/");
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			 
			 //Independent and Dependent xpath
			 String text = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span")).getText();
			 System.out.println(text);
			 
		}
}
