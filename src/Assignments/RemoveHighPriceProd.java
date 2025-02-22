package Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveHighPriceProd 
{
		public static void main(String[] args) throws InterruptedException 
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
				
				List<WebElement> addToCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
				
				for(WebElement web:addToCart)
				{
					web.click();
					Thread.sleep(2000);
				}
				
				driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
				
				
				List<WebElement> totalPrices = driver.findElements(By.xpath("//span[@class='product-subtotal']"));
				
				List<Object> list=new ArrayList<>();
				
				for(WebElement web: totalPrices)
				{
					list.add(web.getText());
				}
				
				List<Double> l1 = new ArrayList<>();
				
				for (Object obj : list) {
					String text = (String) obj;  // First, cast Object to String
					double value = Double.parseDouble(text);
				    l1.add(value);
				    	    
				}
				System.out.println(l1);
				
				Double max=Double.MIN_VALUE;
				
				for(int i=0;i<l1.size();i++)
				{
					if(l1.get(i)>max)
					{
						max=l1.get(i);
						
					}
				}
				
				System.out.println("Max "+max);
				
				String formattedMax = String.format("%.2f", max);

				// Construct the dynamic XPath
				String dynamicXPath = "(//span[text()='" + formattedMax + "'])[2]/../preceding-sibling::td/input";

				// Debug: Print the XPath
				System.out.println("Dynamic XPath: " + dynamicXPath);

				// Locate the element and click it
				driver.findElement(By.xpath(dynamicXPath)).click();
				
				
				driver.findElement(By.xpath("//input[@name='updatecart']")).click();
				
				
				Thread.sleep(4000);
				driver.close();
		


		}
}
