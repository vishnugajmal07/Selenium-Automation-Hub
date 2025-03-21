package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://shoppersstack.com/");
			Thread.sleep(8000);
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']")));
			login.click();
			WebElement createAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Account']")));
			createAccount.click();
			
		}
}
