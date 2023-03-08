package oops_Encapsulation;

public class Browser {

	public  void launchBrowser()
	{
		System.out.println("trying to launch Browser");
		checkRAM();
		checkVersion();
		checkOS();
		checkBrowserService();
		System.out.println("Chrome is launched");
	}
	
	private void checkRAM()
	{
		System.out.println("CheckRAM");
	}
	private void checkVersion()
	{
		System.out.println("CheckVersion");
	}
	private void checkOS()
	{
		System.out.println("CheckOS");
	}
	private void checkBrowserService()
	{
		System.out.println("CheckBrowser services");
	}
	
	
}


