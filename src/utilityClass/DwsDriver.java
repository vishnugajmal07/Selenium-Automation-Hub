package utilityClass;

public class DwsDriver extends DwsBaseClass
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("firefox");
		Thread.sleep(2000);
		login();
		Thread.sleep(1000);
		logout();
		Thread.sleep(1000);
		postCondition();
	}
}
