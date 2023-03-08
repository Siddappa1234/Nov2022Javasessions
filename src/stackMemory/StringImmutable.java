package stackMemory;

import java.util.Arrays;

public class StringImmutable {

	public static void main(String[] args) 
	{
		String s="Selenium";
		System.out.println(s+"automation");
		System.out.println(s);
		s="Cypress";
		System.out.println(s);
		String t1="Selenium";
		System.out.println(t1);
		String p="Naveen";
		p=p+"automation  Labs";
		System.out.println(p);
		
		String t2= "Naveen";
		System.out.println(p);
		
		String r= " hello  selenium ";
		r= r.trim();
		System.out.println(r);
		
		int i=10;
		i=10+50;// 60
		
		String s11="JAVA-PY-RUBY";
		String arr[]=s11.split("_");
		String t11=arr[0]+"testing";
		
		System.out.println(s11);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("----------------");
		
		String test=" testing java selenium ";
		//System.out.println(test.replaceAll(" ","M"));
		System.out.println(test.replace(" ", "M"));
		
		String rest= " i am binita and this is my code and i am so happy ";
		System.out.println(rest.indexOf("i"));// 0
		
		System.out.println(rest.indexOf("i",rest.indexOf("i")+1));// 6
		System.out.println(rest.indexOf("i", rest.indexOf("i",rest.indexOf("i")+1)+1));// 8
		System.out.println(rest.indexOf("i", rest.indexOf("i",rest.indexOf("i")+1)+1)+1);// 		
		

	}

}
