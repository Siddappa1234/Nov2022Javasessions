package javasession;

public class ForLoopconcept {

	public static void main(String[] args) {
		// 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// ------------------//
		int i = 1;
		for (; i < 10;) {
			System.out.println(i);
			// i++;// different ways to write for loop
			// ++i;
			i = i + 1;
		}
		// ----------------------//
		for (;;) {
			System.out.println("Bye Samu ");
			break;// it is giving infinity loop if we are not giving break loop
		}
		// -----------------------//
		/*
		 * for(;false;) { System.out.println("Bye "); }
		 */
	}

}
