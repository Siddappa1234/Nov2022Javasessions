package javasession;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser = "chrome";
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched ");
			break;
		case "firefox":
			System.out.println("firefox is launched ");
			break;
		case "safari":
			System.out.println("safari is launched ");
			break;
		case "edge":
			System.out.println("edge is launched ");
			break;
		default:
			System.out.println("Invalid Browser---please pass the right browser");
			break;

		case "naveen":
			System.out.println("naveen is launched ");
			break;
		}

		// -----------------------------//
		int marks = 90; // byte,short, int, string, char are not allowed in switch case statement
		switch (marks) {
		case 90:
			System.out.println("grade A");
			break;
		case 80:
			System.out.println("grade B");
			break;
		case 70:
			System.out.println("grade C");
			break;

		default:
			System.out.println("FAIL");
			break;
		}

		// ----------------//

		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;

		default:
			System.out.println("not a vowel");
			break;
		}
	}
}