package assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num =0; int rev = 0; int rem = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the digits : ");
		num = obj.nextInt();
	
		while(num !=0){
			rem = num % 10;
			rev = rev  * 10 + rem;
			num = num / 10;
		
		}
	System.out.println("Sum of digits = "+rev);
	}

}
