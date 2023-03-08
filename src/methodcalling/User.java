package methodcalling;

public class User
{
     private String name;
     int age;
     String city;
     
     static double salary;
     public User(String name, int age, String city)
     {    
    	 this(city);
    	 this.name=name;
    	 this.age=age;
    	 this.city=city;
     }
     
     public User(String city)
     {
    	 this.city="Paris";
     }
     public User(String city, int age)
     {
    	 this.city="Paris";
     }
     public void login(String un, String pwd, User us)
     {
    	 logout();
    	 name="Tom";
    	 User.salary=12345;
     }
     public void logout() 
     {
 		int x = 10;
     }
	public static void main(String[] args) 
	{
		User u1= new User("gaurav",30, "Bangalore");
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);

	}

}
