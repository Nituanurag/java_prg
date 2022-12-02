package assignments;

import java.util.Scanner;

public class Count0and1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers : ");
		Scanner obj = new Scanner(System.in);
		int ch = obj.nextInt();
		
		int c0=0; int c1=0; int rem=0;
		int num =ch; int i=0;

while(ch != 0) {
	
			
	rem = ch %10;
	if (rem ==0)
		c0 = c0+1;
	if (rem ==1)
		c1 = c1+1;
	ch = ch/10;
	
}
System.out.println("Total 0 in this series are : "+c0);
System.out.println("Total 1 in this series are : "+c1);
	}

}
