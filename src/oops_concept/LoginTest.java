package oops_concept;

public class LoginTest {

	public static void main(String[] args) 
	{
		Loginpage lp1= new Loginpage("admin@gmail.com","admin@123");
		if(lp1.doLogin())
		{
			System.out.println("display the menu items");
		}
        Loginpage lp2= new Loginpage("Naveen@gmail.com","naveen123");
        System.out.println(lp2.username);
        System.out.println(lp2.password);
        
        Loginpage lp3= new Loginpage("seller@gmail.com","seller@123");
	}

}
