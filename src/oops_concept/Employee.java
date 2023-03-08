package oops_concept;

public class Employee {
	
	public Employee()
	{
		System.out.println("Default constructor");
	}
    public Employee(int a)
    {
    	System.out.println("1 Parameter constructor --"+a);
    }
    public Employee(int a, int b)
    {
    	System.out.println("2 Parameter ---"+(a+b));
    }
    
	public static void main(String[] args) 
	{
		Employee e1= new Employee();
		Employee e2= new Employee(10);
		Employee e3= new Employee(10,20);

	}

}
