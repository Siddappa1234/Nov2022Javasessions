package oops_inheritance;

public class BMW extends Car{

	@Override
	public void start()
	{
     System.out.println("BMW --start");
	}
	public void autoparking()
	{
		System.out.println("BMW---autoparking");
	}
	// method hiding
	public static void billing()
	{
		System.out.println("BMW--Billing ");
	}
	@Override
	public void payment(String cc, int cvv)
	{
		System.out.println("BMW payment using : " + cc + " :" + cvv);
	}
	@Override
	public void payment(String upi)
	{
		System.out.println("BMW payment using :"+upi);
	}
//	@Override
//	public void engine()
//	{
//		System.out.println("BMW --engine");
//	}
}
