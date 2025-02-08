package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpProgram 
{
		public static void main(String[] args) 
		{
			//Open the browser
			ChromeDriver driver=new ChromeDriver();
			
			//Maximize the Browser
			driver.manage().window().maximize();
			
//			Enter into URL
			driver.get("https://demowebshop.tricentis.com/");
			
			//Close the Browser
			driver.close();
			
		}

	
}
