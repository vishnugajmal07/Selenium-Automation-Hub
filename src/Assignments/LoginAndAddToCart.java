/**
 * Script for DemoWebShop WebPage
 * 
 * Steps:
 * 
 * 1. Opens the browser
 * 2. Maximizes the browser window
 * 3. Navigates to the DemoWebShop WebPage
 * 4. Verifies the page by using the URL
 * 5. Logs into the DemoWebShop account
 * 6. Add a $25 Virtual Gift Card to the cart
 * 7. Fills in all required details
 * 8. Changes the quantity to 2
 * 9. Clicks "Add to Cart"
 * 10. Removes the product from the shopping cart
 * 11. Logs out from the account
 * 12. Closes the browser
 * 
 */



package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndAddToCart
{
		public static void main(String[] args) throws InterruptedException 
		{
				String expected_Url="https://demowebshop.tricentis.com/";
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.navigate().to("https://demowebshop.tricentis.com/");
				Thread.sleep(1500);
				
				String actual_Url=driver.getCurrentUrl();
				
				if(expected_Url.equals(actual_Url))
				{
					System.out.println("We are in the DemoWorkShop web Page");
					
					
					//Login into the DemoWebShop web page
					driver.findElement(By.xpath("//a[@class='ico-login']")).click();
					Thread.sleep(1500);
					driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vgpatil@gmail.com");
					Thread.sleep(1500);
					driver.findElement(By.xpath("//input[@class='password']")).sendKeys("vg@123");
					Thread.sleep(1500);
					driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
					Thread.sleep(1500);
					driver.findElement(By.xpath("//input[@value='Log in']")).click();
					Thread.sleep(2500);
					
					
					driver.navigate().refresh();
					
					//Product add to cart
					driver.findElement(By.xpath("//a[@href='/25-virtual-gift-card']")).click();
					driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Vishnu");
					Thread.sleep(1500);
					driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("vishu123@gmail.com");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("Congratulations on your achievement!");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).clear();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).sendKeys("2");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-2\"]")).click();
					
					Thread.sleep(2000);
					driver.navigate().refresh();
					Thread.sleep(2000);
					driver.findElement(By.className("ico-cart")).click();
					Thread.sleep(2000);
					
					//Remove product from the Cart
					driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
					driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
					
					Thread.sleep(5000);
//					driver.close();
					
				}
		}
}
