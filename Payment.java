package lab.Saturday;
/**
calculate the payment based on hours worked (standard and overtime hours) and payRate
*/

//declare a class
public class Payment {
	
	 // declare instance variables for the values to be calculated
	private double standardPay;
	private double overtimePay;
	private double totalPay;
	
	// declare a method with 3 parameters to calculate the payment
	public void calculatePayment (double payRate, double standardHours, double overtimeHours) {
		  // calculate overtime payment
		standardPay = standardHours * payRate;
		// calculate overtime payment
		double overtimePayRate = payRate * 1.5;
		overtimePay = overtimePayRate * overtimeHours;
	     // calculate the total payment
		totalPay = standardPay + overtimePay;

		
	}
	
	 // declare a method without any parameters
	public void displayPayment(){
		System.out.println("My standard pay: " + standardPay);
		System.out.println("My overtime pay: " + overtimePay);
		System.out.println("My total pay: " + totalPay);
		
	}
	


	public static void main(String[] args) {
		 // declare a variable of type Payment
		Payment myPayment;
		 // create an object of type Payment
		myPayment = new Payment();
		
		//assign value for each variable
		double sH, oH, pR;
		sH = 2;
		oH = 1;
		pR = 0.50;
		
		// calculate the payment
		myPayment.calculatePayment(pR, sH, oH);
		myPayment.displayPayment();
		System.out.println();
		
		
	

	}

}
