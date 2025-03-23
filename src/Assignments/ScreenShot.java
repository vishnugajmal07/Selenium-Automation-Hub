package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{	
	public static void main(String[] args) throws IOException
	{
		LocalDate date = LocalDate.now();
		String time = date.toString().replace(':', '-');
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://x.com/VijaySethuOffl");
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		WebElement profilePic = driver.findElement(By.xpath("(//div[@data-testid='UserAvatar-Container-VijaySethuOffl'])[1]"));
		File from = profilePic.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\Java\\Sethupati"+ time+".jpg");
		
		FileHandler.copy(from, to);
		
		driver.quit();
	}

}
