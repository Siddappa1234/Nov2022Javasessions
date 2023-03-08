package stackMemory;

public class StringBuffer {

	public static void main(String[] args) 
	{
		// String Buffer and String Builder
		StringBuilder sb= new StringBuilder("selenium");
		sb.append("testing");
		System.out.println(sb);
		
		String s1= "Cypress ";
		s1.concat("ui testing");
		System.out.println(s1);
	}

}
