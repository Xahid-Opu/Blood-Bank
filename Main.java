import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BloodBank bloodBank= new BloodBank();
		Scanner input= new Scanner(System.in);
		Screen checkInput= new Screen();
		
		int choose;
		
		
		
		do {
			System.out.printf("          Enter 1, To Add Donor and his/her Blood Group.\n"
					+ "          Enter 2, To Search Blood.\n\n");
			System.out.print("Enter your choose here (0 to exit) : ");
			choose= input.nextInt();
			checkInput.method(choose);
			System.out.println();
			}while (choose!=0);
		
	
	}
}
