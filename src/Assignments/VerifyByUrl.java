package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUrl
{
		public static void main(String[] args) throws InterruptedException 
		{
				String expecte_Url="https://www.redbus.in/";
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.get("https://www.redbus.in/");
				
				String actual_Url=driver.getCurrentUrl();
				
				if(expecte_Url.equals(actual_Url))
				{
					System.out.println("We are in RedBus Page");
				}
				else
				{
					System.out.println("We are not in RedBus page");
				}
				
				Thread.sleep(2000);
				
				driver.close();
		}
}
