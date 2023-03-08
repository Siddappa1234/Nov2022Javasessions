package javasession;

public class Car 
{
    String name;
    int price;
    String colour;
    static final int wheels=4;
    
    public void start()
    {
    	System.out.println(" car---start");
    }
    public static void speedTest()
    {
    	System.out.println(" car---speedTest");
    }
	public static void main(String[] args) 
	{
		Car c1= new Car();
		c1.name="BMW";
		c1.price=90;
		c1.colour="Red";
	
		
		Car c2= new Car();
		c2.name="Audi";
		c2.price=80;
		c2.colour="colour";
	
	
		Car c3= new Car();
		c3.name="Honda";
		c3.price=20;
		c3.colour="Black";
		// How to access/assign static variables
		// No need to use obj
		// 1. Direct calling
		 System.out.println("Wheels");
		 System.out.println(c1.name+" "+c1.price+" "+c1.colour+" "+wheels);
		 // 2.By using classname
		 System.out.println();
		 System.out.println(c2.name+" "+c2.price+" "+c2.colour+" "+Car.wheels);
		 
		 // how to call static methods 
		 // No need to use obj 
		 // 1. Direct calling 
		 speedTest();
		 c1.start();
		 
		 // 2. By Using Classname;
		 Car.speedTest();
		 
		//static stuff can be accessed by obj ref name with warning:
		 c1.speedTest();
		 System.out.println(c1.wheels);
			
	}

}
