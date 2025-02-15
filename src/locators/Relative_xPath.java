//Relative xPath method1

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xPath 
{
		public static void main(String[] args) 
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				String text = driver.findElement(By.xpath("//strong[text()='Community poll']")).getText();
				
				System.out.println(text);
		}
}
