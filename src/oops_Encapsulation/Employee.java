package oops_Encapsulation;

public class Employee 
{
    public String name;
    public int age;
    private double salary;
    
	// public getter and setter 
    public double getsalary()
	{
		return salary;
	}
    public void setsalary(double salary)
    {
    	this.salary=salary;
    }

}
