package iFrrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		Thread.sleep(3000);
		
		  WebElement first = driver.findElement(By.xpath("//div[@class='px-8 pt-8 rounded-xl ']/iframe"));
		  
		  driver.switchTo().frame(first);
		
		  Thread.sleep(200);
		WebElement nested = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
		
		driver.switchTo().frame(nested);
		
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vishnu@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sasdhnxfnjy");
		
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("dsyenrgf");
	}

}
