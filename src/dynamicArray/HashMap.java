package dynamicArray;

public class HashMap {

	public static void main(String[] args) 
	{
		//<K,V>
		// name= naveen
		// Marks=100
		// Seller=Seller@gmail.com
		// does not maintain the order 
		
		HashMap<String,String>empmap= new HashMap<String,String>();
		empmap.put("Naveen", "SDET");
		empmap.put("Amrita", "SDET1");
		empmap.put("Rashmi", "SDET2");
		empmap.put("Ravi", "SDET Manager");
		empmap.put("Kareem", "VP");
		empmap.put("Kareem", "CEO");
		empmap.put("Kareem", "CEO");
		empmap.put("sheela", null);
		empmap.put(null, "CTO");
		empmap.put(null, null);
		
		System.out.println(empmap.get("Rashmi"));
		System.out.println(empmap.get("kareem"));
		System.out.println(empmap.get("Tom"));
		System.out.println(empmap.get("Sheela"));
		System.out.println(empmap.get(null));
		System.out.println(empmap);
		
		HashMap<String,Integer>browsermap= new HashMap<String, Integer>();
		browsermap.put("chrome", 100);
		browsermap.put("firefox", 90);
		browsermap.put("ie", 7);
		browsermap.put("Safari", 10);
		browsermap.put("Safari", 100);
		
		System.out.println(browsermap);
		System.out.println(browsermap.get("Safari"));
		
		
		String s="123";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		int number=989776;
		int reverse=0;
		while(number !=0)
		{
			int remainder= number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println(reverse);
		

	}

}
