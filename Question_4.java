package lab2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		//Write a program that asks user for the number of males and the number
		//of females registered in a class. The program should display the percentage 
		//of males and females in the class.


		Scanner scanner = new Scanner(System.in); // declares a scanner object.
		 
        int males;
        int females;
        int total;
        double malesPercentage;
        double femalesPercentage;
 
        System.out.println("Enter the number of males : ");
        males = scanner.nextInt();
 
        System.out.println("Enter the number of females: ");
        females = scanner.nextInt();
        
       
       total = males + females;
       malesPercentage = (males / total)*100;
       femalesPercentage= (females / (double)total)*100;
 
        System.out.println("Number of male students: " + males);
        System.out.println("Number of female students: " + females);
        System.out.println("Number of total students: " + total);
 
               
        System.out.println("Percentage of male students: " + malesPercentage);
        System.out.println("Percentage of female students: " + femalesPercentage);	
		
		
	}

}
