package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;


public class StartUpProgram2 
{
		public static void main(String[] args)
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.linkedin.com/feed/");
				
				driver.close();
		}
}
