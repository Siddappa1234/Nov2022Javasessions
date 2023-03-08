package exceptionHandling;

public class Apptest {

	public static void main(String[] args) 
	{
		String data= null;
		if(data==null)
		{
			throw new ApplicationException("DATA NOT FOUND eXCEPTION");
		}

	}

}
