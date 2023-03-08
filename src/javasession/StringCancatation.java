package javasession;

public class StringCancatation {

	public static void main(String[] args) {
		
		String x = "Hello";
		String y = "World";

		int a = 100;
		int b = 200;

		System.out.println(x);
		System.out.println(y);
		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + a);
		System.out.println(a + b + x + y);
		System.out.println(x + y + a + b);// helloworld100200
		System.out.println(x + y + (a + b));// helloworld300
		System.out.println(a + b + x + y + a + b);// 300helloworld100200
		double d1 = 12.33;
		double d2 = 23.44;
		System.out.println(x + y + d1 + d2);
		System.out.println("the value of a:" + a);
		System.out.println("the value of b:" + b);
		System.out.println("the sum is:" + (a + b));

	}

}
