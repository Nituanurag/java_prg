package assignments;

import java.util.Scanner;

public class SumOfdigit {

	public static void main(String[] args) {
		int num =0; int sum = 0; int res = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the digits : ");
		num = obj.nextInt();
		
		while(num !=0){
			res = num % 10;
			sum = sum + res;
			num = num / 10;
			//System.out.println("sum = "+res);
		}
		System.out.println("Sum of digits = "+sum);
	}

}
