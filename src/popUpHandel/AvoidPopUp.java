package popUpHandel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class AvoidPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("disable-notifications");
			
			WebDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.easemytrip.com/");
	}
}
