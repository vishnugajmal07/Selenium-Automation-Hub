package QspiderAppScripts;

import org.openqa.selenium.By;

public class DemoDriver extends QspidersUtilityClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("edge");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[text()='Explore more'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("text field");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='relative']")).click(); 	
		
		Thread.sleep(2000);
		registerWithPlaceholder();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
