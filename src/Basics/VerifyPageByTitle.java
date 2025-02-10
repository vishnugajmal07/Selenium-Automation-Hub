package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageByTitle
{
		public static void main(String[] args) throws InterruptedException 
		{
				String expected_Title="Demo Web Shop";
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.get("https://demowebshop.tricentis.com/");
				
				String actual_Title=driver.getTitle();
				
				if(expected_Title.equals(actual_Title))
				{
					System.out.println("We are in DWS Page");
				}
				else
				{
					System.out.println("we are not in dws page");
				}
				
				driver.close();
		}
}
