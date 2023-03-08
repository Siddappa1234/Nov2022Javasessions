package dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) 
	{
		List<String>namesList= new ArrayList<String>();
		
		namesList.add("Tom");
		namesList.add("peter");
		namesList.add("Rashmi");
		namesList.add("Ravi");
		namesList.add("Naveen");
		
		System.out.println(namesList);
		System.out.println(namesList.size());
		
		for(String e:namesList)
		{
			System.out.println(e);
		
		 if(e.equals("Rashmi"))
		{
			System.out.println("She is a manager");
			break;
		}
		
	}
	//
	
	List<String>browserList= ArrayList.asList("Chrome","Firefox","IE","Safari","Edge");
	
	System.out.println(browserList.size());
	System.out.println(browserList);
	
	List<Integer>numList=Arrays.asList(100,200,300,400,500);
	// Static Array to Dynamic Array
	
	String country[]= {"India", "USA","UK","Brazil","Germany"};// static Array
	
	List<String> countryList= Arrays.asList(country);// Dynamic Array
	
	System.out.println(countryList);
	
	countryList.add("France");
	System.out.println(countryList);
	
     }
    
    }


