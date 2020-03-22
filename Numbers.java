package lab.Saturday;

/*
Calculates the arithmetic operations
SaturdayLab1: Data types. Variables. Constants.
Problem 3
Save file as Numbers.java 
 -- arithmetic operations with int and double operands (i.e. variables)
 -- mixed addition
 -- integer division. double division. mixed division
 */

public class Numbers {

	public static void main(String[] args) {
//		declare variable of type int
		int iNumOne, iNumTwo, iResult;
		
//		declare variable of type double
		double dNumOne, dNumTwo, dResult;
		
//		assign/store 
		iNumOne = 5;
		iNumTwo = 2;
		
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		iResult = iNumOne + (int) dNumOne;
		dResult = dNumTwo + dNumTwo;
		
		System.out.println("int result: " + iResult);
		System.out.println("double result: " + dResult);
		
//		multiplication task
		iResult = iNumTwo * (int) dNumOne;
		dResult = dNumTwo * dNumOne;
		
		System.out.println("multi int result: " +  iResult); 
		System.out.println("multi double result: " + dResult);
				
//		devision task
		iResult = iNumOne / iNumTwo;
		dResult = dNumOne / dNumOne; 
		System.out.println("dev int result: " + iResult);
		System.out.println("dev double result: "+ dResult);
				
//		subtraction task
		iResult = iNumTwo - iNumOne;
		dResult = dNumOne - dNumTwo;
		System.out.println("sub int result: " + iResult);
		System.out.println("sub double result: " + dResult);

	}

}
