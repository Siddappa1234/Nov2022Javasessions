package oops_concept;

public class Car
{
     String name;
     String colour;
     int price;
     boolean isAutomatic;
  
     public double getCarMileage()
     {
    	 double a=12.33;
    	 double b=23.44;
    	 double mg=a+b;
    	 return mg;
     }
     
	public Car(String name, String colour) 
	{
		
		this.name = name;
		this.colour = colour;
	}
    
	public Car(String name, int price) {
		
		this.name = name;
		this.price = price;
	}

	public Car(String name, int price, boolean isAutomatic) {
		
		this.name = name;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}
    
	
	public Car(String name, String colour, int price, boolean isAutomatic) {
		
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}

	

}
