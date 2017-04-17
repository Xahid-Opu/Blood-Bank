import java.util.Scanner;
public class Screen extends BloodBank{
	Scanner input;
	private String name;
	private String bloodGroup;
	private String mobileNumber;
	public void method(int choice)
	{
		input= new Scanner(System.in);
		
		switch (choice)
		{
		case 1:
			System.out.print("Please Enter the Donor Name: ");
			name=input.nextLine();
			if (isNameExist(name)) 
			{
					System.out.println("The name already Exist! please try another one");
					break;
			}
			
			
			System.out.println("Enter the Blood Group: ");
			blood();
			System.out.print("Enter the Mobile no. : ");
			mobileNumber= input.nextLine();
			addDonor(name, bloodGroup, mobileNumber);
			break;
			
			
			
		case 2:
			System.out.println("Enter the Blood Group: ");
			 blood();
			
			if(bloodGroup != null)
			{
			 boolean isTrue=searchBlood(bloodGroup);
				
				 if (isTrue)
				{
					System.out.print("\n      Enter the Donor name who is Able to donate blood: ");
					name = input.nextLine();
					System.out.print("Enter the date(dd-mm-yy): ");
					String date =input.nextLine();
					setDonationDate(name,date);
				} 
			}
			
			break;
		}
	}
	
	


	public void blood() 
	{
		Scanner input= new Scanner(System.in);
		System.out.printf("\nEnter 1, For A+.\n"
				+ "Enter 2, For A-.\n"
				+ "Enter 3, For AB+.\n"
				+ "Enter 4, For AB-.\n"
				+ "Enter 5, For B+.\n"
				+ "Enter 6, For B-.\n"
				+ "Enter 7, For O+.\n"
				+ "Enter 8, For O-.\n");
		System.out.print("     Enter here: ");
		int choose= input.nextInt();
		
		
		switch (choose)
		{
		case 1:
			bloodGroup="A+";
			break;
		case 2:
			bloodGroup="A-";
			break;
		case 3:
			bloodGroup="AB+";
			break;
		case 4:
			bloodGroup="AB-";
			break;
		case 5:
			bloodGroup="B+";
			break;
		case 6:
			bloodGroup="B-";
			break;
		case 7:
			bloodGroup="O+";
			break;
		case 8:
			bloodGroup="O-";
			break;
			
			default:
				System.out.println("You did not Enter a valid selection!");
				bloodGroup= null;
		}
		
	} 
	
	
}
