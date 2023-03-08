package javasession;

public class Student {

	// WAF:
	// given the student name (String) as a parameter
	// return the studentsmarks(int)
	public int getStudentMarks(String studentName)
	{
		System.out.println("getting student marks for:"+studentName);
		if(studentName.equals("Samu"))
		{
			return 100;
		}
		else if(studentName.equals("Vikas"))
		{
			return 100;
		}
		else if(studentName.equals("Varsha"))
		{
			return 80;
		}
		else 
		{
			System.out.println("student is not found-----");
			return-1;
		}
		
	}
	public static void main(String[] args)
	{
		Student st= new Student();
		int m1=st.getStudentMarks("Samu");// change the name according to the user requirements 
		System.out.println(m1);
		if(m1==-1)
		{
			System.out.println("No need to print Marksheet");
		}

	}

}
