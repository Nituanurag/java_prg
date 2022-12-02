package scannerPrg;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=obj.nextInt();
		System.out.println("Enter the number:");
		int num1=obj.nextInt();
		
		int num3 = num+num1;
		System.out.println("Addition of : "+num+" and "+num1 +" = "+num3);
	}

}
