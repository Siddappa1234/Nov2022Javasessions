package javasession;

public class DataTypesConcept {

	public static void main(String[] args) {

		// 1.Byte
		// size 1 byte=8bits
		// Range:128 to 127
		byte b = 10;
		b = 30;
		byte b1 = 20;
		byte b2 = 40;// 1 byte=8 bits
		byte t2 = 1;// 1 byte
		byte age = 40;
		System.out.println(b);
		System.out.println(b1);

		// 2. Short
		// size : 2 bytes=2*8=16 bits
		// Range:-32768 to 32767
		short sh = 500;
		short sh1 = -300;
		System.out.println(sh);
		System.out.println(sh1);
		System.out.println(sh + sh1);

		// 3. Integer
		// size:4 bytes= 4*8=32 bits
		// Range: -2147483648 to 2147483647
		int i = 100000;
		int j = 1;// 4 bytes
		int k = 3000;
		byte l = 20;
		System.out.println(k);
		System.out.println(l);
		System.out.println(k + l);

		// 4: Long
		// size: 8 bytes=8*8 =64 bits
		// Range
		// L can be capital or small
		long num = 96329081;
		long num1 = 9916844830l; // if we are not declaring in sop (num1) then we will getting the error
		long n = 9731959946l;
		long ph = 9972349942l;
		long c = 1212121212l;
		System.out.println(n);

		// 5. Float
		// size of float will takes 4 bytes=4*8=32 bits
		// Range: upto 7 digits after decimals
		float f = 12.33f;
		System.out.println(f);
		float n2 = (float) 23.44;
		System.out.println(n2);
		float n3 = 100;
		System.out.println(n3);
		float n4 = 1.1f;
		float n5 = 0.9f;

		// 6. Double
		// size: 8 bytes= 8*8=64 digits
		// Range: upto 16 digits after decimal
		double d = 12.333333;
		double d1 = 200;
		System.out.println(d1);

		// 7. Char
		// size:2 bytes=16 bits
		char c1 = 'a';// a-z
		char c2 = '1';// 0-9
		char c3 = '2';// A-z
		char c4 = '$'; // ASCII Value -- table
		char c11 = 'b'; // a-z:97 to 122
		char gender = 'f'; // A-Z: 65 to 90
		char status = 'Y'; // 0-9: 48 to 57
		System.out.println(c1);
		System.out.println(c1 + c11);

		char r1 = '9';// 57
		char r2 = '9';// 57
		System.out.println(r1 + r2);
		System.out.println(r1 * r2);
		System.out.println(r1);

		char u1 = 'a';
		char u2 = 'b';
		System.out.println(u1 + "" + u2);// ab
		System.out.println((int) u1 + (int) u2);
		System.out.println(u1 + 0);// 97+0=97
		System.out.println(u1 + 'o');// 97+48=145

		// 9.boolean
		// size of boolean=~1 bit
		boolean fg = true;
		boolean fg1 = false;
		System.out.println(fg);
		System.out.println(fg1);
		System.out.println(1 + 2);
		System.out.println('a' + 'b');
		System.out.println(100);
		System.out.println(1);

	}

}
