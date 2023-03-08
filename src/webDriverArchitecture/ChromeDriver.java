package webDriverArchitecture;

public class ChromeDriver implements WebDriver{

	public ChromeDriver()
	{
		System.out.println("ChromeDriver is launched ");
	}
	@Override()
	public void findElement (String Element)
	{
		System.out.println("findElement:"+Element);
	}
	@Override
    public void get(String url)
    {
		System.out.println("enter url:"+url);
    }
	@Override
	public String getTitle()
	{
		System.out.println("getting the page title");
		return "Naveen Automation Labs";
	}
	@Override
	public void click(String element)
	{
		System.out.println("clicking on element:"+element);
	}
	@Override
	public void sendKeys(String element,String value)
	{
		System.out.println("Entering the value:"+value+"into"+element);
	}
	@Override
	public void close()
	{
		System.out.println("close Browser");
	}
}
