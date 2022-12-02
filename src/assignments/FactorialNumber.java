package assignments;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int fact=1;
		int i;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the number for factorial :");
		int num = scan.nextInt();
		
		for (i=1; i<=num; i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorialnumber for: "+ num+ " is "+ fact );
	}

}
