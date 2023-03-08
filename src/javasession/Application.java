package javasession;

public class Application 
{
   // Method overloading
	// Witnin the same class : we have diff methods
	//1.With the same name
	//2. with diff no of parameters with diff type 
	//3.with diff sequence of parameters 
	//4. retrurn type does not matter 
	
	public void test()
	{
		System.out.println("test-0 para");
	}
	public void test(int i)
	{
		System.out.println("1 parmeter:+");
	}
	public void test(String i)
	{
		System.out.println(" ");
	}
	public void test(int i, int j)
	{
		System.out.println(" ");
	}
	public void test(String i, int j)
	{
		System.out.println(" ");
	}
	//Examples
	// Login 
	public void login()
	{
		
	}
	public void login (String un, String pwd)
	{
		
	}
	public void login (String un, String pwd,String role)
	{
		
	}
	public void login (String un, String pwd,String role,int otp)
	{
		
	}
	
	// Search 
	
	public void search ()
	{
		
	}
	public void search(String productName, int price )
	{
		
	}
	public void search(String productName, int price,String colour  )
	{
		
	}
	// Payment
	public void dopayment(String cc, String CVV)
	{
		
	}
	public void dopayment(String UPI)
	{
		
	}
	public void dopayment(String un, String pwd, int otp)
	{
		
	}
	public void go(float f)
	{
		System.out.println("float value is "+f);
	}
	public void go(double d)
	{
		System.out.println("double value is "+d);
	}
	public static void main(String[] args) 
	{
		Application obj= new Application();
		obj.test();
		obj.test(20);
		obj.test("Samu");
		obj.go(12.33f);

	}

}
