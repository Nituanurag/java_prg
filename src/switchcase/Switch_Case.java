package switchcase;

public class Switch_Case {

	public static void main(String[] args)
	{
		int a = 10;
		int b = 8;
		int c = a-b;
		
		
		switch(c) {
			case 1:
				System.out.println("The value of c is 1");
			break;
			case 2:
				System.out.println("The value of c is 2");
				break;
			case 3:
				System.out.println("The value of c is 3");
				break ;
				default :
					System.out.println("The value of c is out of range");
					break;
					
					
			}
		}

}
