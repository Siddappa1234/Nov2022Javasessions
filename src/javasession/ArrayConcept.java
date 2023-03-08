package javasession;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// Array: Static Array size is fixed
		// collection of elements with same type

		int i[] = new int[4];
		// lowest index=0
		// length =4;
		// Highest index=length-1;
		// length= hi+1;
		System.out.println(i.length);
		// int len=i.length;
		// int hi=len-1;
		// int li=0;
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[4]);// AIOB
		// System.out.println(i[-1]);// AIOB
		System.out.println(i[3]);

		// ---------------------//
		// To print all the values from array

		// for (int k= 0; k<=3; k++)
		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);
		}
		// -----------------//
		int p[] = new int[4];
		p[2] = 30;
		System.out.println(p[0]);
		System.out.println(p[2]);

		// To print all the values of array without loop
//	   {
//	 
//	   //  System.out.println(Arrays.toString(i));
//	   }
		// For each Loop // Disadvantage of For each loop is cannot use any logic
		for (int e : i) {
			System.out.println(e);
		}

		System.out.println("-----------------");
		for (int e : i) {
			System.out.println(e);
			if (e == 20) {
				System.out.println("bye !");
				break;
			}
		}
		System.out.println("-----------------");

		// System.out.println(i);
		// System.out.println(i[6]); // AIOB exception

		// Double Array
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.44;
		System.out.println(d[0] + d[1]);
		System.out.println(Arrays.toString(d));
		System.out.println("----------");
		// using for each loop
		for (double e : d) {
			System.out.println(e);
		}
		// ------------------------------------//
		// character Array
		char ch[] = new char[5];
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 'd';
		System.out.println(ch.length);
		System.out.println(ch.length - 1);
		System.out.println("li=" + 0);
		for (char e : ch) {
			System.out.println(e);
		}
		// -------------------//
		for (char e : ch) {
			System.out.println((int) (e));
			
		}
		// String Array // Default value of sting is null 
		String lang[]= new String[4];
		lang[0]="Java";
		lang[1]="Python";
		lang[2]="javascript";
		lang[3]="Dot net";
		System.out.println(lang.length);
		//-------------------//
		
		for(String e:lang) {
			System.out.println(e);
		if(e.equals("Java"))
		{
			System.out.println("I Love Java ");
		}
		if(e.equals("javascript"))
		{
			System.out.println("I hate JS");
		}
		//------------------------------//
		
		//Object Array
		// Object Array is a class in java --> is a super class of all classes in java 
		// emp info:Name(String),age(int),salary(double),gender(male), is permanent(Boolean)
				
				Object emp[]=new Object[5];
				emp[0]="Samuruddhi";
				emp[1]=25;
				emp[2]=25.55;
				emp[3]='f';
				emp[4]=true;
				
				System.out.println("emp.length");
				for (Object e1:emp)
				{
					System.out.println(e1);
					if(e.equals("Samuruddhi"))
					{
						System.out.println("emp is from QA");
					}
				}
				//---------------------------------//
				Object emp1[]=new Object[5];
				emp1[0]="Samu";
				emp1[1]=35;
				emp1[2]=45.55;
				emp1[3]='f';
				emp1[4]=false;
				for(int m=0;m<=emp1.length-1;m++)
				{
					System.out.println(emp1[m]);
				
				if(emp1[m].equals("varsha"))
				{
					System.out.println("emp is from Dev");
				}
				
				//-----------------------------------------//
				// static 
				// 1.new keyword 
				// 2.Array literals
				
				int num[]={1,2,3,4,5,6,10,11};
				System.out.println(num.length);
				
				String product[]= new String[10];
				lang[0]= "java";
				lang[1]="Python";
				lang[2]="Javascript";
				lang[3]="Dotnet";
				
				String pr[]= {"macbook","iphone","Samsang"};
				System.out.println(pr[3]);
				Object data[]= {"macbook",1000,2344,'g',true};
				
				for(Object e1:data)
				{
					System.out.println(e1);
				}
				System.out.println(Arrays.toString(data));
				System.out.println(Arrays.toString(pr));
		}      
	  }
	}
}
