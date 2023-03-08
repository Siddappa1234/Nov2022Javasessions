package javasession;

public class TimeComplexityconcept {

	public static void main(String[] args) 
	{
		// BIG 0:O(n) N is no iterations
		int i = 1;
		System.out.println(i);// O(n)
		
		// ------------------//
		String s = "Hello Indu";
		System.out.println(s);// O(1)
		// ------------------//
		
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);// O(1)
		// --------//
		
		for (int p = 1; p <= 10; p++) {
			System.out.println(p);//O(n)
		}
        //------------------//
		for (int v=1;v<=100;v++)
		{
			System.out.println(v);//O(n)
			//1+n+n+n=1+3n=3n+1 ------------Linear equation
			// 3n+1=3n===>O(3n)----O(n)
			
		}
	}

}
