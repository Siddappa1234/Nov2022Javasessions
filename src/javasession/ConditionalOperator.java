package javasession;

public class ConditionalOperator {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println(i == j);// == compares the values
		if (i == j) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}
		if (j >= i) {
			System.out.println("j is greater then i");
		} else {
			System.out.println(" i greater then j");
		}
		// ---------------//

		int total = 1000;
		if (total != 100) {
			System.out.println("Bye");
		} else {
			System.out.println("Hi");
		}
		// ------------//
		// Nested if
		int marks = 80;
		if (marks <= 100)
			;
		{
			System.out.println("Valid marks ");
		}
		if (marks >= 90) {
			System.out.println("A Grade");
		} else if (marks <= 80) {
			System.out.println("B Grade");
		}

		else {
			System.out.println(" not a valid  marks ");
		}

		// ------------------//
		// Nested if
		int mark = 80;
		if (marks <= 100) {
			System.out.println("valid marks");
			if (mark >= 90) {
				System.out.println("A GRADE");
				if (marks >= 95) {
					System.out.println("eligible for schloarship");
					if (mark == 100) {
						System.out.println("100% fee waived off");
					}
				}
			} else {
				if (mark <= 80) {
					System.out.println("B Grade");
				}
			}

		} else {
			System.out.println("not a valid mark");
		}

		// ------------------//
		// if if if if else

		String browser = "chrome";
		if (browser.equals("chrome")) {
			System.out.println("chrome is launched ");
		}
		if (browser.equals("firefox")) {
			System.out.println("Firefox is launched ");
		}
		if (browser.equals("safari")) {
			System.out.println("Safari is launched");
		}
		if (browser.equals("edge")) {
			System.out.println("edge is launched ");
		} else {
			System.out.println("Invalid browser");
		}

		// --------------------//
		// if -else if
		String browser1 = "chrome";
		if (browser1.equals("chrome")) {
			System.out.println("Chrome is launched ");

		} else if (browser1.equals("firefox")) {
			System.out.println("Firefox is launched");
		} else if (browser1.equals("safari")) {
			System.out.println("safari is launched");

		} else if (browser1.equals("edge")) {
			System.out.println("edge is launched");
		} else {
			System.out.println("Invalid Browser");
		}
		System.out.println("--------------------");
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
		for (Object e:emp)
		{
			System.out.println(e);
			if(e.equals("Rashmi"))
			{
				System.out.println("emp is from QA");
			}
		}
		
		
	}
}
