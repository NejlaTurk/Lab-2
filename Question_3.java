package lab2;

import java.util.Scanner;
public class Question_3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter a positive nonzero integer");
		    int getNumber=scanner.nextInt();
		    int x;
		    int total = 0;
		    for (x=1;x<=getNumber;x++) {
		        total=x+1;
		    }
		    System.out.println(total);
		
		
		
	}

}
