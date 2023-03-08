package javasession;

public class Employee {
	
	// class :category of objects , blueprints or template of objects 
	// Object is a physical entity 
	
	// class vars
	  String name;
	  int age;
	  String city;
	  double salary;

	public static void main(String[] args) 
	{
		//created the object of class 
		// using new keyword 
		
	 Employee e1= new Employee ();
	 e1.name="Tom";
	 e1.age=25;
	 e1.city="LA";
	 e1.salary=12.53;
	 
	 System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
	 
	  Employee e2= new Employee ();
	 
	 System.out.println(e2.name);
	 System.out.println(e2.age);
	 System.out.println(e2.salary);
	 
	 Employee e3= new Employee ();
	 e3= null;// Null reference object 
	 e3.name="Naveen";// NPE
	 
//	 // Object without reference -No of Object
//	 new Employee().name="Naveen";
//	 new Employee().age=25;
//	 new Employee().salary=12.33;
//	 new Employee().city="Harugeri";
//	
	 

	}

}
