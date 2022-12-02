package assignments;
import java.util.Scanner;

public class ReverseName {

	public static void main(String[] args) {
		
		String str, nstr=" ";
        char ch ;
       
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the name : ");
		str = obj.next();
		
        for (int i=0; i<str.length(); i++)
        {
          ch= str.charAt(i); 
          nstr= ch+nstr; 
        }
        System.out.println("Reversed word: "+ nstr);
		
		}
		 
	}




