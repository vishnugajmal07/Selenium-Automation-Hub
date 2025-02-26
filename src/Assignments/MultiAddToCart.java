package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiAddToCart 
{
		public static void main(String[] args) throws InterruptedException 
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
				
				List<WebElement> elements = driver.findElements(By.xpath("//input[@value='Add to cart']"));
				
//				for (WebElement webElement : elements) 
//				{
//					webElement.click();
//					Thread.sleep(1000);
//					
//					driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("Vishal");
//					driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("vishal@gmail.com");
//					driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("Vishnu");
//					driver.findElement(By.xpath("(//input[@type=\"text\"])[6]")).sendKeys("Vishnu@gmail.com");
//					
//					driver.findElement(By.className("message")).sendKeys("Congratulations");
//					driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
//					
//					Thread.sleep(1000);
//					driver.navigate().back();
//				}
				
				for (int i = 0; i < elements.size(); i++)
				{
					if(i<=1)
					{
						elements.get(i).click();
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("Vishal");
						driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("vishal@gmail.com");
						driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("Vishnu");
						driver.findElement(By.xpath("(//input[@type=\"text\"])[6]")).sendKeys("Vishnu@gmail.com");
						
						driver.findElement(By.className("message")).sendKeys("Congratulations");
						driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
						
						Thread.sleep(1000);
						driver.navigate().back();
					}
					else
					{
						elements.get(i).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("Vishal");
						driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("Vishnu");
						driver.findElement(By.className("message")).sendKeys("Congratulations");
						driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
						Thread.sleep(2000);
						driver.navigate().back();
					}
				}
				
				driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
				Thread.sleep(2000);
				
				driver.close();
					
					
					
					
					
		}
}

