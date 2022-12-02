package assignments;

import java.util.Scanner;

public class FebonacciNunber {

public static void main(String[] args) {
	int num=0;
	int num1=0;
	int num2=1;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number :");
	
	int ch = scan.nextInt();
	System.out.println("Febonacci series of "+ch+"is"+"\n");
	
	for(int i =1;i<=ch;i++) {
		
		System.out.println(num+"  ");
		num = num1+num2;
		num1 = num2;
		num2 = num;
	}
	
	}


}
