package oops_interface;

public class TestHospital {

	public static void main(String[] args) 
	{
		FortisHospital fh= new FortisHospital();
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		fh.enterServices();
		fh.dentalServices();
		fh.oncologyServices();
		fh.emergencyServices();
		
		fh.medicalInsurance();
		fh.Medicaltraining();
		fh.MedicalRD();
		fh.MedicalNews();
		fh.covidVaccination();
		
		System.out.println(fh.min_fee);
		System.out.println(USMedical.min_fee);
		System.out.println(fh.min_fee);
		USMedical.taxCalculation();
		fh.getMedicalServices();
		
		// NA 
		//USMedical us = new USMedical();
		//top casting
		// Child class object can be referred by parnet interface ref variable
		
		USMedical us= new FortisHospital();
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();
       
		UKMedical uk= new FortisHospital();
		uk.dentalServices();
		uk.enterServices();
		uk.emergencyServices();
		
		IndianMedical in= new FortisHospital();
		in.orthoServices();
		in.oncologyServices();
		in.gynicServices();
		in.emergencyServices();
		
		// Downcasting ? at the complie time
		// FortisHospital fh1= new USMedical();
		
		// USE Constants
		System.out.println(Constants.OK_MESSG_200);
		System.out.println(Constants.DEFAULT_TIME_OUT);
	}

}
