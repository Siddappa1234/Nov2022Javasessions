package javasession;

public class Methodoverloading 
{
    // JVM----Main
	public static void main(String[] args)
	{
		System.out.println("Hello");

	}
	public static void main(int i)
	{
		System.out.println("i");
		System.out.println("Main 1 Parameter ");

	}
	public static void main(int i, int j)
	{
		System.out.println("Main 2 Parameter ");

	}

}
