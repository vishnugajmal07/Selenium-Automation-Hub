package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpProgram4 
{
		public static void main(String[] args)
		{
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/login.php/");
				
				driver.close();
		}
}
