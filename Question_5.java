package lab2;

import java.util.Scanner;

public class Question_5 {

	/*
	 * Question-5

Write a program that computes the tax and tip on a restaurant bill. The program should 
ask the user to enter the charge for the meal. The tax should be 6.75 percent of the 
meal charge. The tip should be 20 percent of the total after adding tax.
Display the meal charge, tax amount, tip amount, and total bill on the screen.
	 */
 
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("How much is the meal: ");
		double charge = scan.nextDouble();
		
		method(charge);
		
		
	}
		public static void method (double charge) {
	    
	   
	    double taxAmountRate = charge * 0.0675;
	

	    double tipAmountPer =(taxAmountRate+charge)* 0.20;
		

	   double totalBill = charge + taxAmountRate + tipAmountPer;

	    
	   	System.out.println("Meal: £" + charge);
	    System.out.println("Tax: £" + taxAmountRate);
	    System.out.println("Tip (After adding tax): £" + tipAmountPer);
	    System.out.println("Total Bill: £" + totalBill);
	
	
			}

}
