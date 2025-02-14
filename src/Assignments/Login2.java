//Log in the form by using xPath Selector

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 
{
	public static void main(String[] args) throws InterruptedException 
	{
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/input")).sendKeys("vgpatil@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[3]/input")).sendKeys("vg@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[4]/input")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/div[4]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[5]/input")).click();
			
			Thread.sleep(4000);
			
			driver.close();
			
	}
}
