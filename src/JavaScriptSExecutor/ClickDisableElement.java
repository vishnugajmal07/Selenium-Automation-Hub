package JavaScriptSExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickDisableElement 
{
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get("https://www.oracle.com/in/java/technologies/downloads/");
			
			WebElement jdk = driver.findElement(By.linkText("jdk-17.0.14_linux-x64_bin.rpm"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView(false);", jdk);
			jdk.click();
			WebElement disable_button = driver.findElement(By.linkText("Download jdk-17.0.14_linux-x64_bin.rpm"));
			js.executeScript("arguments[0].click();", disable_button);
		}
}
