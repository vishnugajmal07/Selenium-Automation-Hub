package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageByUrl 
{
		public static void main(String[] args) throws InterruptedException 
		{
				String expexted_Url="https://demowebshop.tricentis.com/";
			
				//Open the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Maximize the Window
				driver.manage().window().maximize();
				
				//Waiting Condition
				Thread.sleep(2000);
				
				
				//Enter into url
				driver.get(" ");
				
				String actual_Url=driver.getCurrentUrl();
				
				if(actual_Url.equals(expexted_Url))
				{
					System.out.println("We are in the DWS page");
				}
				else
				{
					System.out.println("We are not in dws page");
				}
				
				Thread.sleep(2000);
				
				driver.close();
		}
}
