package javasession;

public class Company {
	
	// class vars
	String name;
	int Empcount;
	String hq;
	boolean status;

	public static void main(String[] args) 
	{
		Company Obj= new Company();
		Obj.name="IBM";
		System.out.println(Obj.name);
		System.out.println(Obj.status);

	}

}
