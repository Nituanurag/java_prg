package assignments;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {

		int num =0; int palin = 0; int rem = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the digits : ");
		num = obj.nextInt();
		int num1 = num;
		while(num !=0){
			rem = num % 10;
			palin = palin  * 10 + rem;
			num = num / 10;
		
		}
		if(palin == num1)
			
			System.out.println("This is Palindrom Number : "+ palin);
		
		if(palin != num1)
			
		System.out.println("This is not Palindrom Number : "+ palin);
			
	}

}
