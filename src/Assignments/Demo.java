package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
		public static void main(String[] args) throws InterruptedException 
		{
				String expecte_Url1= "https://demowebshop.tricentis.com/5-virtual-gift-card";
				String expecte_Url2 = "https://demowebshop.tricentis.com/25-virtual-gift-card";
				String expected_Url3="https://demowebshop.tricentis.com/50-physical-gift-card";
				String expected_Url4="https://demowebshop.tricentis.com/100-physical-gift-card";
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
				
				List<WebElement> addToCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
				
				for(WebElement web: addToCart)
				{
					web.click();
					Thread.sleep(1000);
					
					String actual_Url=driver.getCurrentUrl();
					
					if (expecte_Url1.equals(actual_Url) || expecte_Url2.equals(actual_Url)) 
					{
							driver.findElement(By.xpath("//div[@class=\"giftcard\"]/div/input")).sendKeys("Vishnu");
							driver.findElement(By.xpath("//div[@class=\"giftcard\"]/div[2]/input")).sendKeys("vg@gmail.com");
							driver.findElement(By.xpath("//div[@class='giftcard']/div[3]/input")).sendKeys("viru");
							driver.findElement(By.xpath("//div[@class='giftcard']/div[4]/input")).sendKeys("viru@gmail.com");
							
							driver.findElement(By.className("message")).sendKeys("Congratulations");
							
							driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
							
							driver.navigate().back();
					}
					else if (expected_Url3.equals(actual_Url) || expected_Url4.equals(actual_Url))
					{
						driver.findElement(By.xpath("//div[@class=\"giftcard\"]/div/input")).sendKeys("Vishnu");
						driver.findElement(By.xpath("//div[@class=\"giftcard\"]/div[2]/input")).sendKeys("Raj");
						
						driver.findElement(By.className("message")).sendKeys("Congratulations");
						
						driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
						
						driver.navigate().back();
						
					}
					
				}
				driver.close();		
		}
}
