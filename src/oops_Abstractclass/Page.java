package oops_Abstractclass;

public abstract class Page 
{
   public Page()
   {
	   System.out.println("Page -- const---");
   }
	public Page(int i)
	{
		System.out.println("Page --const--"+i);
	}
	public abstract void title();
	
	public abstract void title(int i);
	
	public abstract void url();
	
	public final void displayLogo()
	{
		System.out.println("Page ---Logo");
	}
	public void PageLoadingTime()
	{
		System.out.println("PageLoading Time is 10 Sec");
	}
	public static void PageCycle()
	{
		System.out.println("PageCycle");
	}
	
	public void privacyPolicy()
	{
		System.out.println("Page----privacyPolicy");
	}

}
