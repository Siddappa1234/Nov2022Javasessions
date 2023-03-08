package oops_Encapsulation;

public class RegisterPage 
{
    private String name;
    private int age;
    private String address;
    private String dob;
    
	public RegisterPage(String name, int age, String address, String dob) {
		//super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.dob = dob;
	}
    
	public RegisterPage(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public RegisterPage(String name) {
		
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int Age)
	{
		this.age=age;
	}
	public String getaddress()
	{
		return address;
	}
	public void setAddress(String Address) 
	{
		this.address=address;
	}
	public String getdob()
	{
		return dob;
	}
	public void setdob(String dob)
	{
		this.dob=dob;
	}

}
