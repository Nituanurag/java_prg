package stringOperation;

public class StringExample {

	public static void main(String[] args) {
		
		String a = "Bellevue";
		String b = "Redmond";
		String c = "BELLEVUE";
		
		System.out.println(a.length()); //Return type - integer
		System.out.println(a.startsWith("B")); //Return type - String
		System.out.println(a.endsWith("E"));   //Return type - String
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println("Bellevue is equal to Redmond :" +a.equals(b)); //Return type - boolean
		System.out.println("Bellevue is equal to BELLEVUE :" +a.equals(c));
		System.out.println("Bellevue is equal to BELLEVUE :" +a.equalsIgnoreCase(c)); //boolean
		System.out.println("Concatinating two strings : " +a.concat(b)); //String
		System.out.println("Concatenating more then two string :" +a.concat(b)+ a.concat(c) + b);
		System.out.println("Finding the letter in Bellevue :" +a.contains("ll"));
		System.out.println("Bellevue :" +a.charAt(5)); //char - string
		System.out.println("Bellevue  :" +a.indexOf("e"));
		System.out.println("Bellevue (Replace the char) :" +a.replace("ll","pp" ));
		System.out.println("Replace Bellevue with :" +a.replace("Bellevue","SFO"));
		
		String z = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ 1111 1234 Tomy Lary");
		String[] x = z.split(" ");
		int i;
		System.out.println("Spliting the sentance : ABCDEFGHIJKLMNOPQRSTUVWXYZ 1111 1234 Tomy Lary");
		for(i = 0; i<x.length; i++)
		//for(i=x.length-1; i<=0;i--)
			System.out.println(x[i]);
	}

}

/*output: true
false
BELLEVUE
bellevue
Bellevue is equal to Redmond :false
Bellevue is equal to BELLEVUE :false
Bellevue is equal to BELLEVUE :true
Concatinating two strings : BellevueRedmond
Concatenating more then two string :BellevueRedmondBellevueBELLEVUERedmond
Finding the letter in Bellevue :true
Bellevue :v
Bellevue  :1
Bellevue (Replace the char) :Beppevue
Replace Bellevue with :SFO
Spliting the sentance : ABCDEFGHIJKLMNOPQRSTUVWXYZ 1111 1234 Tomy Lary
ABCDEFGHIJKLMNOPQRSTUVWXYZ
1111
1234
Tomy
Lary
*/
