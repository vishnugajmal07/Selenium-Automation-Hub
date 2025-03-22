package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot 
{
	public static void main(String[] args) throws IOException
	{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			
			WebElement icon = driver.findElement(By.className("header-logo"));
			File from = icon.getScreenshotAs(OutputType.FILE);
			File to = new File("D:\\\\Java\\\\demowebshop.jpg");
			
			FileHandler.copy(from, to);
	}
}
