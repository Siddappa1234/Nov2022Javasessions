package oops_BuilderPattern;

public class Usershopping {

	public static void main(String[] args) 
	{
	EcommApplication app= new EcommApplication();
	app.login("naveen@gmail.com","naveen@123")
	.doSearch("macbook pro")
	  .addtoCart(" prowindow")
       .doPayment("1212 1213 1312",899)
	    .generateOrder()
	      .logout();
	   
	   System.out.println("----------------");
	   app.login("naveen@gmail.com","naveen@123")
	    .doSearch("tShirt",5000,"Nike")
	     .addtoCart("tshirt")
	       .logout();
	   
	   System.out.println("-------------------");
	   app.login("naveen@gmail.com", "naveen@123")
	    .addtoCart("tshirt")
	     .doPayment("Naveen@hdfc")
	      .generateOrder()
	        .logout();
  
	   System.out.println("-----------------");
	   app.login("Naveen@gmail.com","Naveen@123")
	   .logout();
	}

	
		
	}


