package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependantXpath 
{
		public static void main(String[] args) 
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demowebshop.tricentis.com/");
				
				String text = driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span")).getText();
				System.out.println(text);
		}
}
