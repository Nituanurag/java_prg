package assignments;

import java.util.Scanner;

public class DuplicateLetter {

	public static void main(String[] args) {
		String str;
        		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string : ");
		str = obj.next();
		
		char[] carry= str.toCharArray();
		System.out.println("Duplicate character in the given string are : ");
		
        for (int i=0; i<str.length(); i++)
        {
        	for(int j = i + 1; j<str.length();j++) {
        		if(carry[i] == carry[j]) {
        			System.out.print(carry[j]+ " ");
        			break;
        		}
        		        			
        	}
        
        }
      
	}

}
