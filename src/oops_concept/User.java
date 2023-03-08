package oops_concept;

public class User 
{
     // class vars
	String name;
	int age;
	String email;
	String password;
	String phone;
	
	public boolean forgotpwd()
	{
		return true;
	}
	public User (String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public User(String name, int age, String email) {
		//super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public User(String name, int age, String email, String password) {
		//super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	
	public User(String name, int age, String email, String password, String phone) {
		//super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	public static void main(String[] args) 
	{
		User u1= new User("Tom", 25);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.email);
		
		//-------------------------------//
    
		User u2= new User("Lisa",30,"Lisa@gmail.com");
		System.out.println(u2.name);
		System.out.println(u2.email);
		System.out.println(u2.password);
		
		User u3= new User("Nisha",25,"Nisha@gmail.com","Nisha@123","9632908131");
		System.out.println(u3.name+" "+u3.phone);
	}

}
