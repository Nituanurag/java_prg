package ifprg;

public class NestedIf {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		System.out.println("A = : " +a);
		System.out.println("B = : " +b);
		System.out.println("C = : " +c);
		System.out.println("D = : " +d);
		
		if (a>b && a>c && a>d) 
		{
			System.out.println("A is greter : " +a);
		}
			else if (b>a && b>c && b>d)
			{
				System.out.println("B is greter : " +b);
			}
			else if (c>a && c>b && c>d) 
			{
				System.out.println("C is greter : " +c);
			}
		
			else
			{
				System.out.println("D is greter : " +d);
			}
}
}
