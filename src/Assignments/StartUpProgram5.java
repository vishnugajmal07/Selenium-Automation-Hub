package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpProgram5 
{
	public static void main(String[] args)
	{
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://app.joinsuperset.com/students/login");
			
			driver.close();
	}
}
