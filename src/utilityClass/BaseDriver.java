package utilityClass;



public class BaseDriver extends BaseClass 
{
		public static void main(String[] args) throws InterruptedException 
		{
			precondition();
			Thread.sleep(2000);
			login();
			Thread.sleep(2000);
			logout();
			
			postCondition();
		}
}
