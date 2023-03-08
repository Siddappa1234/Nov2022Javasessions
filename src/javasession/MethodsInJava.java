package javasession;

public class MethodsInJava {
	
	// function:functions are Independent cannot create a function inside function
    
	// data Members
	//1.class vars
	//2.class methods
	// Void: No return: function cannot return anything 
	
	//1.No Input and no return;
	// return type:void
	public void test()
	{
		System.out.println("test method");
		int a=10;
		int h=15;
		System.out.println(a+h);
	}
	//2.No input and some return
	// return type:int 
	public int getBillAmount()
	{
		System.out.println("getBilling Amount ");
		int foodBills=100;
		int drinkBills=50;
		int totalAmount=foodBills+drinkBills;
		return totalAmount;
	}
	public String getEmployeeName()
	{
		System.out.println("getEmployeeName");
		String name="samu";
		return name;
	}
	public String getName()
	{
		System.out.println("getName");
		return "Selenium";
		
	}
	public int getNumber()
	{
		return 100;
	}
	public boolean isElementExist()
	{
		System.out.println("check Element is present ");
		boolean flag=true;
		return  flag;
	}
	public int getMarks()
	{
		int a=100;
		int bonus=5;
		int negative=10;
		int finalmarks=a+bonus-negative;
		return finalmarks;
	}
	// 3. Some Input and some return
	// WAF :writing a function 
	// two variable:a and b
	// return sum of these two numbers
	public int getSum(int a, int b)
	{
		System.out.println("sum of two numbers--");
		int sum=a+b;
		return sum;
	}
	// WAF:
	// Input Parameters: int , double
	// return multiplication of these two numbers
	public double getmultiplication(int x, double y)
	{
		System.out.println("get multiplication");
		double mul=x*y;
		return mul;
	}
	public String getEmpSalaryInfo(String empName, int bonusAmount)
	{
		System.out.println("emp salary");
		return empName+" :"+bonusAmount;
	}
	public static void main(String[] args) 
	{
		// call the function:we have to create objects 
		MethodsInJava obj= new MethodsInJava();
		obj.test();
		
		int m1=obj.getBillAmount();
		System.out.println(m1-10);

		System.out.println(obj.getBillAmount());
		
		String emp=obj.getEmployeeName();
		System.out.println(emp);
		
		if(obj.isElementExist());
		{
			System.out.println("click on Element");
		}
		int s1= obj.getSum(10, 20);
		System.out.println(s1);
		
		int s2= obj.getSum(10, 20);
		System.out.println(s1);
		
		double mul1= obj.getmultiplication(10,2.2);
		System.out.println(mul1);
		
		String EmpInfo=obj.getEmpSalaryInfo("Samu", 2);
				System.out.println(EmpInfo);
	}

}
