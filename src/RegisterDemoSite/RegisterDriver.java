package RegisterDemoSite;

public class RegisterDriver extends Register
{
	public static void main(String[] args) throws InterruptedException 
	{
		preCondition("firefox");
		register();
	}
}
