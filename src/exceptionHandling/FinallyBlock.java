package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args)
	{
		System.out.println("hi");
		
		try
		{
			int i=9/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("bye ");
		
//		 connect with DB orale--PASS
//		 un, pwd, server ip,port
//		 hit the sql--PASS
//		 try
//		{
//			get the result from the db--FAIL-Exception
//		}
//		catch(){ log}
//		 finally
//		disconnect with DB
//	    }
//	    system.out.println("continue shopping");
//		logout 
//			
//		}

	}

}
