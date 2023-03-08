package oops_concept;

public class Loginpage 
{
    String username;
    String password;
    
	public Loginpage(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
    public boolean doLogin()
    {
    	System.out.println("Enter username:"+username);
    	System.out.println("Enter password:"+password);
    	System.out.println("click on loginbutton");
    	System.out.println("user is logged in");
    	return true;
    }
    public void resetpassword()
    {
    	System.out.println("reset pwd:"+password );
    }
	
	}


