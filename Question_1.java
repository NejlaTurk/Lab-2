package lab2;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
        boolean key = true;
        int smallest = scanner.nextInt();
        int largest = smallest;
        int enteredNumber = 0;
        do {
            System.out.print("Enter your next number: ");
            enteredNumber = scanner.nextInt();
            if (enteredNumber < smallest){
                smallest = enteredNumber;
            }if (enteredNumber > largest){
                largest = enteredNumber;
            }
            System.out.print("Do you want to enter another number: 0-No, 1-Yes ");
            int doesContinue = scanner.nextInt();
            if (doesContinue == 0){
                key = false;
                break;
            }else if(doesContinue == 1){
                key = true;
                break;
            }
            System.out.println("invalid selection, try again!!!");
            while(key);
        }
        while (true);
            System.out.print("smallest number is: " + smallest);
            System.out.println();
            System.out.println("largest number is: " + largest);
            
	}
	

}