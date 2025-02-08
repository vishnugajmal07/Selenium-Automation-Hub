package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpProgram3
{
		public static void main(String[] args)
		{
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://github.com/");
				
//				driver.close();
		}
}
