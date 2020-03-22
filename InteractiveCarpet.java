package lab.Saturday;
import java.util.*;

import java.util.Scanner;
/**
Calculate the cost of carpeting a room taking the values from the user
SaturdayLab1: Data types. Variables. Constants.
Problem 6
Follow the Carpet class to create an interactive application. Instead of assigning
values to the length, width and price variables accept them from the user as
input. Save the revised class as InteractiveCarpet.java.
*/
public class InteractiveCarpet {

	public static void main(String[] args) {
		
		double length, width, price;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the length");
		length = sc.nextInt();
		System.out.println("Please enter the width");
		width = sc.nextInt();
		System.out.println("Please enter the price");
		price = sc.nextInt();
		
		double area;
		area = length * width;
		
		double totalPrice;
		totalPrice = area * price;
		
		String resultText = "The total cost of our carpet with ";
		String costText = " will cost you around: ";
		System.out.println (resultText + "widht " + width  + " and with length " + length  + costText + totalPrice + "EUR");
//		System.out.println("This carpet costs " + totalPrice + " EUR");
		
		
		

	}

}
