package oops_Encapsulation;


public class TestEmp {

	public static void main(String[] args) 
	{
		Employee e1= new Employee();
		e1.name="Tom";
		e1.age=25;
		
		e1.setsalary(12.33);
		System.out.println(e1.getsalary()+" "+e1.name+" "+e1.age);
		
		// Post
		
		Company c1= new Company("IBM",1000,500);
		
        // c1.setName("IBM");
	     //c1.setEmpCount(100);
	    // c1.setSharePrice(500);
		
		// Get
		 System.out.println(c1.getName());
		 System.out.println(c1.getSharePrice());
		 System.out.println(c1.getEmpCount());// 1000
		
		// put 
		 c1.setEmpCount(2000);
		
		// get
		 System.out.println(c1.getName());
		 System.out.println(c1.getSharePrice());
		 System.out.println(c1.getEmpCount());
		
		 Employee e3 = new Employee();
		 e3.name = "Tom";
		 e3.age = 25;
		
		
		e3.setsalary(12.33);
		System.out.println(e3.getsalary() + " " + e3.name + " " + e3.age);
		
		
		//POST
		Company c2 = new Company("IBM", 1000, 500);
				
		//GET
		System.out.println(c2.getName());
		System.out.println(c2.getSharePrice());
		System.out.println(c2.getEmpCount());//1000
		
		//PUT
		c1.setEmpCount(2000);
		
		//GET
		System.out.println(c1.getName());
		System.out.println(c1.getSharePrice());
		System.out.println(c1.getEmpCount());//2000
		
		
		
		//register:
		RegisterPage reg = new RegisterPage("Tom", 25, "Bangalore 566611", "01-01-1990");
		
		System.out.println(reg.getName());
		System.out.println(reg.getdob());
		System.out.println(reg.getaddress());

		
		reg.setAddress("Pune 456677");
		System.out.println(reg.getName());
		System.out.println(reg.getaddress());
		
		
		RegisterPage reg1 = new RegisterPage("Ravi", 30);
		reg1.setdob("02-02-1987");
		reg1.setAddress("Delhi");
		
		//
		Browser br = new Browser();
		br.launchBrowser();
		
	}	

	}


