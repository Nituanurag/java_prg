package numpyNinjaProject;

import java.util.Scanner;

public class Primenumber {

	int i   = 0;
	int num = 0;
   String totalPrime = " ";
	
public void prime() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number for prime number : ");
	int num= scan.nextInt();
	
	for (int i=1; i<=num;i++) {
		
		int prime =0 ;
		
		for(int j = i; j>=1; j--) {
			
			if(i%j==0) {
				
				prime = prime+1;
			}
		}
			if (prime==2) {
				
				totalPrime = totalPrime +i +" " ;
			}
	     }
			System.out.println(totalPrime);	
}	

	public static void main(String[] args) {
		Primenumber  obj = new Primenumber ();
		obj.prime();
	}
}
