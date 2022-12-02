package numpyNinjaProject;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Enter the number between 1 to 7  : ");
		 Scanner scan = new Scanner(System.in);
		 int num = scan.nextInt();
		 
		switch (num){
		case 1:
			System.out.println("This is Sunday");	
			break;
		case 2:
			System.out.println("This is Monday");
			break;
		case 3:
			System.out.println("This is Tuesday");
			break;
		case 4:
			System.out.println("This is Wednesday");
			break;
		case 5:
			System.out.println("This is Thursday");
			break;
		case 6:
			System.out.println("This is Friday");
			break;
		case 7:
			System.out.println("This is Saturday");
			break;
		default:
			System.out.println("Invalid number");
		}
	}

}
