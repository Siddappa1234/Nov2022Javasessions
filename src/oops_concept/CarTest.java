package oops_concept;

public class CarTest {

	public static void main(String[] args) 
	{
		// added the car data 
		// Post-create 
		Car c1= new Car("Audio",50);
		Car c2= new Car("BMW","White");
		Car c3= new Car("Honda",20,false);
		Car c4= new Car("Tesla","Black",90,true);
		
		// fetching the data for the car
		// get
		
		System.out.println(c1.name+" "+c1.colour+" "+c1.isAutomatic);
		System.out.println(c4.name+" "+c4.colour+" "+c4.isAutomatic);

	}

}
