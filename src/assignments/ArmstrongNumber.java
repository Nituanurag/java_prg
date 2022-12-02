package assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for Armstrong number : ");
		int sc = scan.nextInt();
		
		int num =sc;
		int arm = 0;
		int sum = 0;
		
		while (sc != 0){
			
			arm = sc%10;
			sum = sum + arm*arm*arm;
			sc = sc/10;		
		}		
			if (sum==num)
		System.out.println("This is Armstrong number"+ num);
		if (sum!=num)
		System.out.println("This is not Armstrong number" + num);
	}
	
}
