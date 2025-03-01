package utilityClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting 
{
	
	public static void crossBrowserTesting(String browser)
	{
		if(browser.equals("chrome"))
		{
			ChromeDriver driver=new ChromeDriver();
		}
		else if (browser.equals("edge"))
		{
			EdgeDriver driver1=new EdgeDriver();
		}
		else if (browser.equals("firefox"))
		{
			FirefoxDriver driver2=new FirefoxDriver();
		}
	}

		public static void main(String[] args)
		{
			crossBrowserTesting("edge");
		}
}
