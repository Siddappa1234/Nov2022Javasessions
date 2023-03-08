package oops_inheritance;

public class TestCar {

	public static void main(String[] args)
	{
		BMW b= new BMW();
		b.start();// Overridden
		b.stop();// inherited 
		b.refuel();// inherited 
		b.autoparking();// individual
		
		BMW.billing();
		Car.billing();
		
		BMW.display();
	   // b.running();
		
		b.payment("Naveen@okicic");
		b.engine();
		
		System.out.println("--Audi--");
		Audi au= new Audi();
		au.theftSafety();
		au.start();
		au.engine();
		System.out.println("---------------------");
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.payment("Naveen@hdfc");
		c.engine();
		System.out.println("---------");
		
		// child class object can be referred by parnet class ref variable 
		
		// Top/up casting 
		
		Car c1= new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.petrolEngine();
		
		System.out.println("-------");
		
		// Child class object can be referred by grand parnet class ref variable
		
		// Top/up casting 
		
		Vehicle v= new BMW();
		v.petrolEngine();
		v.engine();
		
		// Down casting 
		// Parnet class object can be referred by child class ref variable 
		
		//BMW b1= (BMW)new Car(); //class cast expection 
		
		BMW b2 = (BMW)new Vehicle();

	}

}
