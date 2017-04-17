import java.util.Hashtable;
public class BloodBank {
	

	Hashtable<String,String>bloodDonor= new Hashtable<String,String>();
	Hashtable<String,String>donorNumber= new Hashtable<String,String>();
	Hashtable<String,String>dateOfDonation= new Hashtable<String,String>();

	
	
	public boolean searchBlood(String bloodGroup) 
	{
		boolean isTrue=false;
		System.out.println("List of the Donors:");
		for (String name : bloodDonor.keySet()) 
		{
			if ( bloodDonor.get(name)==bloodGroup) 
			{
				isTrue= true;
				System.out.println("\nName of Donor: "+name);
				System.out.println("Blood Group: "+bloodDonor.get(name));
				System.out.println("Date of last Donation: "+dateOfDonation.get(name));
				System.out.println("Mobile: "+donorNumber.get(name));
			}
		}
		if (isTrue) 
		{
			return true;
		}
		else
		{
			System.out.println("Sorry! we do not have "+bloodGroup+" blood.");
			return false;
		}
	}
	
	
	
	public void addDonor(String name, String bloodGroup, String number) 
	{
		
			bloodDonor.put(name, bloodGroup);
			donorNumber.put(name, number);
			
	}
	
	
	
	
	public void setDonationDate(String name, String date)
	{
		dateOfDonation.put(name, date);
		
	}
	
	
	public boolean isNameExist(String name)
	{
		if (bloodDonor.containsKey(name)) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
