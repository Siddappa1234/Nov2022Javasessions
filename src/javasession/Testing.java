package javasession;

public class Testing {
	// WAF:
	// Pass the studentName(String)
	// return the statement marks
	public int getStudentMarks(String StudentName)
	{
		System.out.println("getting marks for student:"+StudentName);
		int marks=-1;
//		if(StudentName.equals("Ravi"));
//		{
//			//return 100;
//			marks=100;
//			
//		}
//		else if(StudentName.equals("Rashmi")) 
//		{
//			//return 90;
//			marks=90;
//		}
//		else if(StudentName.equals("Indu"))
//		{
//			//return 80;
//			marks=80;
//		}
//		else 
//		{
//			System.out.println("Student is not found ---"+StudentName);
//			return-1;
//		}
//		return marks;
//	}

		if (StudentName.equals("Ravi")) {
			// return 100;
			marks = 100;
		}

		else if (StudentName.equals("Rashmi")) {
			// return 90;
			marks = 90;
		}

		else if (StudentName.equals("Naveen")) {
			// return 10;
			marks = 10;
		}

		else {
			System.out.println("student is not found..." + StudentName);
			// return -1;

		}

		return marks;
	}
	// WAF
	// Launch the Browser:FF/CH/SF/IE
	// create a function
	// Name :LaunchBrowser(Browser--String)
	// logic
	// Return:true/false:Boolean
	public boolean LaunchBrowser(String BrowserName)
	{
		System.out.println("Launching Browser:"+BrowserName);
		boolean flag=false;	
	
	switch (BrowserName) {
	case"Chrome":
		System.out.println("Chrome is launched ");
		//flag=true;
		break;
    
	case"Firefox":
		System.out.println("Firefox is launched ");
		//flag=true;
		break;		
		
	case"Safari":
		System.out.println("Safari is launched ");
		//flag=true;
		break;	
		
	case"IE":
		System.out.println("IE is launched ");
		//flag=true;
		break;	
	default:
		System.out.println("Browser is not found--");
		break;
	}
	return flag;
	
	}
	public String getName() {
		return "Naveen";
	}

	public int getNumber() {
		return 100;
	}

	public static void main(String[] args) {
		Testing obj = new Testing();
		int m1 = obj.getStudentMarks("Samu");
		System.out.println(m1);
		if (obj.LaunchBrowser("chrome")) {
			System.out.println("launch the url");
		} else {
			System.out.println(" No need to enter the url");
		}
		if (obj.getName().equals("Darshan")) {
			System.out.println();
		}
		if (obj.getNumber() == 100) {
			System.out.println();
		}
	}

}
