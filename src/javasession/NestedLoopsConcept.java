package javasession;

public class NestedLoopsConcept {

	public static void main(String[] args) 
	{
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {

				System.out.print(i + "" + j + " ");// 00
				// break;
			}
			System.out.println();
			// break;
		}

		System.out.println("----");

		// ------------------------//
		for (int k = 0; k <= 5; k++) {
			for (int l = 0; l <= 5; l++) {
				System.out.print(k + "" + l + " ");
				break;
			}
			System.out.println();
			//break;
		}
        //----------------------//
		for(int v=0;v<=5;v++)
		{
			for(int u=0;u<=5;u++)
			{
				for(int w=0;w<=5;w++)
				{
					System.out.print(v+""+u+w+" ");
					//break;
				}
			}
			System.out.println();
			//break;
		}
		
	}
}