package lab.Saturday;
/**
Calculates the area of a square given a side
SaturdayLab1: Data types. Variables. Constants.
Problem 2
Write a java program that declares a variable to represent the side of a square.
The side of the square is 7 units. Compute and display the area of the square.
Save the program as Square.java
*/


//declare a class called Square
public class Square {

	public static void main(String[] args) {

//		declare the variables to store the side
		
		int side;
		side = 7;
		
//		input
		side = 7;
//		assign/store the value 7 to variable named side
		int area;
		area = side * side;
		
//		output
		System.out.println ("The area is " + area);
	}

}
