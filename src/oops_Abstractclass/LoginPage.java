package oops_Abstractclass;

public class LoginPage extends Page
{
   public LoginPage()
   {
	   System.out.println("LP--const---");

	}
   public LoginPage(int i)
   {
	   System.out.println("LP--const--"+i);
   }
   @Override
   public void title()
   {
	   System.out.println("LP--title");
   }
   @Override
   public void title(int i)
   {
	   // ToDo Auto generated method stub
   }
   @Override
   public void url()
   {
	   System.out.println("LP---url");
   }
   public void resetPWD()
   {
	   System.out.println("LP--resetPWD");
   }
   @Override
   public void PageLoadingTime()
   {
	   System.out.println("Login page loading time 5 seconds ");
   }
   public  static void pageCycle()
   {
	   System.out.println("Login page Cycle");
   }
   @Override
   public void privacyPolicy()
   {
	   System.out.println("LP---privacyPolicy");
	   //int x=10;
	   //assert x>20;"FAIL";
   }
}
