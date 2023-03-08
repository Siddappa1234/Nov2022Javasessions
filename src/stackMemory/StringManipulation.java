package stackMemory;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) 
	{
		String str= " hi this is my java code and i am so happy";
		System.out.println(str.length());
		int len=str.length();
		int li=0;
		int hi= len-1;
		System.out.println(hi);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(15));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));  String index out of bond exception 
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf("java"));
		String m1="Welcome admin";
		if(m1.indexOf("admin")==8)
		{
			System.out.println("admin user is present ");
		}
		else 
		{
			System.out.println("FAIL");
		}
		System.out.println(str.indexOf('i'));// 1 occurence of i
		//System.out.println(str.indexOf('i',2));// 2 occurence of i
		System.out.println(str.indexOf('i',str.indexOf('i')+1));// 2 occurence of i
		System.out.println(str.indexOf("python"));
		
		String m2= "Product name is Macbook";
		if(m2.indexOf("Macbook")!=-1)
		{
		

	     }
		System.out.println("---------------------------------------");
		String test="this is java Program";
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		
		// trim
		String p=" helloworld   ";
		System.out.println(p.trim());
		
		// Replace
		
		String p1= "helloworld";
		System.out.println(p1.replace(" ", " "));
		System.out.println(p1.replace(" ", "m"));
		
		System.out.println("-----------------");
		
		 String dob="01-01-1990";
		 System.out.println(dob.replace("- ", "/"));
		 
		 String messg= " I LOVE JAVA ";
		 System.out.println(messg.replace("LOVE","Hate"));
		 
		 String q= " helloworld ";
		 System.out.println(q.replaceAll(" ", " "));
		 
		 // Equals 
		 
		 String e1= "hello selenium";
		 String e2="hello Selenium";
		 System.out.println(e1.equals(e2));
		 System.out.println(e1.equalsIgnoreCase(e2));
		 System.out.println(e1.equalsIgnoreCase(e2.trim()));
		 
		 // contains 
		 
		 String tg= "Welcome to Naveen Training ";
		 System.out.println(tg.contains("Naveen"));
		 if(tg.contains("Naveen"))
		 {
			 System.out.println("enroll for it ");
		 }
		 else 
		 {
			 System.out.println(" no need to enroll for it ");
		 }
		 
		System.out.println("-------------------------------");
		
		// split
		
		String lang= "JAVA-PYTHON-RUBY-DOTNET";
		String l[]= lang.split("-");
		System.out.println(l.length);
		System.out.println(Arrays.toString(l));
		
		System.out.println("--------------------------------");
		
		String pop=" xXtestingxXSeleniumXxxX automationXXxXtrainingXx";
		String n[]=pop.split("xX");
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		System.out.println(n[5]);// Array index out of Bond Exception 
		

}
}