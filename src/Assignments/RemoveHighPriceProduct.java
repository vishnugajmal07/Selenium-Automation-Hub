package Assignments;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveHighPriceProduct extends DwsBaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
			String rs5GiftCart = "https://demowebshop.tricentis.com/5-virtual-gift-card";
			String rs25GiftCart = "https://demowebshop.tricentis.com/25-virtual-gift-card";
			String rs50GiftCart = "https://demowebshop.tricentis.com/50-physical-gift-card";
			String rs100GiftCart = "https://demowebshop.tricentis.com/100-physical-gift-card";
			
			precondition("chrome");
			Thread.sleep(2000);
			
			login();
			verifyPage();
			
			driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
			Thread.sleep(2000);
			
			 List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			 
			 for (WebElement web : products) 
			 {
				web.click();
				Thread.sleep(2000);
				String actual_Url = driver.getCurrentUrl();
				if(rs5GiftCart.equals(actual_Url) || rs25GiftCart.equals(actual_Url))
				{
					virtualGiftCard1_2();
					Thread.sleep(2000);
				}
				else if (rs50GiftCart.equals(actual_Url) || rs100GiftCart.equals(actual_Url))
				{
					Thread.sleep(1000);
					virtualGiftCart3_4();
					Thread.sleep(1000);
				}
					
				driver.navigate().back();
			 }	
			
			 Thread.sleep(2000);
			 driver.findElement(By.className("ico-cart")).click();	
			 
			 Thread.sleep(1000);
			 List<WebElement> pricesList = driver.findElements(By.xpath("(//tr[@class='cart-item-row'])/td[4]"));
			 
			 System.out.println("Max price of element in shopping Cart :"+maxPriceElementInShoppingCart(pricesList));
			 
			 	String formattedMax = String.valueOf(maxPriceElementInShoppingCart(pricesList));

				String dynamicXPath = "(//span[contains(text(),'" + formattedMax + "')])[2]/../preceding-sibling::td/input";
				
				driver.findElement(By.xpath(dynamicXPath)).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='updatecart']")).click();
				
				Thread.sleep(4000);
				driver.close();
	}
}
