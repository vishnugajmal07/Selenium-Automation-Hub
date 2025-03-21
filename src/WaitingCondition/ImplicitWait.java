package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
//			Waiting Condition should always in 3rd step
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://shoppersstack.com/");
			
			driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
			driver.findElement(By.xpath("//span[text()='Create Account']")).click();
			
		}
}
