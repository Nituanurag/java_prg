package stringOperation;

public class AssignmentTwo {

	public static void main(String[] args) {
		String a = "abcd";
		String b = "xyz";
		String c = "abcd xyz klmn 1234 567";
		
		if (a.length() > b.length() && b.length() < c.length())
		{
			System.out.println("C is the greater no : "+c.length());
		}

		String name = a.concat(b);
		System.out.println(name);
		System.out.println(name.length() < c.length() && name.length() > 5);
		System.out.println("a and b is less than c and greter than 5 ");
		
		System.out.println(a.startsWith("ab"));
		System.out.println(b.replace("yz", "dc")); 
		System.out.println(c.trim()); 
		System.out.println(c.charAt(7)); 
		System.out.println(c.replace("m", "k"));
		
		/*multiple sub strings and print strings */
		
		String[] x = c.split(" ");
		int i;
		for(i = 0; i<x.length; i++)
		{
			System.out.println(x[i]);

	
}
	}
	

}
