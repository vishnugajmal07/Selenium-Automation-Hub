package JavaScriptSExecutor;

import java.time.Duration;import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByAxis 
{
	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://omayo.blogspot.com/");
			Thread.sleep(2000);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;

			
//			js.executeScript("window.scrollBy(0,100);");
//			Thread.sleep(2000);
//			js.executeScript("window.scrollTo(0,1000);");
//			Thread.sleep(2000);
//			js.executeScript("window.scrollBy(0,-100);");
			
			WebElement elem = driver.findElement(By.xpath("//button[@class='dropbtn']"));
			
			js.executeScript("arguments[0].scrollIntoView(true);", elem); 
	}
}
