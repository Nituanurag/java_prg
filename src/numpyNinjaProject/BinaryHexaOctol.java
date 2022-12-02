package numpyNinjaProject;

import java.util.Scanner;

public class BinaryHexaOctol {
	int num ;
	//String binary;
	//String octal;
	//String hexa;
	public void convert() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to change in the following : ");
		//System.out.println("Please selet the option");		
		//System.out.println("1.Binary"+"\n"+"2.Octal"+"\n"+"3.Hexadecimal"+"\n");
		int num= Integer.parseInt(scan.nextLine());
		
				
		
			String binary = Integer.toBinaryString(num);
			System.out.println("Binary value of decimal no "+num+" is   : "+binary);
			
			String octal = Integer.toOctalString(num);
			System.out.println("Octal value of decimal no "+num+" is    : "+octal);
			
			String hexa = Integer.toHexString(num);
			System.out.println("Hexadecimal value of decimal no "+num+" is: "+hexa);
		
			}

	public static void main(String[] args) {
		
		BinaryHexaOctol obj = new BinaryHexaOctol();
		obj.convert();
	}

}
