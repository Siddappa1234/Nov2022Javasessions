package javasession;

public class DoWhileloop {

	public static void main(String[] args) {
		/*
		 * int p=1; do { System.out.println(p);
		 * 
		 * } while (p<=10);
		 */

		// ---------------------//
		int p1 = 1;
		do {
			p1++;
			System.out.println(p1);
		} while (p1 <= 10);
		// -------------------------//
		int p2 = 1;
		do {
			p2++;
			System.out.println(p2);
		} while (p2 <= 10);
		// -------------------//
		int p3 = 1;
		do {
			p3++;
			System.out.println(p3);

		} while (p3 >= 10);

		// ----------------------//
		int p4 = 1;
		do {
			System.out.println(p4);
			if (p4 % 5 == 0) {
				System.out.println("Hi Samu");
			}
			p4++;
		} while (p4 <= 50);
		// -----------------------//
		do {
			System.out.println("Hi Hello");
		} while (false);

	}

}
