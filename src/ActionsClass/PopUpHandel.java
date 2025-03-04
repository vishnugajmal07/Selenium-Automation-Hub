package ActionsClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpHandel 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		WebElement rigtClick = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		act.contextClick(rigtClick).click(copy).perform();
		
		Thread.sleep(2000);
		try
		{
			rigtClick.click();
			System.out.println("Popup is not displayed");
		} 
		catch (Exception e) {
			System.out.println("PopUp is displyed");
		}
		
		driver.quit();
		
	}
}
