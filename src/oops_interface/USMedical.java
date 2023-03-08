package oops_interface;

public interface USMedical extends WHO,USHG
{
	int min_fee = 10;
	
   public void cardioServices();
   
   public void neuroServices();
   
   public void physioServices();
   
   public void emergencyServices();
   
   @Override
	public void covidVaccination();

	// main()???
	
	
	//After JDK 1.8:
	//1. static method with the method body:
	
	public static void taxCalculation() {
		System.out.println("US - taxCalculation");
	}
	
	
	//2. default methods: not static:
	 default void getMedicalServices() {
		System.out.println("US - getMedicalServices");
		
}
}