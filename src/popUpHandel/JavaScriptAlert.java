package popUpHandel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display ')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		alt.sendKeys("Vishnu");
		alt.accept();
		
		WebElement ele = driver.findElement(By.xpath("//p[@id='demo1']"));
		
		if (ele.isDisplayed()) 
		{
			System.out.println("Element is displayed");
		} 
		else 
		{
			System.out.println("Element is not displayed");
		}
	
	}
}
