package JavaScriptSExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.linkText("Create new account")).click();
			Thread.sleep(2000);
			WebElement custom_gender = driver.findElement(By.id("custom_gender"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].value='Tranz';",custom_gender);
		}
}
