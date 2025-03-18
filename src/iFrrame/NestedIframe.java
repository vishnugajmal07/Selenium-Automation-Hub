package iFrrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(1000);
		
		
		//Switch to enbbed iframe
		WebElement embbedIframe = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(embbedIframe);
		Thread.sleep(2000);
		
		//Switch to enbbed iframe
		WebElement nestedIframe = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(nestedIframe);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vishu");
		
		

	}
}
