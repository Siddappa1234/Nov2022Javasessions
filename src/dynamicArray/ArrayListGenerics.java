package dynamicArray;

public class ArrayListGenerics {

	public static void main(String[] args) 
	{
		ArrayList<Integer>numList=new ArrayList<Integer>();
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(400);
		numList.add(400);
		numList.add(400);
		numList.add(400);
		numList.add(400);
		numList.add(400);
		numList.add(400);
		
		System.out.println(numList.add);
		
		// for each loop
		for(Integer e:numList)
		{
			System.out.println(e);
		}
		
		ArrayList<String>EmpNameList= new ArrayList<String>();
		
		EmpNameList.add("Naveen");//0
		EmpNameList.add("Tom");//1
		EmpNameList.add("Peter");//2
		EmpNameList.add(null);//3
		
		System.out.println(EmpNameList.get(0));
		
		for(String e:EmpNameList)
		{
			System.out.println(e);
		}
		System.out.println(EmpNameList);
		
		//
		
		ArrayList<Object>EmpDataList= new ArrayList<Object>();
		
		EmpDataList.add("Tom");// 0
		EmpDataList.add(2);// 1
		EmpDataList.add(true);//2
		EmpDataList.add(12.33);// 3
		EmpDataList.add('M');
		EmpDataList.add(30);
		
		System.out.println(EmpDataList.get(2));
		EmpDataList.remove(12.33);
		 
		for(Object e:EmpDataList)
		{
			System.out.println(e);
			if(e.equals(20))
			{
				System.out.println("Fresher");
			}
		}
		
		

	}

}
