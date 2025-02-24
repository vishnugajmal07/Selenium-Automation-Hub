package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbRegister 
{
		public static void main(String[] args) throws InterruptedException
		{
				String expected_Url="https://www.facebook.com/";
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
				
				String actual_Url=driver.getCurrentUrl();
				
				if(expected_Url.equals(actual_Url))
				{
					
					System.out.println("We are in Facebook Login Page");
					
					WebElement createACbtn=	driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
				
					if(createACbtn.isEnabled())
					{
						System.out.println("Button is Enable");
						createACbtn.click();
						
						driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vishnu");
						driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gajmal");
						
						WebElement webElem = driver.findElement(By.xpath("//select[@id='day']"));
						
						Select selD,selM,selY,selPronoun;
						
						selD=new Select(webElem);				
						selD.selectByVisibleText("7");
						
						WebElement web = driver.findElement(By.xpath("//select[@id='month']"));
						selM=new Select(web);
						selM.selectByVisibleText("Jan");	
						
				
						WebElement web1 = driver.findElement(By.xpath("//select[@id='year']"));
						selY=new Select(web1);
						selY.selectByVisibleText("2004");
						
						driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
						
						driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("23456789");
						driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vg12345");	
						
					}
					else
					{
						System.out.println("Button is not Enabled");
					}
					
					Thread.sleep(2000);
					driver.close();
				}
		}
}
