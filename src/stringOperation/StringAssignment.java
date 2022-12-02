package stringOperation;

public class StringAssignment {

	public static void main(String[] args) {
		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";	
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
		if (a.length() > c.length() && c.length() < b.length())
		{
		
		System.out.println("B is the greater no : "+b.length());
		}
		if (a.length() != c.length() && c.length() != b.length())
		{
		
		System.out.println("All are not equal");
		}
		System.out.println(b.toUpperCase()+" " + b.contains("z")); 
		
		System.out.println("Constains: ");
		System.out.println(a.contains("xy"));
		System.out.println(a.contains("cd"));
		System.out.println(c.equalsIgnoreCase(a));
		}
	}


