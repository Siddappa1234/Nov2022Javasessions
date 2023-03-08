package oops_Abstractclass;

public class PageTest {

	public static void main(String[] args) 
	{
		LoginPage lp= new LoginPage(10);
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.PageLoadingTime();
		lp.resetPWD();
		
		Page.PageCycle();
		LoginPage.pageCycle();
		lp.privacyPolicy();
		
		// Top casting 
		// child class object can be referred by parent class
		
		Page pg= new LoginPage();
		pg.title();
		pg.url();
		pg.displayLogo();
		pg.PageLoadingTime();
		pg.privacyPolicy();
		
		// Down casting
	}

}
