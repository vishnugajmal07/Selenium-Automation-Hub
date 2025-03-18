package iFrrame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_frame {

	
	public static void main(String []args ) throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		driver.findElement(By.linkText("Multiple iframe")).click();
		
		WebElement first = driver.findElement(By.xpath("//div[@class='w-1/2']/iframe"));
	
		driver.switchTo().frame(first);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vishu@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12567890");
		
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("09876434");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		driver.switchTo().parentFrame();
		
		 
		WebElement second = driver.findElement(By.xpath("(//div[@class='w-1/2']/iframe)[2]"));
		
		driver.switchTo().frame(second);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vishnu");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("3456789");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		

	}
}