package WaitingCondition;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait2 
{
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://omayo.blogspot.com/");
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
			driver.findElement(By.xpath("//a[text()='Facebook']")).click();
			driver.navigate().back();
			WebElement timeBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='timerButton")));
			timeBtn.click();
			
			Alert al=driver.switchTo().alert();
			al.accept();
		
		}
}
