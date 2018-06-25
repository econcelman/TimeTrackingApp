import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PaidAdvisor  extends Person{
	
 private double regularPay, specialPay, overtimePay, hoursWorked, specialHours;
	

	public PaidAdvisor(String firstName, String lastName, double hoursWorked, double specialHours){
		this.setName(firstName, lastName);
		this.specialPay = 50;
		this.regularPay = 25;
		this.overtimePay = this.regularPay*1.5;
		this.hoursWorked = hoursWorked;
		this.specialHours = specialHours;	
			
	}
	
	
	private String calculatePay() {
		NumberFormat formatter = new DecimalFormat("#0.00"); 
		double regHours = hoursWorked - specialHours;
		
		if(regHours <= 30) {
			return formatter.format((specialHours * specialPay) + (regHours * regularPay));		
			}
		else{
			return formatter.format((specialHours * specialPay) + (regularPay *30 ) + ((regHours - 30) * overtimePay));	
			}	
	}
		
	public String toString() {
		return super.toString() + "'s total pay is $" + calculatePay();
		
	}
		
		
	public double getPayRate() {
		if (getHoursWorked() < 30){
		return getRegularPay();
	}
	else return getOvertimePay();
	}

	public double getRegularPay() {
		return regularPay;
	}

	public double getSpecialPay() {
		return specialPay;
	}

	
	public double getOvertimePay() {
		return overtimePay;
	}


	public double getHoursWorked() {
		return hoursWorked;
	}

	
	public double getSpecialHours() {
	return specialHours;
}

}
