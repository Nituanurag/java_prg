package numpyNinjaProject;

import java.util.Scanner;

public class FebonacciSeries {
	
	public void Febonacci() {
		int num = 0;
		int num1 = 0;
		int num2 = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for febonacci series");
		int ch= scan.nextInt();
		
		System.out.println("Febonacci series of "+ch+ "is "+"\n");
		
		for(int i =1; i<=ch;i++) {
			System.out.println(num+"  ");
			
			num  = num1+num2;
			num1 = num2;
			num2 = num;
		}
	}

	public static void main(String[] args) {
		
		FebonacciSeries obj = new FebonacciSeries();
		obj.Febonacci();
	}

}
