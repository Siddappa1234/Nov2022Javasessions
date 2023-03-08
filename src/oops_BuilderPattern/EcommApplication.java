package oops_BuilderPattern;

public class EcommApplication 
{
    public EcommApplication login()
    {
    	System.out.println("login to app");
    	return this;
    }
    public EcommApplication login(String un,String pwd)
    {
    	System.out.println("login to app:"+un+":"+pwd);
    	return this;
    }
    public EcommApplication doSearch(String ProductName)
    {
    	System.out.println("searchProd:"+ProductName);
    	return this;
    }
    public EcommApplication doSearch(String ProductName,int price)
    {
    	System.out.println("searchProd:"+ProductName+":price"+price);
    	return this;
    }
    public EcommApplication doSearch(String ProductName,int price,String brand)
    {
    	System.out.println("searchProd:"+ProductName+":price"+price+"brand"+brand);
    	return this;
    }
    public EcommApplication addtoCart(String ProductName)
    {
    	System.out.println("Adding to cart:"+ProductName);
    	return this;
    }
    public EcommApplication doPayment(String cc,int cvv)
    {
    	System.out.println("making payment using:"+cc+":"+cvv);
    	return this;
    }
    public EcommApplication doPayment(String upi) {
		System.out.println("making payment using : " + upi);
		return this;
    }
    public EcommApplication doPayment(String paypalID,String Password)
    {
    	System.out.println("making payment using:"+paypalID+":"+Password);
    	return this;
    }
    public EcommApplication generateOrder()
    {
    	System.out.println("Your order is:"+12345);
    	return this;
    }
    public EcommApplication logout()
    {
    	System.out.println("logout");
    	return this;
    }
	
	}


