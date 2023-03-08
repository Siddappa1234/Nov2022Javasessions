package javasession;

public class WhileLoopsConcept {

	public static void main(String[] args) {
		// 1 to 10
		// 1.while

		int i = 1;// -1, -100 ,-128 disadvantage of while loop: it will infinity loop keeps on executing 
					
					// until we terminate
		while (i <= 10) {
			System.out.println(i);
			i++;// All possible ways gives the same out
			// ++i;
			// i=i+1;

		}
		// while(true)
		{
			System.out.println("Welcome to Samu Birthday ");
		}
		// ------------//
		int p = 1;
		while (p <= 100) {
			System.out.println(p);
			p++;
			// p=p+2;
		}
		// -----------------------//
		int num = 1;
		while (num <= 100) {
			System.out.println(num);
			if (num % 5 == 0) {
				System.out.println("Hi");
				break;// break the entire loop
			}
			num++;
		}
		// ---------------------------//
		int n = 1;
		while (n <= 5) {
			// System.out.println("Anjali");
			System.out.println(n + "=" + "Anjali");
			n++;
		}
		// ---------------------------//
		int counter = 100;
		while (counter >= 100) {
			System.out.println(counter);// 100

			if (counter == 200) {
				System.out.println("bye!!");
				break;
			}

			counter++;
		}

		// ---------------------------//
		
		  int score=10; 
		 while(score<=100) { 
			      System.out.println(score); 
		 if(score==25) {
		         System.out.println("score is 25 ---"); 
		           } 
		 if(score==50) {
		         System.out.println("half centrury");
		           } 
		 if(score==100) 
		 {
		  System.out.println("Century"); 
		 } 
		 
		// --------------------//
		int score1 = 50;
		switch (score1) {
		case 35:
			System.out.println("score is 25---");
			break;
		case 50:
			System.out.println("half century");
			break;
		case 75:
			System.out.println("centrury");
			break;
		default:
			System.out.println(score);
			break;
		  }
		 }
	}
}

