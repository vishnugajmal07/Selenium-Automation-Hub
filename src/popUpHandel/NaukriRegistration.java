package popUpHandel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriRegistration 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.naukri.com/registration/createAccount?");
			
			driver.findElement(By.id("name")).sendKeys("Vishnu");
			driver.findElement(By.id("email")).sendKeys("vishnu@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Vishnu@123");
			driver.findElement(By.id("mobile")).sendKeys("1234567890");
			
			driver.findElement(By.xpath("//div[@class='radioWrap']/div[1]")).click();
			Thread.sleep(1000);
			
			WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
			Thread.sleep(2000);
			file.sendKeys("D:\\Personal Documents\\Manual Resume.pdf");
			
		}
}
