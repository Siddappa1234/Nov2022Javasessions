package javasession;

public class IncrementDecrementoperator {

	public static void main(String[] args) {
		// 1.Post Increment ++
		int a = 1;
		int b = a++;
		System.out.println(a);// first it will give the value to b then a will increase
		System.out.println(b);

		int c = -99;
		int d = c++;
		System.out.println(c);// -98
		System.out.println(d);// -99

		int x = 10;
		int y = x++;
		System.out.println(x);// 11
		System.out.println(y);// 10

		// 2.Pre Increment
		int t = 1;
		int u = ++t;
		System.out.println(t);// 2// first it will increase the value of t then it will assign to u
		System.out.println(u);// 2

		int k = -99;
		int p = ++k;
		System.out.println(k);// -98
		System.out.println(p);// -98

		int g = -1001;
		int h = ++g;
		System.out.println(g);
		System.out.println(h);

		// 3.Post Decrement --
		int s = 2;
		int v = s--;
		System.out.println(s);// 1
		System.out.println(v);// 2

		int l1 = -999;
		int l2 = l1--;// l1 will be given to l2 then it wil increase the value of l1
		System.out.println(l1);// -999-1=-1000
		System.out.println(l2);// -999

		// 4. Pre Decrement
		int r1 = 2;
		int r2 = --r1;// r1 will decrease the value then it will assign to r2
		System.out.println(r1);// 1
		System.out.println(r2);// 1

		// ---------------------------//
		int num = 10;
		System.out.println(num++);// num++ value will be given to println so its value will be increased 11 as
									// next line
		System.out.println(num);// 11 it will be stored in the memory give the no to original to println

		int total = 10;
		System.out.println(++total);
		System.out.println(total);

		System.out.println(2 * 10);
		System.out.println(-2 * 10);
		System.out.println(-2 * -10);

		// ----------------------------------//

		float f = 2.5f;
		float j = f++;

		System.out.println(f);// 3.5
		System.out.println(j);// 2.5

		// Char
		char ch = 'a'; // ASCII value of a is 97
		System.out.println(++ch);// b
		System.out.println((int) ++ch);// 98

		char th = '1';
		System.out.println(++th);
		System.out.println(th);
		System.out.println((int) ++th);
		System.out.println((int) th);

		//
		int pop = 1;
		pop = pop + 1;
		System.out.println(pop);// 2

		// int j1=2;
		// int j2=j1++++;(Wrong synatx)

		System.out.println(true);

		// char ch=1.1// floating no is not allowed in char

		int p11 = pop + 1;
		System.out.println(p11);

		// Byte
		byte f1 = 50;// 120
		byte f2 = 60;// 60
		// byte f3=f1+f2; we can perfom operation on byte but result should be stored in
		// int
		int f3 = f1 + f2;// 110
		System.out.println(f3);

		// char
		char gh = '1'; // ASCII value of 1 is 49
		System.out.println(gh++);// 1+1=2
		System.out.println(gh);

		char jj = 'z';
		System.out.println(++jj);// it is defined in

	}

}
