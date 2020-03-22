package lab.Saturday;
import java.util.*;
/**
SaturdayLab1: Data types. Variables. Constants.
 calculates:
 -- the number of boxes required to pack eggs
 -- the number of leftover eggs
 Problem 5
 Read the next problem, and then identify the input, the processing and the output.
 John the farmer has asked his son with collecting the eggs from the
 chicken cage each morning and putting them in boxes of 1 dozen eggs each.
 Unfortunately, John's son Joe is having trouble working out how many boxes
 he will need each morning. You have been asked to develop a java application
 to allow Joe to enter the number of eggs he has collected. The application
 should then calculate and display how many boxes can be filled and how
 many eggs Joe will have leftover.
 Hint: there are 12 eggs in 1 dozen.
*/

public class Eggs {

	public static void main(String[] args) {
//		declare constant named Dozen
		final int DOZEN = 12;
//		declare variables  of type int
		int eggsCount, boxesCount, eggsLeftover;
		
//		declare a variable of type SC and create object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of eggs");
		eggsCount = sc.nextInt();
//		calculate the nr of boxes required to store the eggs
		boxesCount = eggsCount / DOZEN;
		System.out.println("======================");
		System.out.println("Number of boxes required: "+ boxesCount);
		
//		calculate the number of reminding eggs
//		calculate the nr of reminding eggs
		eggsLeftover = eggsCount % DOZEN;
		System.out.println("number of reminding eggs" + eggsLeftover);
		
		
		
				
		
		
	}

}
