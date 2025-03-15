package popUpHandel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='trd_6_15/03/2025']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='rdatelbl']")).click();
		Thread.sleep(1000);
		for(;;)
		{
			try {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//li[@id='fst_6_07/06/2025']")).click();
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
			}
		}
	}
}
