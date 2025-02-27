package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagateMethod
{
		public static void main(String[] args) throws InterruptedException
		{
			//Open the browser
			 ChromeDriver driver=new ChromeDriver();
			 
			 //maximize the browser
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 
			 //Enter into DWSpageUrl
			 driver.get("https://demowebshop.tricentis.com/");
			 Thread.sleep(2000);
			 
			 //Nabigate to fb page
			 driver.navigate().to("https://www.facebook.com/");
			 Thread.sleep(2000);
			 
			 //Navigate back
			 driver.navigate().back();
			 Thread.sleep(2000);
			 
			 //Refresh the page
			 driver.navigate().refresh();
			 Thread.sleep(2000);
			 
			 //navigate forward
			 driver.navigate().forward();
			 Thread.sleep(2000);
			 
//			 driver.close();
			 
		}
}
