package javasession;

import java.util.Arrays;

public class Customer 
{
    // WAF
	// get EmployeeDevices(Emp Name_string)
	// return device list
	public String[] getEmployeeDevice(String EmpName)
	{
		System.out.println("getting device information for Employee:"+EmpName);
	
	if(EmpName.equals("Ravi"))
	{
		String devices[]= {"Macbook","ipad","iph13"};
		return devices;
	}
	else if(EmpName.equals("Samu"))
	{
		String devices[]= {"windows","Samsang10","Nokia"};
		return devices;
	}
	else if(EmpName.equals("Rashmi"))
	{
		String devices[]= {"Windows11","Samsang 11","Iphone","AirtelSim"};
		return devices;
	}
	else 
	{
		System.out.println("Emp name is not found-------");
	}
	return null;
	}
	public static void main(String[] args) 
	{
		Customer obj= new Customer();
		String d[]=obj.getEmployeeDevice("Samu");
		System.out.println(Arrays.toString(d));
		System.out.println(d.length);
	}

}
