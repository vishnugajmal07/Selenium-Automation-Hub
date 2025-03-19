package iFrrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastNested {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		
	     Thread.sleep(2000);
	     
	    WebElement first = driver.findElement(By.xpath("//div[@class='px-8 pt-8 rounded-xl ']/iframe"));
	    
	    driver.switchTo().frame(first);
	    
	    
	   WebElement second = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
	   
	   driver.switchTo().frame(second);
	
	   
	  WebElement third = driver.findElement(By.xpath("//div[@class='form-group']/iframe"));
	   driver.switchTo().frame(third);
	   
	   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vishnu@gmail.com");
	   Thread.sleep(2000);
	   
	   driver.switchTo().parentFrame();
	   WebElement pass = driver.findElement(By.xpath("(//div[@class='form-group'])[2]/iframe"));
	   driver.switchTo().frame(pass);
	   driver.findElement(By.xpath("//section[@class='eyeParent']/input")).sendKeys("Vishnu@123");
	   driver.switchTo().parentFrame();
	   WebElement cPass = driver.findElement(By.xpath("(//div[@class='form-group'])[3]/iframe"));
	   driver.switchTo().frame(cPass);
	   driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("Vishnu@123");
	   driver.switchTo().parentFrame();
	   WebElement submit = driver.findElement(By.xpath("//div[@class='form-group'])[4]/iframe"));
	   driver.switchTo().frame(submit);
	   driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	   
	  
	}

}
