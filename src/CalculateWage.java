import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculateWage {

	public static void main(String[] args) {
		
		String firstName, lastName;
		double hoursWorked, specialHours = 0;
		int input;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Advisor's First Name: ");
		firstName = scan.next();
		System.out.println();
		
		System.out.println("Enter Advisor's Last Name: ");
		lastName = scan.next();
		System.out.println();
		
		System.out.println("Enter the total number of hours worked: ");
		hoursWorked = scan.nextDouble();
		System.out.println();
		
		System.out.println("Did the advisor work special hours?  enter \"1\" for yes, and \"2\" for no");
		input = scan.nextInt();
	
		while (input != 1 && input != 2) {
			System.out.println("Invalid entry, please try again");
			System.out.println("Did the advisor work special hours?  enter \"1\" for yes, and \"2\" for no");
			input = scan.nextInt();
		}
		
		if (input == 1) {
			System.out.println("Please enter the number of special hours worked: ");
			specialHours = scan.nextDouble();
			System.out.println();
			}
		if (input == 2) {
			specialHours = 0;
			System.out.println();
			}
		
		PaidAdvisor pa = new PaidAdvisor(firstName, lastName, hoursWorked, specialHours);
		
		
		
		
		System.out.println(pa.toString());
		System.out.println();
		System.out.println("Hours Worked: " + pa.getHoursWorked());
		System.out.println("Special Hours Worked: " + pa.getSpecialHours());
		
	}
}
