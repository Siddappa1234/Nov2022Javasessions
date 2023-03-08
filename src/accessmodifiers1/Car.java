package accessmodifiers1;

public class Car {
	
	public String name;
	private int price;
	protected String colour;
	String seller;

	public static void main(String[] args) 
	{
		final int i=10;// local
		
		Car c= new Car();
		c.price=100;
		
	}

}
