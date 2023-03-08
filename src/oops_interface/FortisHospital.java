package oops_interface;

public class FortisHospital extends Hospital implements USMedical,UKMedical,IndianMedical
{

	
	// US 
	@Override	
	public void cardioServices()
	{
		System.out.println("FH-- cardioServices");	
	}
    @Override
    public void neuroServices()
    {
    	System.out.println("FH--neuroServices");
    }
    @Override
    public void physioServices()
    {
    	System.out.println("FH----physioServices");
    }
    // UK
    @Override
    public void enterServices()
    {
    	System.out.println("FH---enterServices");
    }
    @Override
    public void dentalServices()
    {
    	System.out.println("FH---dentalServices");
    }
    // India 
    @Override
    public void oncologyServices()
    {
    	System.out.println("FH--oncologyServices");
    }
    @Override
    public void gynicServices()
    {
    	System.out.println("FH---gynicServices");
    }
    @Override
    public void orthoServices()
    {
    	System.out.println("FH---Services");
    }
    // common
    @Override
    public void emergencyServices()
    {
    	System.out.println("FH--emergencyServices");
    }
    // Individual
    public void Medicaltraining()
    {
    	System.out.println("FH--MedicalTraining");
    }
    public void medicalInsurance()
    {
    	System.out.println("FH---MedicalInsurance");
    }
    //WHO
    @Override
    public void covidVaccination()
    {
    	System.out.println("FH--covidVaccination");
    }
    // USHG
    @Override
    public void childcareServices()
    {
    	System.out.println(" FH---childcareServices");
    }
	}


