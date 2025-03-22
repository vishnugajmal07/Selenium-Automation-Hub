package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DynamicNameScreenShot 
{
		public static void main(String[] args) throws IOException
		{
			LocalDate date = LocalDate.now();
			String time = date.toString().replace(':', '-');
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File from = ts.getScreenshotAs(OutputType.FILE);
			File to = new File("D:\\Java\\login"+ time+".jpg");
			
			FileHandler.copy(from, to);
			
			
			
		}
}
