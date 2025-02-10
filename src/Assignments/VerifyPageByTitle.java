package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageByTitle 
{
		public static void main(String[] args) throws InterruptedException 
		{
				String expected_Title="Movie Tickets, Plays, Sports, Events & Cinemas nearby - BookMyShow";
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://in.bookmyshow.com/");
				
				String actual_Title=driver.getTitle();
				
				if (expected_Title.equals(actual_Title))
				{
						System.out.println("We are in BookMyShow Page");
				}
				else
				{
					System.out.println("We are not in BookMyShow page");
				}
				
				Thread.sleep(2000);
				
				driver.close();
				
		}
}
