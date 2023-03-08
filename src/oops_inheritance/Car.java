package oops_inheritance;

public class Car extends Vehicle
    {

	public void start()
	{
		System.out.println("car ----start");
	}
	public void stop()
	{
		System.out.println("car----stop");
	}
	public void refuel()
	{
		System.out.println("car-----refuel");
	}
    public static void billing ()
    {
    	System.out.println("car---filling");
    }
    public static final void display()
    {
    	System.out.println("car ---running");
    }
    public void payment(String cc,int cvv)
    {
    	System.out.println("car payments using :"+cc+":"+cvv);
    }
    public void payment(String upi)
    {
    	System.out.println("car payment using :"+upi);
    }
//    @override
//    public void engine()
//    {
//    	System.out.println("car--engine");
//    }
}
